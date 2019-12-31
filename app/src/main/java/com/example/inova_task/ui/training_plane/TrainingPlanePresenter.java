package com.example.inova_task.ui.training_plane;

import com.example.inova_task.data.models.TrainingPlane;
import com.example.inova_task.data.models.responses.TrainingPlaneResponse;
import com.example.inova_task.data.repositories.TrainingRepository;
import com.example.inova_task.listeners.OnResponseListener;

import java.lang.ref.WeakReference;

import retrofit2.Response;

public class TrainingPlanePresenter {

    private WeakReference<TrainingPlaneView> view = new WeakReference<>(null);
    private TrainingRepository repository;

    public TrainingPlanePresenter(TrainingRepository repository) {
        this.repository = repository;
    }

    public void setView(TrainingPlaneView trainingPlaneView) {
        this.view = new WeakReference<>(trainingPlaneView);
    }

    public void getTrainingPlaneInfo(String id){
        final TrainingPlaneView trainingPlaneView = view.get();
        repository.getTrainingPlaneInfo("", "", new OnResponseListener() {
            @Override
            public void onSuccess(Response response) {
                if(response.body() != null){
                    trainingPlaneView.showTrainingPlane(
                            ((TrainingPlaneResponse)response.body()).getTrainingPlane());

                }
            }

            @Override
            public void onFailure() {
                trainingPlaneView.showNetworkError();
            }

            @Override
            public void onAuthError() {
                trainingPlaneView.showAuthError();
            }

            @Override
            public void onServerError() {
                trainingPlaneView.showServerError();
            }
        });
    }

    public interface TrainingPlaneView {
        void showTrainingPlane(TrainingPlane plane);
        void showNetworkError();
        void showServerError();
        void showAuthError();
    }
}
