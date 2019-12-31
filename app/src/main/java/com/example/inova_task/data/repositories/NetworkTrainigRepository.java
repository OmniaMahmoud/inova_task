package com.example.inova_task.data.repositories;

import com.example.inova_task.MApplication;
import com.example.inova_task.api.ApiEndPointInterface;
import com.example.inova_task.data.models.responses.TrainingPlaneResponse;
import com.example.inova_task.listeners.OnResponseListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NetworkTrainigRepository implements TrainingRepository {
    private final int SERVER_ERROR = 500;
    private final int INVALID_TOKEN_ERROR = 401;

    private ApiEndPointInterface apiEndPointInterface = MApplication.getInstance().getApi();
    @Override
    public void getTrainingPlaneInfo(String token, String id, final OnResponseListener onTrainingInfoResponse) {
        Call<TrainingPlaneResponse> call = apiEndPointInterface.getTrainingPlaneInfo(
                token,id);
        call.clone().enqueue(new Callback<TrainingPlaneResponse>() {
            @Override
            public void onResponse(Call<TrainingPlaneResponse> call, Response<TrainingPlaneResponse> response) {
                if(response.body() != null){
                    onTrainingInfoResponse.onSuccess(response);
                }
                else if(response.code() == SERVER_ERROR){
                    onTrainingInfoResponse.onServerError();
                }
                else if(response.code() == INVALID_TOKEN_ERROR){
                    onTrainingInfoResponse.onAuthError();
                }
                else {
                    onTrainingInfoResponse.onFailure();
                }
            }

            @Override
            public void onFailure(Call<TrainingPlaneResponse> call, Throwable t) {
                onTrainingInfoResponse.onFailure();
            }
        });
    }
}
