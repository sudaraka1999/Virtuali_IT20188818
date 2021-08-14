package com.example.virtuali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MovieReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_reservation);
    }

    public void gotoMovieconfirmBooking(View view){
        Intent intent = new Intent(this,Confirm_Booking.class);
        startActivity(intent);

    }
}