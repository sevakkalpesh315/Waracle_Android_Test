package com.waracle.androidtest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CakeService {

    @GET("hart88/198f29ec5114a3ec3460/raw/8dd19a88f9b8d24c23d9960f3300d0c917a4f07c/cake.json")
    Call<List<Cake>> getCakes();
}
