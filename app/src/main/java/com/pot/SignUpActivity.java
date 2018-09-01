package com.pot;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends BaseActivity {

    private android.widget.TextView txtLabelSignUP;
    private android.view.View viewLine;
    private android.widget.EditText inputEmail;
    private android.support.design.widget.TextInputLayout inputLayoutEmail;
    private android.widget.EditText edtMobile;
    private android.support.design.widget.TextInputLayout inputLayoutMobileNo;
    private android.widget.EditText inputPassword;
    private android.support.design.widget.TextInputLayout inputLayoutPassword;
    private android.widget.Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        setContentView(R.layout.activity_sign_up);
        this.btnSignUp = (Button) findViewById(R.id.btnSignUp);
        this.inputLayoutPassword = (TextInputLayout) findViewById(R.id.inputLayoutPassword);
        this.inputPassword = (EditText) findViewById(R.id.inputPassword);
        this.inputLayoutMobileNo = (TextInputLayout) findViewById(R.id.inputLayoutMobileNo);
        this.edtMobile = (EditText) findViewById(R.id.edtMobile);
        this.inputLayoutEmail = (TextInputLayout) findViewById(R.id.inputLayoutEmail);
        this.inputEmail = (EditText) findViewById(R.id.inputEmail);
        this.viewLine = (View) findViewById(R.id.viewLine);
        this.txtLabelSignUP = (TextView) findViewById(R.id.txtLabelSignUP);

        txtLabelSignUP.setTypeface(balooFont);
        btnSignUp.setTypeface(balooFont);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });


    }
}
