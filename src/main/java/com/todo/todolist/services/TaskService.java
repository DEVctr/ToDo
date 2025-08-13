package com.todo.todolist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todolist.entities.Task;
import com.todo.todolist.entities.DTOs.TaskDTO;
import com.todo.todolist.repositories.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task addTask(TaskDTO taskDTO) {
        
        Task task = new Task(
            taskDTO.getTitle(),
            taskDTO.getDescription(),
            taskDTO.getStatus(),
            taskDTO.isFavorite(),
            taskDTO.getPriority(),
            taskDTO.getStartDate(),
            taskDTO.getEndDate()
        );

        return this.taskRepository.insert(task);
    }

    public List<Task> findAllTasks() {
        return this.taskRepository.findAll();
    }

    public Optional<Task> findTaskById(String taskId) {
        return this.taskRepository.findById(taskId);
    }
}