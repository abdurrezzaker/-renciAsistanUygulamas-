package com.example.asistan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerRowAdapder extends RecyclerView.Adapter<RecyclerRowAdapder.PostHolder> {

    private ArrayList<String> titleList;

    public RecyclerRowAdapder(ArrayList<String> titleList) {
        this.titleList = titleList;
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_row,parent,false);
        return new PostHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, int position) {

        holder.titleText.setText(titleList.get(position));

    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }

    class PostHolder extends RecyclerView.ViewHolder{

        TextView titleText;

        public PostHolder(@NonNull View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.recyclerView_row_title_text);
        }
    }

}
