package com.example.jsapp;

public class Task {
    private String description;
    private float importance;

    public Task(String description, float importance) {
        this.description = description;
        this.importance = importance;
    }

    public String getDescription() {
        return description;
    }

    public float getImportance() {
        return importance;
    }
}