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