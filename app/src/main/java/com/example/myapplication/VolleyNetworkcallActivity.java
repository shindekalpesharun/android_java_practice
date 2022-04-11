package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class VolleyNetworkcallActivity extends AppCompatActivity {
//    String data = "" +
//            "{" +
//            "  \"title\":\"JSONParserTutorial\"," +
//            "  \"array\":[" +
//            "    {" +
//            "    \"company\":\"Google\"" +
//            "    }," +
//            "    {" +
//            "      \"company\":\"Facebook\"" +
//            "    }," +
//            "    {" +
//            "    \"company\":\"LinkedIn\"" +
//            "    }," +
//            "    {" +
//            "      \"company\" : \"Microsoft\"" +
//            "    }," +
//            "    {" +
//            "      \"company\": \"Apple\"" +
//            "    }" +
//            "    ]," +
//            "    \"nested\":{" +
//            "    \"flag\": true," +
//            "    \"random_number\":1" +
//            "    }" +
//            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley_networkcall);


//        try {
//            List<String> items = new ArrayList<>();
//
//
//            JSONObject root = new JSONObject(data);
//            JSONArray array = root.getJSONArray("array");
//
//            for (int i = 0; i < array.length(); i++) {
//                JSONObject object = array.getJSONObject(i);
//                items.add(object.getString("company"));
//            }
//
//            Log.d("TAG", "onCreate: " + items);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }


        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                "https://jsonplaceholder.typicode.com/comments", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject obj = response.getJSONObject(i);
//                        Log.d("TAG", "onResponse: "+obj);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
//                Log.d("myapp", "The response is" + response);
//                    Toast.makeText(VolleyNetworkcallActivity.this, response, Toast.LENGTH_SHORT).show();

            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("myapp", "Something went wrong");

                    }
                });

        requestQueue.add(jsonArrayRequest);
    }
}