package com.lawconcierge.me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        setUpLayoutAttributes();
        manageKeyboardOnScreen();
    }

    @Override
    public void onClick(View view) {

        int viewId = view.getId();

        switch (viewId){

            case R.id.signinButton :

                signUpButtonPressed();
                break;
        }
    }

    /**
     * method is used to link layout views with class objects
     */
    private void setUpLayoutAttributes(){

        mUsernameTextField = findViewById(R.id.usernameEditText);
        mPasswordTextField = findViewById(R.id.passwordEditText);
        findViewById(R.id.signinButton).setOnClickListener(this);
    }

    // method manages the keyboard on touch
    public void manageKeyboardOnScreen(){

        Utility.hideKeyboard(this);
    }

    // Actions on activity

    private void signUpButtonPressed() {

        String username = this.mUsernameTextField.getText( ).toString( );
        String password = this.mPasswordTextField.getText( ).toString( );

        if(Validate.validateEmail(this, username)  && Validate.validatePassword(this, password)){
            //todo
        }

    }
}
