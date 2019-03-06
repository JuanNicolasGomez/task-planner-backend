package edu.eci.ieti.taskplannerbackend.services;

import edu.eci.ieti.taskplannerbackend.models.Task;
import edu.eci.ieti.taskplannerbackend.models.User;

import java.util.List;

public interface TaskService {
    List<Task> geTasksList();

    Task getTaskById(String id);

    List<Task> getTasksByUserId(String userId);

    Task assignedTaskToUser(String taskId, User user);

    void removeTask();

    Task updateTask(Task task);
}
