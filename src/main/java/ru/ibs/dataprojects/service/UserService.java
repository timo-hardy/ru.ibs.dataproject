package ru.ibs.dataprojects.service;

import ru.ibs.dataprojects.model.UserProject;

import java.util.List;

/**
 * @author Timur Khidirov on 07.12.2021
 */
public interface UserService {
    void create(String username, String password, String role);

    List<UserProject> findAll();

    UserProject findById(long id);

    void delete(Long id);
}
