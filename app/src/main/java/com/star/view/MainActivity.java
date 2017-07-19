package com.star.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RefreshProgressBar progressBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (RefreshProgressBar) findViewById(R.id.progressBar);
        progressBar.setColorSchemeColors
                (Color.parseColor("#ef2620"), Color.parseColor("#ffa600"),
                        Color.parseColor("#ffee33"), Color.parseColor("#20ef35"));

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleProgress(progressBar.getVisibility() == View.GONE);
            }
        });

    }

    public void toggleProgress(boolean show) {
        if (show) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
        progressBar.setRefreshing(show);
    }

}
