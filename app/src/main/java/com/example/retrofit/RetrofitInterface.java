package com.example.retrofit;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("photos")
    Call<List<PhotoModel>> getAllPhotos();
}