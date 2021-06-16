package com.movilidad.proyectouts.retrofit;

import com.movilidad.proyectouts.models.FCMBody;
import com.movilidad.proyectouts.models.FCMResponse;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {


    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAnsrtCBk:APA91bEGjkobSLmrugXGrspdH3i58UlzYw66PAIR0yA-IyrF5o2vV4-JWWw5m8fb0rN6IQCp2s9lkcAj7HSb83niYmnZvP8m8d091Qimr2wzEaPf6PBXvjnM7oHChWU3-U793IjoHQVX"
    })

    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);

}
