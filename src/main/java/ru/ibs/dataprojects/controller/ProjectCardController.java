package ru.ibs.dataprojects.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.ibs.dataprojects.model.ProjectCard;
import ru.ibs.dataprojects.service.ProjectCardService;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/card")
public class ProjectCardController {
    private final ProjectCardService projectCardService;

    @GetMapping("/readById/{id}")
    public List<ProjectCard> getById(long id) {
        return projectCardService.findByCardId(id);
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/read")
    public List<ProjectCard> getAll() {
        return projectCardService.findAll();
    }

//    @PreAuthorize("hasRole('MANAGER')")
    @RequestMapping("/create")
    public void create(@RequestBody ProjectCard projectCard) {
        projectCardService.add(projectCard);
    }

//    @PreAuthorize("hasRole('MANAGER')")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        projectCardService.delete(id);
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortByOrderByProjectNameAsc")
    public List<ProjectCard> sortByOrderByProjectNameAsc() {
        return projectCardService.sortByProjectNameAsc();
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortByOrderByProjectNameDesc")
    public List<ProjectCard> sortByOrderByProjectNameDesc() {
        return projectCardService.sortByProjectNameDesc();
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortBySubjectAreaOfTheProjectAsc")
    public List<ProjectCard> sortBySubjectAreaOfTheProjectAsc() {
        return projectCardService.sortBySubjectAreaOfTheProjectAsc();
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortBySubjectAreaOfTheProjectDesc")
    public List<ProjectCard> sortBySubjectAreaOfTheProjectDesc() {
        return projectCardService.sortBySubjectAreaOfTheProjectDesc();
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortByCustomerOfTheProjectAsc")
    public List<ProjectCard> sortByCustomerOfTheProjectAsc() {
        return projectCardService.sortByCustomerOfTheProjectAsc();
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortByCustomerOfTheProjectDesc")
    public List<ProjectCard> sortByCustomerOfTheProjectDesc() {
        return projectCardService.sortByCustomerOfTheProjectDesc();
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortByDateOfCardCreationAsc")
    public List<ProjectCard> sortByDateOfCardCreationAsc() {
        return projectCardService.sortByDateOfCardCreationAsc();
    }

//    @PreAuthorize("hasAnyRole('MANAGER', 'USER')")
    @GetMapping("/sortByDateOfCardCreationDesc")
    public List<ProjectCard> sortByDateOfCardCreationDesc() {
        return projectCardService.sortByDateOfCardCreationDesc();
    }
}
