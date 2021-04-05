package com.example.viewpager2withrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<String> stringList;

    public MyAdapter(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.exampleTv.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList == null ? 0 : stringList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView exampleTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            exampleTv = itemView.findViewById(R.id.example_tv);
        }
    }
}
