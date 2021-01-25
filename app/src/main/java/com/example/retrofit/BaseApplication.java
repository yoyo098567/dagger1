package com.example.retrofit;

import android.app.Application;

import com.example.retrofit.component.DaggerMainComponent;
import com.example.retrofit.component.MainComponent;
import com.example.retrofit.module.BaseModule;
import com.example.retrofit.module.MainModule;


public class BaseApplication extends Application {
    private MainComponent amainComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        amainComponent=DaggerMainComponent.builder()
                .baseModule(new BaseModule("https://jsonplaceholder.typicode.com"))
                .mainModule(new MainModule(this))
                .build();

   }
   //得到MainComponent返回的值
        public MainComponent getAmainComponent(){
         return  amainComponent;
        }
}
