package ru.ibs.dataprojects.service;

import org.apache.catalina.User;
import ru.ibs.dataprojects.model.ProjectCard;
import ru.ibs.dataprojects.model.UserProject;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
public interface ProjectCardService {
    List<ProjectCard> findAll();

    void add(ProjectCard projectCard);

    void delete(long id);

    List<ProjectCard> sortByProjectNameAsc();

    List<ProjectCard> sortByProjectNameDesc();

    List<ProjectCard> sortBySubjectAreaOfTheProjectAsc();

    List<ProjectCard> sortBySubjectAreaOfTheProjectDesc();

    List<ProjectCard> sortByCustomerOfTheProjectAsc();

    List<ProjectCard> sortByCustomerOfTheProjectDesc();

    List<ProjectCard> sortByDateOfCardCreationAsc();

    List<ProjectCard> sortByDateOfCardCreationDesc();

    List<ProjectCard> filterByCustomerName(String name);

    List<ProjectCard> findAllByUserProject(UserProject userProject);
}
