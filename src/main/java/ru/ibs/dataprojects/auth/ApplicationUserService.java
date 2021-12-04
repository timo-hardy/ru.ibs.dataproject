package ru.ibs.dataprojects.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Timur Khidirov on 02.12.2021
 */
@RequiredArgsConstructor
@Service
public class ApplicationUserService implements UserDetailsService {

    @Qualifier("fake")
    private final ApplicationUserDao applicationUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return applicationUserDao.selectUserFromDbByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
