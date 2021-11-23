package ru.ibs.recruiterhappiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.recruiterhappiness.model.ProjectCard;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@Repository
public interface ProjectCardRepository extends JpaRepository<ProjectCard, Long> {
}
