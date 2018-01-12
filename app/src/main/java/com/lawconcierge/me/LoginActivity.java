package com.lawconcierge.me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mUsernameTextField;
    private EditText mPasswordTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUpLayoutAttributes( );
    }

    @Override
    public void onClick(View view) {

        switch (view.getId( )) {

            case R.id.signinButton :

                signInButtonPressed( );
                break;

            case R.id.createAccountButton :

                createNewAccountButtonPressed( );
                break;

            case R.id.forgotPasswordButton :

                forgotPasswordButtonPressed( );
                break;
        }
    }

    /**
     * method is used to link layout views with class objects
     */
    private void setUpLayoutAttributes() {

        mUsernameTextField = findViewById(R.id.usernameEditText);
        mPasswordTextField = findViewById(R.id.passwordEditText);

        findViewById(R.id.signinButton).setOnClickListener(this);
        findViewById(R.id.createAccountButton).setOnClickListener(this);
        findViewById(R.id.forgotPasswordButton).setOnClickListener(this);

        Utility.manageKeyboardOnView(this, R.id.loginlayout1);
    }


    /**
     * Method on success login credential opens home screen else shows error message.
     */
    private void signInButtonPressed() {

        String username = this.mUsernameTextField.getText( ).toString( );
        String password = this.mPasswordTextField.getText( ).toString( );

        if (Validate.validateEmail(this, username) && Validate.validatePassword(this, password)) {
            //todo
        }
    }

    /**
     * Method opens create new account page
     */
    private void createNewAccountButtonPressed() {
        Intent myIntent = new Intent(this, CreateAccountActivity.class);
        this.startActivity(myIntent);
    }

    /**
     * Method opens Forgot password screen
     */
    private void forgotPasswordButtonPressed() {
        Intent myIntent = new Intent(this, ForgotPasswordActivity.class);
        this.startActivity(myIntent);
    }
}
