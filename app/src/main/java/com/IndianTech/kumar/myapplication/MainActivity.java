package com.IndianTech.kumar.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {
    Random generator = new Random();
    Context mContext=MainActivity.this;
    SharedPreferences appPreferences;
    boolean isAppInstalled = false;
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
        appPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        isAppInstalled = appPreferences.getBoolean("isAppInstalled",false);
        if(isAppInstalled==false) {
            Intent shortcutIntent = new Intent(getApplicationContext(),
                    MainActivity.class);
            shortcutIntent.setAction(Intent.ACTION_MAIN);
            Intent addIntent = new Intent();
            addIntent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);
            addIntent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "FunFacts!");
            addIntent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE,
                    Intent.ShortcutIconResource.fromContext(getApplicationContext(),
                            R.drawable.ic_launcher));
            addIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            getApplicationContext().sendBroadcast(addIntent);
        }
        SharedPreferences.Editor editor = appPreferences.edit();
        editor.putBoolean("isAppInstalled", true);
        editor.commit();
    }
}
