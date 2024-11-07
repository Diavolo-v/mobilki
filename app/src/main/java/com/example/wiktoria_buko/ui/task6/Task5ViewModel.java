package com.example.wiktoria_buko.ui.task6;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Task5ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Task5ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is task 6");
    }

    public LiveData<String> getText() {
        return mText;
    }
}