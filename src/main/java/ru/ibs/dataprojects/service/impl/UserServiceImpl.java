package ru.ibs.dataprojects.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ibs.dataprojects.model.User;
import ru.ibs.dataprojects.repository.UserRepository;

import java.util.List;

/**
 * @author Timur Khidirov on 26.11.2021
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    //    private final ApplicationUserDao applicationUserDao;
    private final UserRepository userRepository;

    public void create(String username, String password, String role) {
        final User user = new User(username, password, role);
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findById(id);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }


//    private final RoleRepository roleRepository;
//    private final PasswordEncoder passwordEncoder;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return user;
//    }


//    private void getApplicationUsers() {
//        if (roleRepository.findByName("ADMIN") == null) {
//            roleRepository.save(new Role(1L, "ADMIN"));
//        }
//        if (roleRepository.findByName("RECRUITER") == null) {
//            roleRepository.save(new Role(2L, "RECRUITER"));
//        }
//        if (roleRepository.findByName("USER") == null) {
//            roleRepository.save(new Role(3L, "USER"));
//        }

//        if (userRepository.findByUsername("oliver") == null) {
//            userRepository.save(new User(
//                    null,
//                    "oliver",
//                    passwordEncoder.encode("password"),
//                    Collections.singleton(new Role(1L, "ADMIN"))
//            ));
//        }
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


//    }
}
