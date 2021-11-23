package ru.ibs.recruiterhappiness.service;

import ru.ibs.recruiterhappiness.model.ProjectCard;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
public interface ProjectCardService {
    List<ProjectCard> findAll();

    void add(ProjectCard projectCard);

    void delete(long id);
}
