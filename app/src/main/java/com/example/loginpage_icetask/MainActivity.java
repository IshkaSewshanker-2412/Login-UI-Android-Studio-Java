package com.example.loginpage_icetask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Username = (TextView) findViewById(R.id.username);
        TextView Password = (TextView) findViewById(R.id.password);

        MaterialButton Loginbtn = (MaterialButton) findViewById(R.id.Loginbtn);

        //admin and admin
        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Username.getText().toString().equals("Admin")&& Password.getText().toString().equals("Admin")){
                    //correct password
                    Toast.makeText(MainActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
                }
                else {
                    //incorrect password
                    Toast.makeText(MainActivity.this,"Login Unsuccessful", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}