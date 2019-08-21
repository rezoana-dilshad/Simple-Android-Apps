package com.rez.burgerrating;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);
    }

    public void submit(View view)
    {
        //first we need to get what rating the user is providing
        float ratingValue = ratingBar.getRating();

        if(ratingValue < 2)
        {
            textView.setText("Rating: " + ratingValue + "\nThanks for your rating, we will try better next time");
        }
        if(ratingValue >=2 && ratingValue <=3)
        {
            textView.setText("Rating: " + ratingValue + "\nThanks for your rating, we are constantly improving");
        }
        if(ratingValue >3 && ratingValue <=4.4)
        {
            textView.setText("Rating: " + ratingValue + "\nThanks for your rating, we would love to serve you again");
        }
        if(ratingValue >4.4)
        {
            textView.setText("Rating: " + ratingValue + "\nThanks for your rating, glad you enjoyed");
        }
    }
}
