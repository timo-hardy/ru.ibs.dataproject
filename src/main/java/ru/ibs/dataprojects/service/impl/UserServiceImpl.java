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
public class UserServiceImpl implements ru.ibs.dataprojects.service.UserService {
    private final UserRepository userRepository;

    @Override
    public void create(String username, String password, String role) {
        final User user = new User(username, password, role);
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
