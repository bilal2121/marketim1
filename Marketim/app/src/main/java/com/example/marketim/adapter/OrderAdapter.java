package com.example.marketim.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketim.R;
import com.example.marketim.model.ProductModel;

import java.util.ArrayList;
public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderHolder> {

    private ArrayList<ProductModel> arrayList;

    public OrderAdapter(ArrayList<ProductModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public OrderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_row_item,parent,false);
        return new OrderHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderHolder holder, int position) {

        holder.gunTV.setText(arrayList.get(position).getDate());
        holder.ayTV.setText(arrayList.get(position).getMonth());
        holder.marketAdiTV.setText(arrayList.get(position).getMarketName());
        holder.urunAdiTV.setText(arrayList.get(position).getOrderName());
        //holder.fiyatTV.setText(arrayList.get(position).getProductPrice()+" TL");
        holder.durumTV.setText(arrayList.get(position).getProductState());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

     class OrderHolder extends RecyclerView.ViewHolder {

        private TextView gunTV;
        private TextView ayTV;
        private TextView marketAdiTV;
        private TextView okTV;
        private TextView urunAdiTV;
        private TextView fiyatTV;
        private TextView durumKareTV;
        private TextView durumTV;

         OrderHolder(@NonNull View itemView) {
            super(itemView);

            gunTV = itemView.findViewById(R.id.gunTV);
            ayTV = itemView.findViewById(R.id.ayTV);
            marketAdiTV = itemView.findViewById(R.id.marketAdiTV);
            okTV = itemView.findViewById(R.id.okTV);
            urunAdiTV = itemView.findViewById(R.id.urunAdiTV);
            fiyatTV = itemView.findViewById(R.id.fiyatTV);
            durumKareTV = itemView.findViewById(R.id.durumKareTV);
            durumTV = itemView.findViewById(R.id.durumTV);

        }
    }

}
