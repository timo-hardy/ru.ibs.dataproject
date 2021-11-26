package ru.ibs.dataprojects.model;

/**
 * @author Timur Khidirov on 24.11.2021
 */
public enum ApplicationProjectStage {
    PROJECT_STAGE_INITIATION("Инициация"),
    PROJECT_STAGE_PLANNING("Планирование"),
    PROJECT_STAGE_PERFOMANCE("Выполнение"),
    PROJECT_STAGE_MONITORING("Мониторинг"),
    PROJECT_STAGE_END("Завершение");

    private final String stageProject;

    ApplicationProjectStage(String stageProject) {
        this.stageProject = stageProject;
    }

    public String getStageProject() {
        return stageProject;
    }
}
