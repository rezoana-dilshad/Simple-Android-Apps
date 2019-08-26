package com.rez.uploaderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar pBar, pBarHorizontal;
    Button start, end, upload;
    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pBar = findViewById(R.id.pBar);
        pBarHorizontal = findViewById(R.id.pBarHorizontal);

        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        upload = findViewById(R.id.upload);

        pBar.setVisibility(View.GONE);
    }

    public void start(View view)
    {
        pBar.setVisibility(View.VISIBLE);
    }

    public void end(View view)
    {
        pBar.setVisibility(View.GONE);

    }

    public void upload(View view)
    {
        fakeProgress(progress);
    }

    public void fakeProgress(final int progress)
    {
        pBarHorizontal.setProgress(progress);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fakeProgress(progress + 10);
            }
        });
        thread.start();
    }
}
