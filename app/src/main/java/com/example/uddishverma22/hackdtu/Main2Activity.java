package com.example.uddishverma22.hackdtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    CardView card1, card2, card3;

    String flag = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate_list_activity);

        card1 = (CardView) findViewById(R.id.card_1);
        card2 = (CardView) findViewById(R.id.card_2);
        card3 = (CardView) findViewById(R.id.card_3);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, DetailedListView.class);
                i.putExtra("flag", "one");
                startActivity(i);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, DetailedListView.class);
                i.putExtra("flag", "two");
                startActivity(i);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, DetailedListView.class);
                i.putExtra("flag", "three");
                startActivity(i);
            }
        });



    }
}
