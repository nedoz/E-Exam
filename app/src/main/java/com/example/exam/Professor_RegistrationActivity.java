package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Professor_RegistrationActivity extends AppCompatActivity {
    EditText txt_name,txt_email,txt_password,txt_con_password;
    Button btn_register;
    TextView prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor__registration);
        txt_name=findViewById(R.id.name);
        txt_email=findViewById(R.id.email);
        txt_password=findViewById(R.id.password);
        txt_con_password=findViewById(R.id.con_password);
        btn_register=findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Professor_RegistrationActivity.this,Professor_ProfileActivity.class));
            }
        });
    }
}
