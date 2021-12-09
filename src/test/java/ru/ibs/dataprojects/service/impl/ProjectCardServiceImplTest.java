package ru.ibs.dataprojects.service.impl;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import ru.ibs.dataprojects.model.Location;
import ru.ibs.dataprojects.model.ProjectCard;
import ru.ibs.dataprojects.model.TypeOfDevelopment;
import ru.ibs.dataprojects.model.TypeProject;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Timur Khidirov on 09.12.2021
 */

class ProjectCardServiceImplTest {
    @Autowired
    private ProjectCardServiceImpl projectCardService;

//    @BeforeEach
//    void setUp() {
//        projectCardService = new ProjectCardServiceImpl(
////                new ProjectCard(
////                        1L,
////                        "status",
////                        LocalDateTime.of(2021, 12, 3, 12, 34, 15),
////                        "Apple",
////                        "OS",
////                        new TypeProject(
////                                1L,
////                                true,
////                                true,
////                                true,
////                                true,
////                                true,
////                                true,
////                                true,
////                                true
////                        ),
////                        "sdfsf",
////                        "sdfsfs",
////                        "sdfsdfsd",
////                        "sdfsdfsdf",
////                        "dsfsdfsdf",
////                        LocalDate.of(2022, 03, 22),
////                        "sdfsdffsd",
////                        "sdfsdfsdf",
////                        new TypeOfDevelopment(
////                                1L,
////                                true,
////                                true
////                        ),
////                        "Sfsdfsdf",
////                        new Location(1L, true, true, "Address"),
////                        "fsdlfsdfds",
////                        true,
////                        LocalDate.of(2022, 05, 07),
////                        "asdfsadf",
////                        true
////                )
//        );
//    }

    @Test
    void findByCardId() {
    }

    @Test
    void findAll() {
    }

    @Test
    void add() {
    }

    @Test
    void delete() {
    }
}