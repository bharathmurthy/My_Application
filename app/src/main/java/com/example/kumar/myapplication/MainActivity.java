package com.example.kumar.myapplication;

import android.graphics.Color;
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

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button nextFact = (Button) findViewById(R.id.nextFactButton);
        final RelativeLayout relative = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factLabel.setText(FactBook.getFact());
                relative.setBackgroundColor(Color.rgb(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255)));

            }
        };

        nextFact.setOnClickListener(listener);
        String message = "Yay! our activity was created";
        Toast toast = Toast.makeText(this,message,Toast.LENGTH_LONG);
        toast.show();
    }
}
