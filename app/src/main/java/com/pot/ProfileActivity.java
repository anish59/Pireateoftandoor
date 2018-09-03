package com.pot;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.pot.helper.Functions;

public class ProfileActivity extends BaseActivity {

    private android.widget.ImageView imgBack;
    private android.widget.EditText inputName;
    private android.support.design.widget.TextInputLayout inputLayoutName;
    private android.widget.EditText inputEmail;
    private android.support.design.widget.TextInputLayout inputLayoutEmail;
    private android.widget.EditText edtMobile;
    private android.support.design.widget.TextInputLayout inputLayoutMobileNo;
    private android.widget.EditText edtAddress;
    private android.widget.Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        this.btnUpdate = (Button) findViewById(R.id.btnUpdate);
        this.edtAddress = (EditText) findViewById(R.id.edtAddress);
        this.inputLayoutMobileNo = (TextInputLayout) findViewById(R.id.inputLayoutMobileNo);
        this.edtMobile = (EditText) findViewById(R.id.edtMobile);
        this.inputLayoutEmail = (TextInputLayout) findViewById(R.id.inputLayoutEmail);
        this.inputEmail = (EditText) findViewById(R.id.inputEmail);
        this.inputLayoutName = (TextInputLayout) findViewById(R.id.inputLayoutName);
        this.inputName = (EditText) findViewById(R.id.inputName);
        this.imgBack = (ImageView) findViewById(R.id.imgBack);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
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
