package com.example.adexp7_imageslide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.lab7_test.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider slider = findViewById(R.id.slider1);
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.bd2, "1",
                ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.bd4, "2",
                ScaleTypes.FIT));
        slider.setImageList(slideModelList);
    }
}