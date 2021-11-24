package ru.ibs.dataprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectCard {
    @Id
    @GeneratedValue
    private long cardId;
    private String customer;
    private String projectName;
    private TypeProject typeProject;
    private String functionalDirection;
    private String subjectAreaOfTheProject;
    private String projectDescription;
    private String tasksOfTheProject;
}
