package com.example.JSapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private ProgressBar progressBar;
    private RatingBar ratingBar;
    private ImageView imageView;
    private Spinner spinner;
    private RecyclerView recyclerView;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        progressBar = findViewById(R.id.progressBar);
        ratingBar = findViewById(R.id.ratingBar);
        imageView = findViewById(R.id.imageView);
        spinner = findViewById(R.id.spinner);
        recyclerView = findViewById(R.id.recyclerView);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // Configurar RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter()); // Asegúrate de crear un adaptador

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        StringBuilder result = new StringBuilder();
        result.append("Checkbox: ").append(checkBox.isChecked()).append("\n");

        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selectedId);
        result.append("RadioButton: ").append(radioButton.getText()).append("\n");

        result.append("Rating: ").append(ratingBar.getRating()).append("\n");
        Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
    }
}