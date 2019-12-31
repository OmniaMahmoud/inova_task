package com.example.inova_task.ui.training_plane;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.inova_task.R;
import com.example.inova_task.data.models.TrainingPlane;
import com.example.inova_task.injection.Injection;

public class TrainingPlaneActivity extends AppCompatActivity
        implements TrainingPlanePresenter.TrainingPlaneView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TrainingPlanePresenter trainingPlanePresenter = new TrainingPlanePresenter(Injection.provideTrainingRepository());
        trainingPlanePresenter.setView(this);
        trainingPlanePresenter.getTrainingPlaneInfo("");
    }

    @Override
    public void showTrainingPlane(TrainingPlane plane) {

    }

    @Override
    public void showNetworkError() {

    }

    @Override
    public void showServerError() {

    }

    @Override
    public void showAuthError() {

    }
}
