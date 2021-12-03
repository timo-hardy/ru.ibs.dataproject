package ru.ibs.dataprojects.auth;

import java.util.Optional;
/**
 * @author Timur Khidirov on 02.12.2021
 */
public interface ApplicationUserDao {

    Optional<ApplicationUser> selectUserFromDbByUserName(String username);
}
