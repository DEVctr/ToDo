package com.todo.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todolist.entities.Task;
import com.todo.todolist.entities.DTOs.TaskDTO;
import com.todo.todolist.services.TaskService;

@RestController
@RequestMapping("/task")                // "POST", "GET", "PUT/PATCH", "DELETE"
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Task addTask(@RequestBody TaskDTO taskDTO) {
        return taskService.addTask(taskDTO);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Task> findAllTasks() {
        return taskService.findAllTasks();
    }

    @GetMapping("/{taskId}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Task> findById(@PathVariable String taskId) {
        return this.taskService.findTaskById(taskId);
    }
}