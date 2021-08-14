package com.example.virtuali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoRegister(View view){
        Intent intent = new Intent(this,Registration.class);
        startActivity(intent);
    }

    public void gotoMoviePage(View view){
        Intent intent = new Intent(this,DisplayMovie.class);
        startActivity(intent);
    }

    public void gotocrudMovie(View view){
        Intent intent = new Intent(this,crud_movie.class);
        startActivity(intent);
    }


}