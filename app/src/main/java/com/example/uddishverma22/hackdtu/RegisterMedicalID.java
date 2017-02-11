package com.example.uddishverma22.hackdtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterMedicalID extends AppCompatActivity {

    DatabaseReference mDatabase;
    EditText name, age, phone, height, weight, medicalHistory, bloodGroup;
    Button submit;

    public static final String TAG = "RegisterMedicalID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_medical_id2);

        Long timeStamp = System.currentTimeMillis() / 1000;
        final String id = timeStamp.toString();

        mDatabase = FirebaseDatabase.getInstance().getReference();

        name = (EditText) findViewById(R.id.name_et);
        age = (EditText) findViewById(R.id.age_et);
        phone = (EditText) findViewById(R.id.contactNumber_et);
        height = (EditText) findViewById(R.id.height_et);
        weight = (EditText) findViewById(R.id.weight_et);
        bloodGroup = (EditText) findViewById(R.id.blood_et);
        medicalHistory = (EditText) findViewById(R.id.history_et);

        submit = (Button) findViewById(R.id.btn_create);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Medical_POJO.MedicalDetails details = new Medical_POJO.MedicalDetails(id, name.getText().toString(),name.getText().toString()
                        ,name.getText().toString(),name.getText().toString(),name.getText().toString(),name.getText().toString());

                Log.d(TAG, "onClick: " + name.getText().toString());
                mDatabase.child("medical_id").child(id).setValue(details);
                Toast.makeText(RegisterMedicalID.this, "Medical ID Created", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        });

    }


}
