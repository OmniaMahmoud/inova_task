package com.example.inova_task.data.repositories;

import com.example.inova_task.listeners.OnResponseListener;

public interface TrainingRepository {
    void getTrainingPlaneInfo(String token, String id, OnResponseListener onTrainingInfoResponse);
}
