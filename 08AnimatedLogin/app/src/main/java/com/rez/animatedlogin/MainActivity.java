package com.rez.animatedlogin;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    //private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        //To start with the animation
        //get the background to the Animation at first
        AnimationDrawable animationDrawable = (AnimationDrawable) layout.getBackground();
        //set entry and exit duration
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

        //find the button
        //button.findViewById(R.id.button3);
        //To apply the disabled state to the button
       // button.setEnabled(false);

    }
}
