package ru.ibs.dataprojects.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

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
    private String customerOfTheProject;
    private String projectName;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeProject typeProject;

    private String functionalDirection;
    private String subjectAreaOfTheProject;
    private String projectDescription;
    private String tasksOfTheProject;

    private ApplicationProjectStage applicationProjectStage;

}
