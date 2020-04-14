package com.example.exam.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam.R;
import com.example.exam.SubjectActivity;
import com.example.exam.Subject_List;

import java.util.ArrayList;

public class SubjectAdapter  extends  RecyclerView.Adapter<SubjectAdapter.SubjectHolder>{

    ArrayList<Integer> subject_image=new ArrayList<>();
    Context mcontext;

    public SubjectAdapter( ArrayList<Integer> subject_image, Context mcontext) {

        this.subject_image = subject_image;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public SubjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        SubjectHolder holder=new SubjectHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectHolder holder, int position) {
        holder.img_subject.setImageResource(subject_image.get(position));
    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(mcontext, Subject_List.class);
            mcontext.startActivity(intent);
        }
    });
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mcontext, SubjectActivity.class);
                mcontext.startActivity(intent);
            }
        });
        holder.btn_subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mcontext, SubjectActivity.class);
                mcontext.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return subject_image.size();
    }

    public  class SubjectHolder extends RecyclerView.ViewHolder{
        ImageView img_subject;
    CardView cardView;
   Button btn_subject;
    LinearLayout linearLayout;



        public SubjectHolder(@NonNull View itemView) {
            super(itemView);
            img_subject=itemView.findViewById(R.id.subject);
    cardView=itemView.findViewById(R.id.card);
            linearLayout=itemView.findViewById(R.id.container);
            btn_subject=itemView.findViewById(R.id.btn_subject);

        }
    }
}
