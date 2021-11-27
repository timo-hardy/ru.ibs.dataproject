package ru.ibs.dataprojects.service;

import ru.ibs.dataprojects.model.UserProject;

import java.util.List;

/**
 * @author Timur Khidirov on 26.11.2021
 */
public interface UserService {
    List<UserProject> findAll();

    void add(UserProject userProject);

    void delete(Long id);
}
