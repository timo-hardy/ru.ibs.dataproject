package ru.ibs.recruiterhappiness.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ibs.recruiterhappiness.model.ProjectCard;
import ru.ibs.recruiterhappiness.repository.ProjectCardRepository;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@Service
@RequiredArgsConstructor
public class ProjectCardService {
    private final ProjectCardRepository projectCardRepository;

    public List<ProjectCard> findAll() {
        return projectCardRepository.findAll();
    }

    public void add(ProjectCard projectCard) {
        projectCardRepository.save(projectCard);
    }

    public void delete(long id) {
        projectCardRepository.deleteById(id);
    }
}
