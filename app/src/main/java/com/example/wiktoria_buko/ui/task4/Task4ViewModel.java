package com.example.wiktoria_buko.ui.task4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task4ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Task4ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task 4");
    }

    public LiveData<String> getText() {
        return mText;
    }
}