package ru.ibs.dataprojects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.dataprojects.model.User;

import java.util.List;

/**
 * @author Timur Khidirov on 26.11.2021
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String name);
}
