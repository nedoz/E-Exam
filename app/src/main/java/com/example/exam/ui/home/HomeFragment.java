package com.example.exam.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.exam.Exam_ListActivity;
import com.example.exam.R;
import com.example.exam.Registered_SubjectActivity;

public class HomeFragment extends Fragment {
 CardView card_subject,card_exam;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
     card_subject=root.findViewById(R.id.card1);
     card_subject.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
               startActivity(new Intent(getActivity(), Registered_SubjectActivity.class));
         }
     });
     card_exam=root.findViewById(R.id.card2);
     card_exam.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startActivity(new Intent(getActivity(), Exam_ListActivity.class));
         }
     });
        return root;
    }
}