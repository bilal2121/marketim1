package com.example.marketim.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marketim.R;
import com.example.marketim.adapter.OrderAdapter;
import com.example.marketim.model.ProductModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {


    private RecyclerView recyclerView;
    private OrderAdapter adapter;
    private ArrayList<ProductModel> arrayList;
    private RecyclerView.LayoutManager layoutManager;
    private View mainView;

    public OrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_order, container, false);

        init();

        setuprecyleView();
        listeyidoldur();
      //  adapter.notifyDataSetChanged();
        
        return mainView;
    }

    private void listeyidoldur() {
        arrayList.add(new ProductModel("1","2","market 1","sabun","15.0","durum"));

    }

    private void setuprecyleView() {

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


    private void init() {

        recyclerView = mainView.findViewById(R.id.orderRV);
        arrayList = new ArrayList<>() ;
        adapter = new OrderAdapter(arrayList);
        layoutManager = new LinearLayoutManager(getContext());
    }

}
