package ru.ibs.dataprojects.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.ibs.dataprojects.model.Role;
import ru.ibs.dataprojects.model.User;
import ru.ibs.dataprojects.repository.RoleRepository;
import ru.ibs.dataprojects.repository.UserRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Timur Khidirov on 26.11.2021
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserDetailsService {
    //    private final ApplicationUserDao applicationUserDao;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

//    public void create(User user) {
//        userRepository.save(user);
//    }
//
//    public void delete(long id) {
//        userRepository.deleteById(id);
//    }


    private void getApplicationUsers() {
        if (roleRepository.findByName("ADMIN") == null) {
            roleRepository.save(new Role(1L, "ADMIN"));
        }
//        if (roleRepository.findByName("RECRUITER") == null) {
//            roleRepository.save(new Role(2L, "RECRUITER"));
//        }
//        if (roleRepository.findByName("USER") == null) {
//            roleRepository.save(new Role(3L, "USER"));
//        }

        if (userRepository.findByUsername("oliver") == null) {
            userRepository.save(new User(
                    null,
                    "oliver",
                    passwordEncoder.encode("password"),
                    Collections.singleton(new Role(1L, "ADMIN"))
            ));
        }
//    }


//    private List<ApplicationUser> getApplicationUsers() {
//        return Lists.newArrayList(
//                new ApplicationUser(
//                        "Timur",
//                        passwordEncoder.encode("password"),
//                        "Khidirov",
//                        "Boboevich",
//                        "timos.gooogle@gmail.com",
//                        "Employee",
//                        "89253000106",
//                        EMPLOYEE.getAuthorities(),
//                        true,
//                        true,
//                        true,
//                        true
//                )
//        );
//    }


//    public List<User> findAll() {
//        return userRepository.findAll();
//    }


//    public void add(ApplicationUser applicationUser) {
//        userRepository.save(applicationUser);
//    }
//    public void delete(Long id) {
//        userRepository.deleteById(id);
//    }
    }
}
