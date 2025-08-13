package com.todo.todolist.entities.DTOs;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.todo.todolist.entities.enums.TaskPriority;
import com.todo.todolist.entities.enums.TaskStatus;

public class TaskDTO {
    private String title;
    private String description;
    private TaskStatus status;
    private boolean isFavorite;
    private TaskPriority priority;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime startDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime endDate;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Boolean isFavorite() {
        return isFavorite;
    }
}