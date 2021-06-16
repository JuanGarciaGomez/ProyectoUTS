package com.movilidad.proyectouts.providers;

import com.movilidad.proyectouts.models.FCMBody;
import com.movilidad.proyectouts.models.FCMResponse;
import com.movilidad.proyectouts.retrofit.IFCMApi;
import com.movilidad.proyectouts.retrofit.RetrofitClient;


import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
