package com.example.homersimpson_roger;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView animacioTitol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animacioTitol= findViewById(R.id.titol);
        AnimationDrawable anim=(AnimationDrawable) animacioTitol.getDrawable();
        anim.start();
    }
}
