package edu.eci.ieti.taskplannerbackend.services.impl;

import edu.eci.ieti.taskplannerbackend.models.Task;
import edu.eci.ieti.taskplannerbackend.models.User;
import edu.eci.ieti.taskplannerbackend.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component
public class TaskServiceImpl implements TaskService {

    private List<Task> tasksList = new ArrayList<Task>();

    public TaskServiceImpl() {
        this.tasksList.add(new Task("Hacer lab de COSW","Juan Gomez","In Progress",new Date()));
        this.tasksList.add(new Task("Tarea Test creada en el backend","Juan Gomez","Done",new Date()));
    }

    @Override
    public List<Task> geTasksList() {


        return tasksList;
    }

    @Override
    public Task getTaskById(String id) {
        return tasksList.get(Integer.parseInt(id));
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return null;
    }

    @Override
    public Task assignedTaskToUser(String taskId, User user) {
        return null;
    }

    @Override
    public void removeTask() {

    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }
}
