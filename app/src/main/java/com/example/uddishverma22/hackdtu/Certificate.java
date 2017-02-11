package com.example.uddishverma22.hackdtu;

import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

public class Certificate extends AppCompatActivity {

    ActionBar.LayoutParams layoutParams;
    Display display;
    ImageView certi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        display = getWindowManager().getDefaultDisplay();

//        layoutParams.height = (int) (display.getHeight()*0.55);
//        layoutParams.width = display.getWidth();
//        certi.setLayoutParams(layoutParams);
//        certi.setImageResource(R.drawable.certi);
    }
}
