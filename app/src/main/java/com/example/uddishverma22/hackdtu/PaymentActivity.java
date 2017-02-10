package com.example.uddishverma22.hackdtu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class PaymentActivity extends AppCompatActivity {

    ImageView add, minus;
    EditText amount;
    int amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        amount = (EditText) findViewById(R.id.payment_amt);
        add = (ImageView) findViewById(R.id.money_inc);
        minus = (ImageView) findViewById(R.id.money_dec);

        amt = Integer.parseInt((amount.getText().toString()));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amt < 10)   {
                    amount.setText(String.valueOf(amt + 1));
                    amt = amt + 1;

                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amt > 0 && amt <= 10)   {
                    amount.setText(String.valueOf(amt -1));
                    amt = amt - 1;
                }
            }
        });
    }
}
