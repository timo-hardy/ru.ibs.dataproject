package ru.ibs.dataprojects.config;

/**
 * @author Timur Khidirov on 02.12.2021
 */
public enum ApplicationUserPermission {
    PROJECT_CARD_READ("project_card:read"),
    PROJECT_CARD_WRITE("project_card:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
