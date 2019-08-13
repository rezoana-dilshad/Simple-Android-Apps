package com.rez.catandiceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //We declare 2 variables for both the ImageViews
    // We have set their ids as redDice and greenDice
    private ImageView imageRedDice;
    private ImageView imageGreenDice;
    private Button button1;

    //declaring a variable for the random number generator
    private Random randomNmbrRed = new Random();
    private Random randomNmbrGreen = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting the imageView variables declared above
        //to their ImageView by finding their ids
        imageRedDice = findViewById(R.id.redDice);
        imageGreenDice = findViewById(R.id.greenDice);

        //connecting the button variable to the Button using ID
        button1 = findViewById(R.id.button1);
        //Set the button to the onclicklistener to roll the dices
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                       rollRedDice();
                                       rollGreenDice();
                                       }
                                   }

        );
        /**
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           rollGreenDice();
                                       }
                                   }

        );
         **/

    }

    private void rollRedDice(){
        //first call the random number generator to get a random int 1-6
        int randomNumber1 = randomNmbrRed.nextInt(6) +1;

        //then change the red dice image according to the generated number
        switch(randomNumber1){
            case 1:
                imageRedDice.setImageResource(R.drawable.dice01);
                break;
            case 2:
                imageRedDice.setImageResource(R.drawable.dice02);
                break;
            case 3:
                imageRedDice.setImageResource(R.drawable.dice03);
                break;
            case 4:
                imageRedDice.setImageResource(R.drawable.dice04);
                break;
            case 5:
                imageRedDice.setImageResource(R.drawable.dice05);
                break;
            case 6:
                imageRedDice.setImageResource(R.drawable.dice06);
                break;
        }

    }
    private void rollGreenDice() {
        //first call the random number generator to get a random int 1-6
        int randomNumber2 = randomNmbrGreen.nextInt(6) + 1;

        //then change the red dice image according to the generated number
        switch (randomNumber2) {
            case 1:
                imageGreenDice.setImageResource(R.drawable.d1);
                break;
            case 2:
                imageGreenDice.setImageResource(R.drawable.d2);
                break;
            case 3:
                imageGreenDice.setImageResource(R.drawable.d3);
                break;
            case 4:
                imageGreenDice.setImageResource(R.drawable.d4);
                break;
            case 5:
                imageGreenDice.setImageResource(R.drawable.d5);
                break;
            case 6:
                imageGreenDice.setImageResource(R.drawable.d6);
                break;
        }
    }
}
