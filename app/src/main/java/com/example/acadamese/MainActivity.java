package com.example.acadamese;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if(view.getId()==R.id.c1){
                i = new Intent(this,MainActivity2.class);
                startActivity(i);

            }
        if(view.getId()==R.id.c2){
            i = new Intent(this,MainActivity3.class);
            startActivity(i);
        }
        }

}