package ru.ibs.dataprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

/**
 * @author Timur Khidirov on 26.11.2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserProject {
    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String role;
    private String phoneNumber;
    @OneToMany(
            mappedBy = "userProject",
            orphanRemoval = true,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<ProjectCard> projectCards;
}
