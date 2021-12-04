package ru.ibs.dataprojects.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.ibs.dataprojects.config.ApplicationUserRole;
import ru.ibs.dataprojects.model.User;
import ru.ibs.dataprojects.service.impl.UserServiceImpl;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static ru.ibs.dataprojects.config.ApplicationUserRole.MANAGER;
import static ru.ibs.dataprojects.config.ApplicationUserRole.USER;


/**
 * @author Timur Khidirov on 02.12.2021
 */
@RequiredArgsConstructor
@Service("fake")
public class ApplicationUserDbDao implements ApplicationUserDao {

    private final UserServiceImpl userService;
    private final PasswordEncoder passwordEncoder;

    @PostConstruct
    private void postConstruct() {

        userService.create("timo", "123", "MANAGER");
        userService.create("vasya", "1234", "USER");
//        userService.createUser("henry", "password123", "MANAGER");
//        userService.createUser("emma", "password123", "TRAINEE");
//        userService.createUser("Boris", "password", "SCRUM_MASTER");
    }

    @Override
    public Optional<ApplicationUser> selectUserFromDbByUserName(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        List<User> userEntities = userService.findAll();
        List<ApplicationUser> applicationUsers = userEntities
                .stream()
                .map(x -> new ApplicationUser(
                        x.getUsername(),
                        passwordEncoder.encode(x.getPassword()),
                        ApplicationUserRole.valueOf(x.getRole()).getAuthorities(),
                        true,
                        true,
                        true,
                        true
                ))
                .collect(Collectors.toList());
        return applicationUsers;
    }
}