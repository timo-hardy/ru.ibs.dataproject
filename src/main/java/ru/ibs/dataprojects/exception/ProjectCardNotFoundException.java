package ru.ibs.dataprojects.exception;

/**
 * @author Timur Khidirov on 30.11.2021
 */
public class ProjectCardNotFoundException extends RuntimeException {
    public ProjectCardNotFoundException() {
    }

    public ProjectCardNotFoundException(String message) {
        super(message);
    }

    public ProjectCardNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectCardNotFoundException(Throwable cause) {
        super(cause);
    }

    public ProjectCardNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
