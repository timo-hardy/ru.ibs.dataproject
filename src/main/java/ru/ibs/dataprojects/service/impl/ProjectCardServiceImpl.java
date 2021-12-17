package ru.ibs.dataprojects.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ibs.dataprojects.exception.NotFoundException;
import ru.ibs.dataprojects.model.ProjectCard;
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

    //Поиск по id карточки
    @Override
    public List<ProjectCard> findByCardId(long id) {
        if (!projectCardRepository.existsById(id)) {
            throw new NotFoundException();
        }
        return projectCardRepository.findByCardId(id);
    }

    //Найти все карточки
    @Override
    public List<ProjectCard> findAll() {
        if (projectCardRepository.findAll().isEmpty()) {
            throw new NotFoundException();
        }
        return projectCardRepository.findAll();
    }

    //Создать, обновить новую карточку
    @Override
    public void add(ProjectCard projectCard) {
        projectCardRepository.save(projectCard);
    }

    //Удалить карточку по id
    @Override
    public void delete(long id) {
        try {
            projectCardRepository.deleteById(id);
        } catch (Exception e) {
            throw new NotFoundException();
        }
    }

    //Сортировка по имени проекта по возростанию
    @Override
    public List<ProjectCard> sortByProjectNameAsc() {
        return projectCardRepository.findByOrderByProjectNameAsc();
    }

    //Сортировка по имени проекта по убыванию
    @Override
    public List<ProjectCard> sortByProjectNameDesc() {
        return projectCardRepository.findByOrderByProjectNameDesc();
    }

    //Сортировка по предметной области проекта по возрастанию
    @Override
    public List<ProjectCard> sortBySubjectAreaOfTheProjectAsc() {
        return projectCardRepository.findByOrderBySubjectAreaOfTheProjectAsc();
    }

    //Сортировка по предметной области проекта по убыванию
    @Override
    public List<ProjectCard> sortBySubjectAreaOfTheProjectDesc() {
        return projectCardRepository.findByOrderBySubjectAreaOfTheProjectDesc();
    }

    //Сортировка по заказчику проекта по возрастанию
    @Override
    public List<ProjectCard> sortByCustomerOfTheProjectAsc() {
        return projectCardRepository.findByOrderByCustomerOfTheProjectAsc();
    }

    //Сортировка по заказчику проекта по убыванию
    @Override
    public List<ProjectCard> sortByCustomerOfTheProjectDesc() {
        return projectCardRepository.findByOrderByCustomerOfTheProjectDesc();
    }

    //Сортировка по дате создания проекта по возрастанию
    @Override
    public List<ProjectCard> sortByDateOfCardCreationAsc() {
        return projectCardRepository.findByOrderByDateOfCardCreationAsc();
    }

    //Сортировка по дате создания проекта по убыванию
    @Override
    public List<ProjectCard> sortByDateOfCardCreationDesc() {
        return projectCardRepository.findByOrderByDateOfCardCreationDesc();
    }
}
