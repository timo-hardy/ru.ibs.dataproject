package ru.ibs.dataprojects.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibs.dataprojects.model.Role;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findByName(String name);
}
