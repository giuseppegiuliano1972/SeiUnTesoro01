package com.ium.seiuntesoro.ui.photogallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.ium.seiuntesoro.R;

public class PhotoGalleryFragment extends Fragment {

    private PhotoGalleryViewModel photoGalleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        photoGalleryViewModel =
                new ViewModelProvider(this).get(PhotoGalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_photogallery, container, false);

        final TextView textView = root.findViewById(R.id.text_photogallery);
        final ImageView imageView = root.findViewById(R.id.imageView);

        photoGalleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });


        return root;
    }
}