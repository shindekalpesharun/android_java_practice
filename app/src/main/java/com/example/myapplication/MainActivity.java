package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.GsonNetwork.GsonNetworkCallActivity;
import com.example.myapplication.retrofitNetwork.RetrofitNetworkCallMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_intent = findViewById(R.id.btn_intent);
        Button btn_drop_down = findViewById(R.id.btn_drop_down);
        Button btn_web_view = findViewById(R.id.btn_web_view);
        Button btn_internal_storage = findViewById(R.id.btn_internal_storage);
        Button btn_progress = findViewById(R.id.btn_progress);
        Button btn_rating = findViewById(R.id.btn_rating);
        Button btn_gallary = findViewById(R.id.btn_gallary);
        Button btn_autocomplete = findViewById(R.id.btn_autocomplete);
        Button btn_asunc_task = findViewById(R.id.btn_asunc_task);
        Button btn_notification = findViewById(R.id.btn_notification);
        Button btn_broadcast = findViewById(R.id.btn_broadcast);
        Button btn_list_view = findViewById(R.id.btn_list_view);
        Button btn_custom_list_view = findViewById(R.id.btn_custom_list_view);
        Button btn_basic_recycle_view = findViewById(R.id.btn_basic_recycle_view);
        Button btn_volley_network_call = findViewById(R.id.btn_volley_network_call);
        Button btn_gson=findViewById(R.id.btn_gson);
        Button btn_retrofit=findViewById(R.id.btn_retrofit);

        btn_intent.setOnClickListener(this);
        btn_drop_down.setOnClickListener(this);
        btn_web_view.setOnClickListener(this);
        btn_internal_storage.setOnClickListener(this);
        btn_progress.setOnClickListener(this);
        btn_rating.setOnClickListener(this);
        btn_gallary.setOnClickListener(this);
        btn_autocomplete.setOnClickListener(this);
        btn_asunc_task.setOnClickListener(this);
        btn_notification.setOnClickListener(this);
        btn_broadcast.setOnClickListener(this);
        btn_list_view.setOnClickListener(this);
        btn_custom_list_view.setOnClickListener(this);
        btn_basic_recycle_view.setOnClickListener(this);
        btn_volley_network_call.setOnClickListener(this);
        btn_gson.setOnClickListener(this);
        btn_retrofit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_intent) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_drop_down) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_web_view) {
            Intent intent = new Intent(this, WebViewActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_internal_storage) {
            Intent intent = new Intent(this, InteranlStorageActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_progress) {
            Intent intent = new Intent(this, ProgressDialogActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_rating) {
            Intent intent = new Intent(this, RatingActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_gallary) {
            Intent intent = new Intent(this, GallaryViewActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_autocomplete) {
            Intent intent = new Intent(this, AutoCompleteActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_asunc_task) {
            Intent intent = new Intent(this, AsyncTaskActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_notification) {
            Intent intent = new Intent(this, NotificationMainActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_broadcast) {
            Intent intent = new Intent(this, BroadcastReceiverActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_list_view) {
            Intent intent = new Intent(this, ListMainActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_custom_list_view) {
            Intent intent = new Intent(this, CustomListviewActivity.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn_basic_recycle_view) {
            Intent intent = new Intent(this, BasicRecycleViewActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btn_volley_network_call){
            Intent intent = new Intent(this, VolleyNetworkcallActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btn_gson){
            Intent intent=new Intent(this, GsonNetworkCallActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btn_retrofit){
            Intent intent=new Intent(this, RetrofitNetworkCallMainActivity.class);
            startActivity(intent);
        }
    }
}