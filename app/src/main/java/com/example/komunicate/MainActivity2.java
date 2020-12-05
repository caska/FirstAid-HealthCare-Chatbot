package com.example.komunicate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    EditText txtName, txtNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = findViewById(R.id.txtName);
        txtNumber = findViewById(R.id.txtName);
         button= findViewById(R.id.btnlogin);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openHomeScreen();

             }

             private void openHomeScreen() {
                 Intent intent = new Intent(MainActivity2.this,HomeScreen.class);
                 startActivity(intent);
             }
         });


    }


             }

