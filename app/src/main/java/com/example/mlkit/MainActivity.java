package com.example.mlkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mlkit.helpers.ImageHelperActivity;
import com.example.mlkit.image.FaceDetectionActivity;
import com.example.mlkit.image.FlowerIdentificationActivity;
import com.example.mlkit.image.ImageClassificationActivity;
import com.example.mlkit.image.ObjectDetectionActivity;
import com.google.mlkit.vision.objects.ObjectDetection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToImageActivity(View view){
        Intent intent = new Intent(this, ImageClassificationActivity.class);
        startActivity(intent);
    }

    public void goToFlowerIdentification(View view){
        Intent intent = new Intent(this, FlowerIdentificationActivity.class);
        startActivity(intent);
    }

    public void goToObjectDetection(View view){
        Intent intent = new Intent(this, ObjectDetectionActivity.class);
        startActivity(intent);
    }

    public void goToFaceDetection(View view){
        Intent intent = new Intent(this, FaceDetectionActivity.class);
        startActivity(intent);
    }
}