package ru.ibs.dataprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;
    private String author;
    private String status;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate dateOfCardCreation;
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
