package ru.ibs.dataprojects.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
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
    private final UserRepository userRepository;

    public List<User> findAll() {
       return userRepository.findAll();
    }

    public void add (User user) {
        userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
