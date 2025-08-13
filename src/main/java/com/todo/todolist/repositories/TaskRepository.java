package com.todo.todolist.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.todo.todolist.entities.Task;;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
}