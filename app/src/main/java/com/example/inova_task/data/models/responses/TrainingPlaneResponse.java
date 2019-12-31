package com.example.inova_task.data.models.responses;

import com.example.inova_task.data.models.TrainingPlane;

public class TrainingPlaneResponse {

    private TrainingPlane trainingPlane;

    public TrainingPlaneResponse(TrainingPlane trainingPlane) {
        this.trainingPlane = trainingPlane;
    }

    public TrainingPlane getTrainingPlane() {
        return trainingPlane;
    }
}
