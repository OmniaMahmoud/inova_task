package com.example.inova_task.injection;

import com.example.inova_task.data.repositories.LocalTrainingRepository;
import com.example.inova_task.data.repositories.NetworkTrainigRepository;
import com.example.inova_task.data.repositories.TrainingRepository;

public class Injection {
    public static TrainingRepository provideTrainingRepository(){
        // if you need to return data from api use the NetworkTrainigRepository
        //return new NetworkTrainigRepository();

        // if you need to return data from mock objects use the NetworkTrainigRepository
        return new LocalTrainingRepository();
    }
}
