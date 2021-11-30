package ru.ibs.dataprojects.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.ibs.dataprojects.exception.ProjectCardNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {
  @ExceptionHandler(ProjectCardNotFoundException.class)
  public String handleNoteNotFound(
      Model model, ProjectCardNotFoundException e
  ) {
    // model доступна так же, как и в контроллере
    model.addAttribute("message", e.getMessage());
    return "project-card-not-found";
  }
}
