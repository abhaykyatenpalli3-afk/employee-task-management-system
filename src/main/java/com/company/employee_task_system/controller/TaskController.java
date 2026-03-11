package com.company.employee_task_system.controller;

import com.company.employee_task_system.entity.Task;
import com.company.employee_task_system.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.saveTask(task);
    }

    @GetMapping("/employee/{id}")
    public List<Task> getTasksByEmployee(@PathVariable Long id) {
        return service.getTasksByEmployee(id);
    }

    @GetMapping("/pending")
    public List<Task> getPendingTasks() {
        return service.getPendingTasks();
    }
}