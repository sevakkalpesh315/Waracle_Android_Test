package com.waracle.androidtest;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class ApiService {

    public static CakeService getCakeService() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(CakeService.class);
    }
}
