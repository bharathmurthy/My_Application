package com.example.kumar.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static android.graphics.Color.RED;


public class MainActivity extends ActionBarActivity {
    Random generator = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView didYouKnow = (TextView) findViewById(R.id.did_you_know);
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/ITCBLKAD.TTF");
        Typeface tf1 = Typeface.createFromAsset(getAssets(),"fonts/PRISTINA.TTF");
        didYouKnow.setTypeface(tf);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        factLabel.setTypeface(tf1);
        final Button nextFact = (Button) findViewById(R.id.nextFactButton);
        final RelativeLayout relative = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factLabel.setText(FactBook.getFact());
                int red = generator.nextInt(255);
                if(red>200)
                    red-=60;
                else if(red < 50)
                    red+=50;
                int green = generator.nextInt(255);
                if(green>200)
                    green-=60;
                else if(green<50)
                     green+=50;
                int blue = generator.nextInt(255);
                if(blue>200)
                    blue-=60;
                else if(blue<50)
                    blue+=50;
                relative.setBackgroundColor(Color.rgb(red,green,blue));
                nextFact.setTextColor(Color.rgb(red,green,blue));
            }
        };

        nextFact.setOnClickListener(listener);
    }
}
