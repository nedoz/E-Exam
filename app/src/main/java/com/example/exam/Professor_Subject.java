package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.example.exam.adapter.SubjectAdapter;


import java.util.ArrayList;

public class Professor_Subject extends AppCompatActivity  {

    ArrayList<Integer> images=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor__subject);
        setview();


    }
    private  void setview(){
        images.add(R.drawable.subject4);


        images.add(R.drawable.subject4);

        images.add(R.drawable.subject4);

        images.add(R.drawable.subject4);

        images.add(R.drawable.subject4);

        images.add(R.drawable.subject4);

        initialRecycler();
    }
    private  void  initialRecycler(){
        RecyclerView recyclerView=findViewById(R.id.recycle);
        SubjectAdapter subjectAdapter=new SubjectAdapter(images,this);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(subjectAdapter);
    }



}
