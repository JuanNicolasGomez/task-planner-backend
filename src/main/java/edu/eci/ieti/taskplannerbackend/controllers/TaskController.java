package edu.eci.ieti.taskplannerbackend.controllers;

import edu.eci.ieti.taskplannerbackend.models.Task;
import edu.eci.ieti.taskplannerbackend.services.TaskService;
import edu.eci.ieti.taskplannerbackend.services.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {

    @Autowired
    private final UserSevice userService;

    @Autowired
    private final TaskService taskService;

    public TaskController(UserSevice userService, TaskService taskService) {
        this.userService = userService;
        this.taskService = taskService;
    }

    @RequestMapping("/taskslist")
    public List<Task> getTasks(){
        return taskService.geTasksList();
    }
}
