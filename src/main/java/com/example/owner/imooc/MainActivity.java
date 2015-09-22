package com.example.owner.imooc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    //API key:590a628d0196ebb4301d50f08850e90c
    //API SECRET:muTDKccKpNC0PQhGaNjfBihojnVK2_sw
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                startActivity(new Intent(this, QQSlidingMenuActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, HowOldActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, BothMenuActivity.class));
                break;
        }
    }
}
