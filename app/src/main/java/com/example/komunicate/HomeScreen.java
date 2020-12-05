package com.example.komunicate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.maps.GoogleMap;

public class HomeScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

    }

    public void GoBot(View view) {
        Intent intent = new Intent(HomeScreen.this, MainActivity.class);
        startActivity(intent);

    }

    public void getNearByHospitals(View view){
        Intent getHospitals = new Intent(HomeScreen.this, GoogleMapsActivity.class);
        startActivity(getHospitals);
    }

    public void MakeCall(View view){
        String phone = "999";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }


}