package com.pot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.pot.adapter.CartAdapter;
import com.pot.helper.Functions;
import com.pot.model.Food;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends BaseActivity {

    private android.widget.ImageView imgBack;
    private android.widget.RelativeLayout toolbar;
    private android.support.v7.widget.RecyclerView rvCart;
    private CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        this.rvCart = (RecyclerView) findViewById(R.id.rvCart);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        rvCart.setLayoutManager(new LinearLayoutManager(this));
        List<Food> list = new ArrayList<>();
        list.add(new Food(R.drawable.img1,"Burger",89,2));
        list.add(new Food(R.drawable.img2,"Dora Cake",49,4));
        list.add(new Food(R.drawable.img3,"Pizza",89,1));
        list.add(new Food(R.drawable.img4,"Burger",89,2));
        adapter = new CartAdapter(this,list);
        rvCart.setAdapter(adapter);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Functions.fireIntent(this,false);
    }
}
