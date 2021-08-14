package com.example.virtuali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class crud_movie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_movie);
    }


    public void gotopermenantDelete(View view){
        Intent intent = new Intent(this,permenantDelete.class);
        startActivity(intent);
    }


}