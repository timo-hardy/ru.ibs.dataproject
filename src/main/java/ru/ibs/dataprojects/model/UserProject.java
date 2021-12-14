package ru.ibs.dataprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Timur Khidirov on 03.11.2021
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;

    public UserProject(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String toString() {
        return String.join(" ", username, password, role);
    }
}
