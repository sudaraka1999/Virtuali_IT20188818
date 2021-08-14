package com.example.virtuali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_movie);
    }

    public void gotoMovieReservation(View view){
        Intent intent = new Intent(this,MovieReservation.class);
        startActivity(intent);

    }
}