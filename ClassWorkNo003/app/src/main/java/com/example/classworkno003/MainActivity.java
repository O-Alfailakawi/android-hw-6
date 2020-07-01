package com.example.classworkno003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie Movie1 = new Movie("Interstellar","Matthew McConaughey", 8.6, 13, "Sci-fi");
        Movie Movie2 = new Movie("Inception", "Leonardo DiCaprio", 8.8,13,"Sci-fi");


    }
}