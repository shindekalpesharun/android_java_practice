package com.example.myapplication.retrofitNetwork;

import com.example.myapplication.retrofitNetwork.model.TodoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
//    @FormUrlEncoded()
//    @POST("/demo/insert.php")
//    Call<ResponseBody> addProduct(@Field("name")String name, @Field("price") String price);

    @GET("todos")
    Call<List<TodoResponse>> listProducts();
/*
    @GET("/demo/getdata.php")
    Call<ProductResponse> getdata();*/

}