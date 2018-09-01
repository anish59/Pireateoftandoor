package com.pot;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pot.helper.Functions;

public class LoginActivity extends BaseActivity {

    private android.widget.TextView txtLabelLogin;
    private android.view.View viewLine;
    private android.widget.EditText txtEmail;
    private android.support.design.widget.TextInputLayout inputLayoutEmail;
    private android.widget.EditText txtPassword;
    private android.support.design.widget.TextInputLayout inputLayoutPassword;
    private android.widget.TextView txtForgotPassword;
    private android.widget.TextView txtSignUP;
    private android.widget.Button btnLogin;
    private TextView txtPrefixSignUp;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        init();


    }

    private void init() {
        setContentView(R.layout.activity_login);
        this.txtPrefixSignUp = (TextView) findViewById(R.id.txtPrefixSignUp);
        this.btnLogin = (Button) findViewById(R.id.btnLogin);
        this.txtSignUP = (TextView) findViewById(R.id.txtSignUP);
        this.txtForgotPassword = (TextView) findViewById(R.id.txtForgotPassword);
        this.inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);
        this.txtPassword = (EditText) findViewById(R.id.inputPassword);
        this.inputLayoutEmail = (TextInputLayout) findViewById(R.id.inputLayoutEmail);
        this.txtEmail = (EditText) findViewById(R.id.inputEmail);
        this.viewLine = (View) findViewById(R.id.viewLine);
        this.txtLabelLogin = (TextView) findViewById(R.id.txtLabelLogin);


        txtLabelLogin.setTypeface(balooFont);
        btnLogin.setTypeface(balooFont);

        txtPrefixSignUp.setTypeface(robotoThin);
        txtSignUP.setTypeface(robotoThin);
        txtForgotPassword.setTypeface(robotoThin);

        actionListeners();
    }

    private void actionListeners() {
        txtSignUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Functions.fireIntent(LoginActivity.this, SignUpActivity.class, false);
            }
        });
    }
}
