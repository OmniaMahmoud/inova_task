package com.example.inova_task.data.models;

import java.util.ArrayList;

public class TrainingPlane {
    private String title;
    private String imageUrl;
    private String description;
    private String videoUrl;
    private ArrayList<Instructor> instructors;
    private String difficulty;
    private String intensity;
    private ArrayList<TrainingClass> trainingClasses;

    public TrainingPlane(String title, String imageUrl, String description, String videoUrl, ArrayList<Instructor> instructors, String difficulty, String intensity, ArrayList<TrainingClass> trainingClasses) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.videoUrl = videoUrl;
        this.instructors = instructors;
        this.difficulty = difficulty;
        this.intensity = intensity;
        this.trainingClasses = trainingClasses;
    }
}
