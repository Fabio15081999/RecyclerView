package com.example.cf_btvn_recycleview_b3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    TextView tv1;
    public List<FolderName> folderNameList;
    Context ctx;

    public MyAdapter(List<FolderName> fn, Context ctx) {
        super();
        this.folderNameList = fn;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
    holder.tv1.setText(folderNameList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return folderNameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        TextView tv1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById((R.id.tvFoldername));
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();
            FolderName fn = folderNameList.get(position);
            Toast.makeText(ctx, fn.getName(),Toast.LENGTH_LONG).show();

        }
    }
}