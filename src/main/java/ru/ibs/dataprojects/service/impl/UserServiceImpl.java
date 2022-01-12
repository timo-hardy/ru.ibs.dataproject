package ru.ibs.dataprojects.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.dataprojects.model.UserProject;
import ru.ibs.dataprojects.repository.UserRepository;
import ru.ibs.dataprojects.service.UserService;

import java.util.List;

/**
 * @author Timur Khidirov on 26.11.2021
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void create(String username, String password, String role) {
        final UserProject userProject = new UserProject(username, password, role);
        userRepository.save(userProject);
    }

    @Override
    public List<UserProject> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserProject findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
