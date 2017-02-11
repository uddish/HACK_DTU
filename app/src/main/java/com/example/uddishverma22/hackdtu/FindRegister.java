package com.example.uddishverma22.hackdtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindRegister extends AppCompatActivity {

    Button find, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_register);

        find = (Button) findViewById(R.id.find);
        register = (Button) findViewById(R.id.register);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //find
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegisterMedicalID.class));
            }
        });
    }
}
