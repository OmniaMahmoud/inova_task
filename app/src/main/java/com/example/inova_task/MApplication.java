package com.example.inova_task;

import android.app.Application;
import com.example.inova_task.api.APIURLs;
import com.example.inova_task.api.ApiEndPointInterface;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MApplication extends Application {

    private static MApplication instance;
    private ApiEndPointInterface apiEndPointInterface;

    public MApplication() {
        instance = this;
    }

    public static MApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
    public ApiEndPointInterface getApi(){
        if (apiEndPointInterface == null){
            setupApiEndPoint();
        }
        return apiEndPointInterface;
    }

    private void setupApiEndPoint(){
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(APIURLs.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        apiEndPointInterface = builder.build().create(ApiEndPointInterface.class);
    }
}
