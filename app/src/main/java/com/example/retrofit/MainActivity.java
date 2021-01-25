package com.example.retrofit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import javax.inject.Inject;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    //注入retrofit
    @Inject
    Retrofit retrofit;

    RecyclerView recycle;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用recyclerview
        recycle = findViewById(R.id.recycle);
        //注入從BaseApplication的getAmainComponent的值
        ((BaseApplication)getApplication()).getAmainComponent().inject(this);

        RetrofitInterface retrofitInterface=retrofit.create(RetrofitInterface.class);
        retrofitInterface.getAllPhotos().enqueue(new Callback<List<PhotoModel>>() {
            @Override
            public void onResponse(Call<List<PhotoModel>> call, Response<List<PhotoModel>> response) {
                parseData(response.body());
            }

            @Override
            public void onFailure(Call<List<PhotoModel>> call, Throwable t) {

            }
        });
        //沒加dagger的retrofit
//        RetrofitInterface retrofitInterface = RetrofitInstance.getRetrofitInstance().create(RetrofitInterface.class);
//        Call<List<PhotoModel>> call = retrofitInterface.getAllPhotos();
//        call.enqueue(new Callback<List<PhotoModel>>() {
//            @Override
//            public void onResponse(Call<List<PhotoModel>> call, Response<List<PhotoModel>> response) {
//                parseData(response.body());
//           }
//
//            @Override
//            public void onFailure(Call<List<PhotoModel>> call, Throwable t) {
//
//            }
//        });
   }
    //recyclerview的基本設置
   private void parseData(List<PhotoModel> body) {
       RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(body);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        recycle.setAdapter(recyclerViewAdapter);
    }


}