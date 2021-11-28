package ru.ibs.dataprojects.service.impl;

import io.swagger.models.auth.In;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import ru.ibs.dataprojects.model.ProjectCard;
import ru.ibs.dataprojects.model.UserProject;
import ru.ibs.dataprojects.repository.ProjectCardRepository;
import ru.ibs.dataprojects.service.ProjectCardService;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@Service
@RequiredArgsConstructor
public class ProjectCardServiceImpl implements ProjectCardService {
    private final ProjectCardRepository projectCardRepository;

    @Override
    public List<ProjectCard> findAll() {
        return projectCardRepository.findAll();
    }

    @Override
    public void add(ProjectCard projectCard) {
        projectCardRepository.save(projectCard);
    }

    @Override
    public void delete(long id) {
        projectCardRepository.deleteById(id);
    }

    @Override
    public List<ProjectCard> sortByProjectNameAsc() {
        return projectCardRepository.findByOrderByProjectNameAsc();
    }

    @Override
    public List<ProjectCard> sortByProjectNameDesc() {
        return projectCardRepository.findByOrderByProjectNameDesc();
    }

    @Override
    public List<ProjectCard> sortBySubjectAreaOfTheProjectAsc() {
        return projectCardRepository.findByOrderBySubjectAreaOfTheProjectAsc();
    }

    @Override
    public List<ProjectCard> sortBySubjectAreaOfTheProjectDesc() {
        return projectCardRepository.findByOrderBySubjectAreaOfTheProjectDesc();
    }

    @Override
    public List<ProjectCard> sortByCustomerOfTheProjectAsc() {
        return projectCardRepository.findByOrderByCustomerOfTheProjectAsc();
    }

    @Override
    public List<ProjectCard> sortByCustomerOfTheProjectDesc() {
        return projectCardRepository.findByOrderByCustomerOfTheProjectDesc();
    }

    @Override
    public List<ProjectCard> sortByDateOfCardCreationAsc() {
        return projectCardRepository.findByOrderByDateOfCardCreationAsc();
    }

    @Override
    public List<ProjectCard> sortByDateOfCardCreationDesc() {
        return projectCardRepository.findByOrderByDateOfCardCreationDesc();
    }

    @Override
    public List<ProjectCard> filterByCustomerName(String name) {
        return projectCardRepository.findAllByCustomerOfTheProjectContainsIgnoreCase(name);
    }

    @Override
    public List<ProjectCard> findAllByUserProject(UserProject userProject) {
        return projectCardRepository.findAllByUserProject(userProject);
    }
}
