package com.pot;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    private android.widget.TextView txtLabelLogin;
    private android.view.View viewLine;
    private android.widget.EditText txtEmail;
    private android.support.design.widget.TextInputLayout inputLayoutEmail;
    private android.widget.EditText txtPassword;
    private android.support.design.widget.TextInputLayout inputLayoutPassword;
    private android.widget.TextView txtForgotPassword;
    private android.widget.TextView txtSignUP;
    private EditText inputEmail;
    private EditText inputPassword;
    private android.widget.Button btnLogin;
    private TextView txtPrefixSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.txtPrefixSignUp = (TextView) findViewById(R.id.txtPrefixSignUp);
        this.btnLogin = (Button) findViewById(R.id.btnLogin);
        this.inputPassword = (EditText) findViewById(R.id.inputPassword);
        this.inputEmail = (EditText) findViewById(R.id.inputEmail);
        this.txtSignUP = (TextView) findViewById(R.id.txtSignUP);
        this.txtForgotPassword = (TextView) findViewById(R.id.txtForgotPassword);
        this.inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);
        this.txtPassword = (EditText) findViewById(R.id.inputPassword);
        this.inputLayoutEmail = (TextInputLayout) findViewById(R.id.inputLayoutEmail);
        this.txtEmail = (EditText) findViewById(R.id.inputEmail);
        this.viewLine = (View) findViewById(R.id.viewLine);
        this.txtLabelLogin = (TextView) findViewById(R.id.txtLabelLogin);


        txtLabelLogin.setTypeface(balooFont);
//        inputLayoutEmail.setTypeface(balooFont);
//        txtEmail.setTypeface(balooFont);
//        txtPassword.setTypeface(balooFont);
//        inputLayoutPassword.setTypeface(balooFont);
        btnLogin.setTypeface(balooFont);

        txtPrefixSignUp.setTypeface(robotoThin);
        txtSignUP.setTypeface(robotoThin);
        txtForgotPassword.setTypeface(robotoThin);
    }
}
