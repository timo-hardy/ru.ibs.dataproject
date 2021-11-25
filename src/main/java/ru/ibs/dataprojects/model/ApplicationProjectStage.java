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

    private final String stage_project;

    ApplicationProjectStage(String stage_project) {
        this.stage_project = stage_project;
    }

    public String getStage_project() {
        return stage_project;
    }
}
