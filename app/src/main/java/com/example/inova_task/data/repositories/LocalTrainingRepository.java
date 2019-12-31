package com.example.inova_task.data.repositories;

import com.example.inova_task.MApplication;
import com.example.inova_task.data.models.Instructor;
import com.example.inova_task.data.models.TrainingClass;
import com.example.inova_task.data.models.TrainingPlane;
import com.example.inova_task.data.models.responses.TrainingPlaneResponse;
import com.example.inova_task.listeners.OnResponseListener;

import java.util.ArrayList;

import retrofit2.Response;
import retrofit2.Retrofit;

public class LocalTrainingRepository implements TrainingRepository {

    @Override
    public void getTrainingPlaneInfo(String token, String id, OnResponseListener onTrainingInfoResponse) {
        TrainingPlane trainingPlane = new TrainingPlane(
                "ESSENTIAL YOGA POSES",
                "",
                "",
                "",
                new ArrayList<Instructor>(),"MODURATE",
                "Level 2",
                new ArrayList<TrainingClass>()
        );
        TrainingPlaneResponse response = new TrainingPlaneResponse(trainingPlane);
        onTrainingInfoResponse.onSuccess(Response.success(response));
    }
}
