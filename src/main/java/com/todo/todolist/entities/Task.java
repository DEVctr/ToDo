package com.todo.todolist.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.todo.todolist.entities.enums.TaskPriority;
import com.todo.todolist.entities.enums.TaskStatus;

@Document("Task")
public class Task {
    @Id
    private String _id;

    private String title;
    private String description;
    private TaskStatus status;
    private boolean isFavorite;
    private TaskPriority priority;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime creationDate;

    public Task(
        String title,
        String description,
        TaskStatus status,
        boolean isFavorite,
        TaskPriority priority,
        LocalDateTime startDate,
        LocalDateTime endDate
    ) {
        super();
        this.title = title;
        this.description = description;
        this.status = status;
        this.isFavorite = isFavorite;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate =  endDate;
        this.creationDate = LocalDateTime.now();
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_id() {
        return _id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}