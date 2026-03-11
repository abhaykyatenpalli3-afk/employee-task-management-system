package com.company.employee_task_system.repository;

import com.company.employee_task_system.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByEmployeeId(Long employeeId);

    List<Task> findByStatus(String status);
}