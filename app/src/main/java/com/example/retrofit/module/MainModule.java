package com.example.retrofit.module;


import android.app.Application;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    public Application application;

    public MainModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return application;
    }
}
