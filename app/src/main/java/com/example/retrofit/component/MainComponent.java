package com.example.retrofit.component;

import com.example.retrofit.MainActivity;
import com.example.retrofit.module.BaseModule;
import com.example.retrofit.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;
//單例
@Singleton
//表示MainModule、BaseModule提供依賴
@Component(
        modules = {MainModule.class,BaseModule.class}

)
//當注入MainComponent的interface時注入上方的module
public interface MainComponent {
    void inject(MainActivity activity);
}
