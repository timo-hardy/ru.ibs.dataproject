package ru.ibs.recruiterhappiness.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ibs.recruiterhappiness.model.ProjectCard;
import ru.ibs.recruiterhappiness.repository.ProjectCardRepository;
import ru.ibs.recruiterhappiness.service.ProjectCardService;

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
}
