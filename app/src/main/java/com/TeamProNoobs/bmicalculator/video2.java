package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class video2 extends AppCompatActivity {
    public void pic1(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.russiantwist);
    }
    public void pic2(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.plank);
    }
    public void pic3(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.sideleftplank);
    }
    public void pic4(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.dumbellcrunchpunch);
    }
    public void pic5(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.obliquevleft);
    }
    public void pic6(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.cobrastretch);
    }
    Intent w2=getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);
    }
}