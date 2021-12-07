package ru.ibs.dataprojects.service;

import ru.ibs.dataprojects.model.User;

import java.util.List;

/**
 * @author Timur Khidirov on 07.12.2021
 */
public interface UserService {
    void create(String username, String password, String role);

    List<User> findAll();

    User findById(long id);

    void delete(Long id);
}
