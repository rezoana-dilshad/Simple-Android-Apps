package com.rez.quickcolorchanger;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.rgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId)
                {
                    case R.id.rbtnblue:
                        layout.setBackgroundColor(Color.parseColor("#4BCFFA"));
                        break;

                    case R.id.rbtngreen:
                        layout.setBackgroundColor(Color.parseColor("#75DA8B"));
                        break;

                    case R.id.rbtnred:
                        layout.setBackgroundColor(Color.parseColor("#EC4849"));
                        break;
                }
            }
        });

    }
}
