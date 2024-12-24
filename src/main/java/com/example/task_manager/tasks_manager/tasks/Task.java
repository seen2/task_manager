package com.example.task_manager.tasks_manager.tasks;

import jakarta.validation.constraints.NotEmpty;

public record Task(
    
    int userId,
    int id,
    String title,
    @NotEmpty
    String description,
    boolean completed) {

        //vqliadation
        public Task{
            if(title == null || title.isBlank()){
                throw new IllegalArgumentException("Title cannot be null or empty");
            }
        }

}
