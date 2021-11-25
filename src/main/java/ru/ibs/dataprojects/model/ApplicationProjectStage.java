package ru.ibs.dataprojects.model;

/**
 * @author Timur Khidirov on 24.11.2021
 */
public enum ApplicationProjectStage {
    PROJECT_STAGE_INITIALIZATION("Инициализация"),
    PROJECT_STAGE_START("Начало"),
    PROJECT_STAGE_MIDDLE("Середина"),
    PROJECT_STAGE_END("Завершение");

    private final String stage_project;

    ApplicationProjectStage(String stage_project) {
        this.stage_project = stage_project;
    }

    public String getStage_project() {
        return stage_project;
    }
}
