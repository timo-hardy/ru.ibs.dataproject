package ru.ibs.dataprojects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.dataprojects.model.ProjectCard;

import java.util.List;

/**
 * @author Timur Khidirov on 23.11.2021
 */
@Repository
public interface ProjectCardRepository extends JpaRepository<ProjectCard, Long> {
    List<ProjectCard> findByOrderByCardIdAsc();
    List<ProjectCard> findByOrderByCardIdDesc();
    List<ProjectCard> findByOrderByProjectNameAsc();
    List<ProjectCard> findByOrderByProjectNameDesc();
    List<ProjectCard> findByOrderBySubjectAreaOfTheProjectAsc();
    List<ProjectCard> findByOrderBySubjectAreaOfTheProjectDesc();
    List<ProjectCard> findByOrderByCustomerOfTheProjectAsc();
    List<ProjectCard> findByOrderByCustomerOfTheProjectDesc();
}
