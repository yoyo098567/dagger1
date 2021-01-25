package com.example.retrofit.module;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class BaseModule {
    String baseUrl;
    public BaseModule(String baseUrl){
        this.baseUrl=baseUrl;
    }

    //提供retrofit
    @Provides
    @Singleton
    Retrofit provideRetrofit(){
        return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
    }
}
