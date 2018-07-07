package com.nagy.zsolt.displayjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();

        String joke = intent.getStringExtra("JOKE_KEY");

        TextView mJokeTextView = findViewById(R.id.tv_joke);

        mJokeTextView.setText(joke);
    }
}
