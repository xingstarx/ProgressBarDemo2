package com.star.view;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    RefreshProgressBar progressBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (RefreshProgressBar) findViewById(R.id.progressBar);
        progressBar.setColorSchemeColors
                (Color.parseColor("#e41e26"), Color.parseColor("#d43093"),
                        Color.parseColor("#e47626"), Color.parseColor("#e41e26"));

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
