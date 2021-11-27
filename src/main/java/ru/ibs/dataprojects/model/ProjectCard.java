package ru.ibs.dataprojects.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

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
    private Long cardId;
    private LocalDate dateOfCardCreation;
    private String customerOfTheProject;
    private String projectName;
    @OneToOne(cascade = CascadeType.ALL)
    private TypeProject typeProject;
    private String functionalDirection;
    private String subjectAreaOfTheProject;
    private String projectDescription;
    private String tasksOfTheProject;
    private ApplicationProjectStage applicationProjectStage;
    private LocalDate projectCompletionDate;
    private String technologiesUsed;
    @OneToOne(cascade = CascadeType.ALL)
    private TypeOfDevelopment typeOfDevelopment;
    private String teamDescription;
    @OneToOne(cascade = CascadeType.ALL)
    private Location location;
    private LocalDate dateOfwithdrawalOfPeopleToTheProject;
    @OneToOne(cascade = CascadeType.ALL)
    private Overtime overtime;
    private String withdrawalProcedure;
    @OneToOne(cascade = CascadeType.ALL)
    private GOSTdocumentation gosTdocumentation;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserProject userProject;
}
