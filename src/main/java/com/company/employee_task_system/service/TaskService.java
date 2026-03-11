package com.company.employee_task_system.service;

import com.company.employee_task_system.entity.Task;
import com.company.employee_task_system.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public Task saveTask(Task task) {
        return repo.save(task);
    }

    public List<Task> getTasksByEmployee(Long empId) {
        return repo.findByEmployeeId(empId);
    }

    public List<Task> getPendingTasks() {
        List<Task> all = repo.findAll();

        return all.stream()
                .filter(t -> "PENDING".equalsIgnoreCase(t.getStatus()))
                .collect(Collectors.toList());
    }

}