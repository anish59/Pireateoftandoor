package com.pot.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pot.R;
import com.pot.adapter.FoodAdapter;
import com.pot.model.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodMenuFragment extends Fragment {
    private View view;
    private RecyclerView rvFoodMenu;
    private FoodAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_food_menu,container,false);
        init();
        return view;
    }

    private void init() {
        rvFoodMenu = (RecyclerView)view.findViewById(R.id.rvFoodMenu);
        rvFoodMenu.setLayoutManager(new GridLayoutManager(getActivity(),2));
        List<Food> list = new ArrayList<>();
        list.add(new Food(R.drawable.img1,"Burger",89,0));
        list.add(new Food(R.drawable.img2,"Dora Cake",49,0));
        list.add(new Food(R.drawable.img3,"Pizza",89,0));
        list.add(new Food(R.drawable.img4,"Burger",89,0));
        list.add(new Food(R.drawable.img3,"Pizza",289,0));
        list.add(new Food(R.drawable.img1,"Burger",89,0));
        list.add(new Food(R.drawable.img4,"Burger",89,0));
        list.add(new Food(R.drawable.img2,"Dora Cake",189,0));
        list.add(new Food(R.drawable.img3,"Pizza",289,0));
        list.add(new Food(R.drawable.img1,"Burger",89,0));
        adapter = new FoodAdapter(getActivity(),list);
        rvFoodMenu.setAdapter(adapter);
    }
}
