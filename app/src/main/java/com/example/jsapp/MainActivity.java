package com.example.jsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTask;
    private RatingBar ratingBarImportance;
    private Button buttonAddTask;
    private RecyclerView recyclerViewTasks;
    private TaskAdapter taskAdapter;
    private List<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTask = findViewById(R.id.editTextTask);
        ratingBarImportance = findViewById(R.id.ratingBarImportance);
        buttonAddTask = findViewById(R.id.buttonAddTask);
        recyclerViewTasks = findViewById(R.id.recyclerViewTasks);

        tasks = new ArrayList<>();
        taskAdapter = new TaskAdapter(tasks);

        recyclerViewTasks.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTasks.setAdapter(taskAdapter);

        buttonAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTask();
            }
        });
    }

    private void addTask() {
        String taskDescription = editTextTask.getText().toString().trim();
        float importance = ratingBarImportance.getRating();

        if (!taskDescription.isEmpty()) {
            Task task = new Task(taskDescription, importance);
            tasks.add(task);
            taskAdapter.notifyDataSetChanged();
            editTextTask.setText("");
            ratingBarImportance.setRating(3);
        }
    }
}