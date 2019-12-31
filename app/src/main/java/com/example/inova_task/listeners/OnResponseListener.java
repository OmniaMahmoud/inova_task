package com.example.inova_task.listeners;

import retrofit2.Response;

public interface OnResponseListener {
    void onSuccess(Response response);

    void onFailure();

    void onAuthError();

    void onServerError();
}
