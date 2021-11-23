package ru.ibs.recruiterhappiness.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ibs.recruiterhappiness.model.ProjectCard;
import ru.ibs.recruiterhappiness.service.ProjectCardService;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/card")
public class ProjectCardController {
    private final ProjectCardService projectCardService;

    @GetMapping("read")
    public List<ProjectCard> getAll() {
        return projectCardService.findAll();
    }

    @RequestMapping("create")
    public void add(@RequestBody ProjectCard projectCard) {
        projectCardService.add(projectCard);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        projectCardService.delete(id);
    }
}
