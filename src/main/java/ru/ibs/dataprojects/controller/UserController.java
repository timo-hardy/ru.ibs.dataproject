package ru.ibs.dataprojects.controller;//package ru.ibs.dataprojects.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//import ru.ibs.dataprojects.service.impl.UserServiceImpl;
//import ru.ibs.dataprojects.model.ApplicationUser;
//
//import java.util.List;

//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import ru.ibs.dataprojects.model.Role;
//import ru.ibs.dataprojects.model.User;
//import ru.ibs.dataprojects.service.impl.UserServiceImpl;
//
//import java.util.Collections;
//
///**
// * @author Timur Khidirov on 26.11.2021
// */
//@RestController
//@RequestMapping("/registration")
//@RequiredArgsConstructor
//public class UserController {
//    private final UserServiceImpl userServiceImpl;
//
//    @GetMapping()
//    public void createAdmin(@RequestBody User user) {
//        userServiceImpl.loadUserByUsername(user.getUsername());
//    }
//    @GetMapping("/read")
//    public List<User> getAll() {
//        return userServiceImpl.findAll();
//    }
//
//    @RequestMapping("/create")
//    public void add(@RequestBody ApplicationUser applicationUser) {
//        userServiceImpl.add(applicationUser);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable Long id) {
//        userServiceImpl.delete(id);
//    }
//}
