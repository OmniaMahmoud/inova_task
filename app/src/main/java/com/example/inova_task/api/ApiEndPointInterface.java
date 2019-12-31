package com.example.inova_task.api;

import com.example.inova_task.data.models.TrainingPlane;
import com.example.inova_task.data.models.responses.TrainingPlaneResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
public interface ApiEndPointInterface {
    @FormUrlEncoded
    @POST(APIURLs.TRAINING_PLANE_INFO)
    Call<TrainingPlaneResponse> getTrainingPlaneInfo(
            @Header("Authorization") String token,
            @Field("id") String trainingId
    );
}
