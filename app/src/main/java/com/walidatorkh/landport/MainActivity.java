package com.walidatorkh.landport;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showPortrait();
    }
    public void showPortrait() {
        textView = (TextView) findViewById(R.id.ViewTextOrientation);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            textView.setText("Portrait");
        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            textView.setText("Landscape");
        }
    }
}
