package com.example.homersimpson_roger;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView animacioTitol;
    ImageView ull,donut,enVermell,enVerd,enBlau;
    boolean estaVisible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animacioTitol= findViewById(R.id.titol);
        ull=findViewById(R.id.ull);
        donut=findViewById(R.id.donut);
        enVermell=findViewById(R.id.enVermell);
        enVerd=findViewById(R.id.enVerd);
        enBlau=findViewById(R.id.enBlau);
        ull.setVisibility(View.INVISIBLE);
        donut.setVisibility(View.INVISIBLE);
        enVermell.setVisibility(View.INVISIBLE);
        enVerd.setVisibility(View.INVISIBLE);
        enBlau.setVisibility(View.INVISIBLE);
        estaVisible=false;
        animacioTitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(estaVisible==false){
                    ull.setVisibility(View.VISIBLE);
                    donut.setVisibility(View.VISIBLE);
                    enVermell.setVisibility(View.VISIBLE);
                    enVerd.setVisibility(View.VISIBLE);
                    enBlau.setVisibility(View.VISIBLE);
                    estaVisible=true;
                }else if(estaVisible==true){
                    ull.setVisibility(View.INVISIBLE);
                    donut.setVisibility(View.INVISIBLE);
                    enVermell.setVisibility(View.INVISIBLE);
                    enVerd.setVisibility(View.INVISIBLE);
                    enBlau.setVisibility(View.INVISIBLE);
                    estaVisible=false;
                }
            }
        });

        AnimationDrawable anim=(AnimationDrawable) animacioTitol.getDrawable();
        anim.start();
    }


}
