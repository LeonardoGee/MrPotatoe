package com.example.mitchell.mrpotatohead;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onToggleButtonOn();
        setFont();


    }
    // set font
    public void setFont(){
        String fontPath = "fonts/SF Slapstick Comic Shaded.ttf";
        TextView txtGhost = (TextView) findViewById(R.id.textView);
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        txtGhost.setTypeface(tf);
    }
    // for each imageview set visibility when button toggled
    public void onToggleButtonOn(){
        ToggleButton toggleEars = (ToggleButton) findViewById(R.id.toggleButtonEars);
        toggleEars.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.ears);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleNose = (ToggleButton) findViewById(R.id.toggleButtonNose);
        toggleNose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.nose);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleMouth = (ToggleButton) findViewById(R.id.toggleButtonMouth);
        toggleMouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.mouth);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleEyes = (ToggleButton) findViewById(R.id.toggleButtonEyes);
        toggleEyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.eyes);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleGlasses = (ToggleButton) findViewById(R.id.toggleButtonGlasses);
        toggleGlasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.glasses);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleArms = (ToggleButton) findViewById(R.id.toggleButtonArms);
        toggleArms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.arms);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleShoes = (ToggleButton) findViewById(R.id.toggleButtonShoes);
        toggleShoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.shoes);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleEyebrows = (ToggleButton) findViewById(R.id.toggleButtonEyebrows);
        toggleEyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.eyebrows);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleMustache = (ToggleButton) findViewById(R.id.toggleButtonMustache);
        toggleMustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.mustache);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        ToggleButton toggleHat = (ToggleButton) findViewById(R.id.toggleButtonHat);
        toggleHat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ImageView ears = (ImageView)findViewById(R.id.hat);
                if (isChecked)
                {
                    ears.setVisibility(View.VISIBLE);

                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

    }








}

