package com.example.wiktoria_buko.ui.task8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task5ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Task5ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task 8");
    }

    public LiveData<String> getText() {
        return mText;
    }
}