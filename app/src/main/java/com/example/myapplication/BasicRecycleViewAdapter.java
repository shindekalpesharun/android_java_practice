package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BasicRecycleViewAdapter extends RecyclerView.Adapter<BasicRecycleViewAdapter.MyViewHolder> {
    private ArrayList<Contact> contactsList;
    private Context mContext;

    public BasicRecycleViewAdapter(ArrayList<Contact> contactsList, Context mContext) {
        this.contactsList = contactsList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        // Inflate the layout view you have created for the list rows here
        View view = layoutInflater.inflate(R.layout.basic_rv_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Contact contact = contactsList.get(position);

        // Set the data to the views here
//        holder.setContactName(contact.getName());
//        holder.setContactNumber(contact.getNumber());
        holder.txt_name.setText(contact.getName());
        holder.txt_number.setText(contact.getNumber());

        holder.custom_rv_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, contact.getName(), Toast.LENGTH_SHORT).show();
            }
        });


        // You can set click listners to indvidual items in the viewholder here
        // make sure you pass down the listner or make the Data members of the viewHolder public
    }

    @Override
    public int getItemCount() {
        return contactsList == null ? 0 : contactsList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_name;
        private TextView txt_number;
        private LinearLayout custom_rv_item;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_number = itemView.findViewById(R.id.txt_number);
            custom_rv_item=itemView.findViewById(R.id.custom_rv_item);
        }


    }
}
