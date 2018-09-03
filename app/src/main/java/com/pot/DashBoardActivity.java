package com.pot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pot.fragment.FoodMenuFragment;
import com.pot.helper.AppConstants;
import com.pot.helper.Functions;

public class DashBoardActivity extends AppCompatActivity {

    private int SELECTED_FRAGMENT  = AppConstants.HOME_FRAGMENT;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    if(SELECTED_FRAGMENT != AppConstants.HOME_FRAGMENT){
                        SELECTED_FRAGMENT = AppConstants.HOME_FRAGMENT;
                        pushFragment(new FoodMenuFragment());
                    }
                    return true;
                case R.id.navigation_order:
                    if(SELECTED_FRAGMENT != AppConstants.ORDER_HISTORY_FRAGMENT){
                        SELECTED_FRAGMENT = AppConstants.ORDER_HISTORY_FRAGMENT;
//                        pushFragment();
                    }
                    return true;
            }
            return false;
        }
    };
    private FragmentManager fm;
    private ImageView imgCart;
    private ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        imgCart = (ImageView) findViewById(R.id.imgCart);
        imgProfile = (ImageView) findViewById(R.id.imgProfile);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fm = getSupportFragmentManager();

        pushFragment(new FoodMenuFragment());

        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, CartActivity.class);
                Functions.fireIntent(DashBoardActivity.this,intent,true);
            }
        });
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, ProfileActivity.class);
                Functions.fireIntent(DashBoardActivity.this,intent,true);
            }
        });
    }

    public void pushFragment(Fragment fragment) {
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, fragment);
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
