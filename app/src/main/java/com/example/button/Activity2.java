package com.example.button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button btnSimple2 = (Button) findViewById(R.id.btnSimple2);
        btnSimple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, Activity1990.class);
                startActivity(intent);
            }
        });
        Button btnSimple4 = (Button) findViewById(R.id.btnSimple4);
        btnSimple4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Activity1994.class);
                startActivity(intent);
            }
        });
        Button btnSimple5 = (Button) findViewById(R.id.btnSimple5);
        btnSimple5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Activity1998.class);
                startActivity(intent);
            }
        });
        Button btnSimple6 = (Button) findViewById(R.id.btnSimple6);
        btnSimple6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Activity2002.class);
                startActivity(intent);
            }
        });
        Button btnSimple7 = (Button) findViewById(R.id.btnSimple7);
        btnSimple7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Activity2006.class);
                startActivity(intent);
            }
        });
        Button btnSimple8 = (Button) findViewById(R.id.btnSimple8);
        btnSimple8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Activity2010.class);
                startActivity(intent);
            }
        });
        Button btnSimple9 = (Button) findViewById(R.id.btnSimple9);
        btnSimple9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this,Activity2014.class);
                startActivity(intent);
            }
        });
    }

}

