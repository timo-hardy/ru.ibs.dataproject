package ru.ibs.dataprojects.service.impl;

import lombok.RequiredArgsConstructor;
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
    public List<UserProject> findAll() {
       return userRepository.findAll();
    }

    @Override
    public void add(UserProject userProject) {
        userRepository.save(userProject);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
