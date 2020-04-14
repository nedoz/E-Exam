package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.InflaterOutputStream;

public class Student_RegistrationActivity extends AppCompatActivity {
    EditText txt_name,txt_email,txt_password,txt_con_password,txt_department,txt_level;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__registration);
        txt_name=findViewById(R.id.edit_name);
        txt_email=findViewById(R.id.edit_email);
        txt_password=findViewById(R.id.edit_password);
        txt_con_password=findViewById(R.id.edit_con_password);
        txt_department=findViewById(R.id.edit_department);
        txt_level=findViewById(R.id.edit_level);
        btn_register=findViewById(R.id.btn_sign);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student_RegistrationActivity.this, InformationActivity.class));
            }
        });


    }
}
