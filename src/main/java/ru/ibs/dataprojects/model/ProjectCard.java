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
import java.time.LocalDateTime;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    private LocalDateTime dateOfCardCreation;
    private String customerOfTheProject;
    private String projectName;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeProject typeProject;
    private String functionalDirection;
    private String subjectAreaOfTheProject;
    private String projectDescription;
    private String tasksOfTheProject;
    private String stageProject;
    private LocalDate projectCompletionDate;
    private String technologiesUsed;
    private String deveolpmentMethodology;

    @OneToOne(cascade = CascadeType.ALL)
    private TypeOfDevelopment typeOfDevelopment;
    private String teamDescription;

    @OneToOne(cascade = CascadeType.ALL)
    private Location location;
    private String shedule;
    private boolean isOvertimeAvailability;
    private LocalDate dateOfwithdrawalOfPeopleToTheProject;
    private String withdrawalProcedure;
    private boolean isTheNeedToMaintainDocumentationInAccordanceWithGOST;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id")
//    private UserProject userProject;
}
