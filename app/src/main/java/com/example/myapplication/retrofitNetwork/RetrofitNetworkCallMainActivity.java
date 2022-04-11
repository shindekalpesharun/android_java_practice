package com.example.myapplication.retrofitNetwork;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.retrofitNetwork.model.TodoResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitNetworkCallMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_network_call_main);

        Call<List<TodoResponse>> products = APIClient.getInstance().listProducts();
        products.enqueue(new Callback<List<TodoResponse>>() {
            @Override
            public void onResponse(Call<List<TodoResponse>> call, Response<List<TodoResponse>> response) {
                List<TodoResponse> data = response.body();
                Toast.makeText(RetrofitNetworkCallMainActivity.this, "" + response.body().get(1).getTitle(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<TodoResponse>> call, Throwable t) {
                //Log.d("get failed","");
                Toast.makeText(RetrofitNetworkCallMainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
            }
        });
    }
}