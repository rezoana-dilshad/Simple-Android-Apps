package com.rez.changingscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button screen2;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen2 = findViewById(R.id.screen2);
        /*back = findViewById(R.id.back);*/
        editText = findViewById(R.id.edittext);

        screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if(TextUtils.isEmpty(input)){
                    editText.setError("No input found");
                }else{
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("name", input);

                    startActivity(intent);
                }


            }
        });



    }

}
