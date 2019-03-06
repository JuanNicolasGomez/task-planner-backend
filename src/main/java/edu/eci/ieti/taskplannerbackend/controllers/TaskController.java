package edu.eci.ieti.taskplannerbackend.controllers;

import edu.eci.ieti.taskplannerbackend.services.TaskService;
import edu.eci.ieti.taskplannerbackend.services.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class TaskController {


    private final UserSevice userService;


    private final TaskService taskService;

    public TaskController(UserSevice userService, TaskService taskService) {
        this.userService = userService;
        this.taskService = taskService;
    }
}
