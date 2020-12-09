package com.ium.seiuntesoro.ui.photogallery;

import android.widget.Gallery;

import androidx.constraintlayout.widget.Placeholder;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PhotoGalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PhotoGalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is photo gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}