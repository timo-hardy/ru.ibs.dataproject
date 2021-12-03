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

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/read")
    public List<ProjectCard> getAll() {
        return projectCardService.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/create")
    public void add(@RequestBody ProjectCard projectCard) {
        projectCardService.add(projectCard);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        projectCardService.delete(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortByOrderByProjectNameAsc")
    public List<ProjectCard> sortByOrderByProjectNameAsc() {
        return projectCardService.sortByProjectNameAsc();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortByOrderByProjectNameDesc")
    public List<ProjectCard> sortByOrderByProjectNameDesc() {
        return projectCardService.sortByProjectNameDesc();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortBySubjectAreaOfTheProjectAsc")
    public List<ProjectCard> sortBySubjectAreaOfTheProjectAsc() {
        return projectCardService.sortBySubjectAreaOfTheProjectAsc();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortBySubjectAreaOfTheProjectDesc")
    public List<ProjectCard> sortBySubjectAreaOfTheProjectDesc() {
        return projectCardService.sortBySubjectAreaOfTheProjectDesc();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortByCustomerOfTheProjectAsc")
    public List<ProjectCard> sortByCustomerOfTheProjectAsc() {
        return projectCardService.sortByCustomerOfTheProjectAsc();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortByCustomerOfTheProjectDesc")
    public List<ProjectCard> sortByCustomerOfTheProjectDesc() {
        return projectCardService.sortByCustomerOfTheProjectDesc();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortByDateOfCardCreationAsc")
    public List<ProjectCard> sortByDateOfCardCreationAsc() {
        return projectCardService.sortByDateOfCardCreationAsc();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/sortByDateOfCardCreationDesc")
    public List<ProjectCard> sortByDateOfCardCreationDesc() {
        return projectCardService.sortByDateOfCardCreationDesc();
    }
}
