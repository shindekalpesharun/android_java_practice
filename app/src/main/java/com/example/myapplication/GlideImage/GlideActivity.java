package com.example.myapplication.GlideImage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class GlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        ImageView  iv_image_view=findViewById(R.id.iv_image_view);
        Glide.with(this)
                .load("https://images.unsplash.com/photo-1586184059891-09ad2a30f3ce?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80")
                .placeholder(R.drawable.ic_launcher_background)
                .into(iv_image_view);
    }
}