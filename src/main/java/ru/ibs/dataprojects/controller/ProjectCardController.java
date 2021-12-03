package ru.ibs.dataprojects.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.ibs.dataprojects.model.ProjectCard;
import ru.ibs.dataprojects.service.ProjectCardService;
import ru.ibs.dataprojects.service.impl.UserServiceImpl;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/card")
public class ProjectCardController {
    private final ProjectCardService projectCardService;

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/read")
    public List<ProjectCard> getAll() {
        return projectCardService.findAll();
    }

    @PreAuthorize("hasRole('MANAGER')")
    @RequestMapping("/create")
    public void add(@RequestBody ProjectCard projectCard) {
        projectCardService.add(projectCard);
    }

    @PreAuthorize("hasRole('MANAGER')")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        projectCardService.delete(id);
    }

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/sortByOrderByProjectNameAsc")
    public List<ProjectCard> sortByOrderByProjectNameAsc() {
        return projectCardService.sortByProjectNameAsc();
    }

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/sortByOrderByProjectNameDesc")
    public List<ProjectCard> sortByOrderByProjectNameDesc() {
        return projectCardService.sortByProjectNameDesc();
    }

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/sortBySubjectAreaOfTheProjectAsc")
    public List<ProjectCard> sortBySubjectAreaOfTheProjectAsc() {
        return projectCardService.sortBySubjectAreaOfTheProjectAsc();
    }

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/sortBySubjectAreaOfTheProjectDesc")
    public List<ProjectCard> sortBySubjectAreaOfTheProjectDesc() {
        return projectCardService.sortBySubjectAreaOfTheProjectDesc();
    }

    @PreAuthorize("hasRole('MAANGER')")
    @GetMapping("/sortByCustomerOfTheProjectAsc")
    public List<ProjectCard> sortByCustomerOfTheProjectAsc() {
        return projectCardService.sortByCustomerOfTheProjectAsc();
    }

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/sortByCustomerOfTheProjectDesc")
    public List<ProjectCard> sortByCustomerOfTheProjectDesc() {
        return projectCardService.sortByCustomerOfTheProjectDesc();
    }

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/sortByDateOfCardCreationAsc")
    public List<ProjectCard> sortByDateOfCardCreationAsc() {
        return projectCardService.sortByDateOfCardCreationAsc();
    }

    @PreAuthorize("hasRole('MANAGER')")
    @GetMapping("/sortByDateOfCardCreationDesc")
    public List<ProjectCard> sortByDateOfCardCreationDesc() {
        return projectCardService.sortByDateOfCardCreationDesc();
    }
}
