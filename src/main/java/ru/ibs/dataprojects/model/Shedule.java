package ru.ibs.dataprojects.model;

/**
 * @author Timur Khidirov on 25.11.2021
 */

public enum Shedule {
    SHEDULE_SHIFT("Сменный график"),
    SHEDULE_FLEXIBLE("Гибкий график"),
    SHEDULET_REMOTE("Удаленная работа"),
    SHEDULE_ROTATIONAL("Вахтовый метод");

    private final String shedule;

    Shedule(String shedule) {
        this.shedule = shedule;
    }

    public String getShedule() {
        return shedule;
    }
}
