package com.example.myapplication.retrofitNetwork;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class APIClient {

    private static volatile Retrofit INSTANCE = null;
    public  static ApiInterface getInstance(){
        if(INSTANCE==null){
            synchronized (APIClient.class){

                HttpLoggingInterceptor interceptor =new HttpLoggingInterceptor();
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient client=new OkHttpClient.Builder().addInterceptor(interceptor).build();

                if(INSTANCE==null){
                    INSTANCE=new Retrofit.Builder()
                            .baseUrl("https://jsonplaceholder.typicode.com/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(client)
                            .build();
                }
            }
        }
        return INSTANCE.create(ApiInterface.class);
    }

}