package ru.ibs.dataprojects.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ibs.dataprojects.model.UserProject;
import ru.ibs.dataprojects.service.UserService;

import java.util.List;

/**
 * @author Timur Khidirov on 26.11.2021
 */
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/read")
    public List<UserProject> getAll() {
        return userService.findAll();
    }

    @RequestMapping("/create")
    public void add(@RequestBody UserProject userProject) {
        userService.add(userProject);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
