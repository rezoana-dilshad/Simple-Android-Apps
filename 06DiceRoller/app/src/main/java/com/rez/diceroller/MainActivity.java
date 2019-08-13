package com.rez.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //We need to find the buttons / images we are adding
    //Finding the imageView
    //we have set the ID as image1
    //So now we declare our variable as
    private ImageView imageViewDice1;

    //We need to generate a random number between 1-6
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find that Imageview using its ID
        imageViewDice1 = findViewById(R.id.image1);
        //and set an Onclicklistener to it
        imageViewDice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call the method to roll the dice
                rollOurDice();
            }
        });
    }
    private void rollOurDice(){
        int aRandomNumber = myRandomNumber.nextInt(6) + 1;

        //Now we need to choose the picture that will be shown
        //according to the number generated
        switch (aRandomNumber) {
            case 1:
                imageViewDice1.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDice1.setImageResource(R.drawable.dice2);
                break;

            case 3:
                imageViewDice1.setImageResource(R.drawable.dice3);
                break;

            case 4:
                imageViewDice1.setImageResource(R.drawable.dice4);
                break;

            case 5:
                imageViewDice1.setImageResource(R.drawable.dice5);
                break;

            case 6:
                imageViewDice1.setImageResource(R.drawable.dice6);
                break;
        }
    }



}
