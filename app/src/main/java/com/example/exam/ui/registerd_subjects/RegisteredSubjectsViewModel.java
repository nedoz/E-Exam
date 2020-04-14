package com.example.exam.ui.registerd_subjects;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegisteredSubjectsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RegisteredSubjectsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}