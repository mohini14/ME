package com.lawconcierge.me;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by mohini on 12/01/18.
 */

public class CreateAccountActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        setLayouts( );
    }

    private void setLayouts() {

        Toolbar toolbar = findViewById(R.id.meAppToolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Create Account");
        toolbar.setNavigationIcon(R.drawable.left_arrow);

        if(getSupportActionBar() != null) {
            getSupportActionBar( ).setDisplayHomeAsUpEnabled(true);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                onBackPressed();

            }

        });
    }

}
