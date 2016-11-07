package com.example.user.magiceightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 31/08/2016.
 */
public class FeedPuppies extends AppCompatActivity {

    TextView mPuppyAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed_puppies);

        mPuppyAnswers = (TextView)findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String answer = extras.getString("answer");

        mPuppyAnswers.setText(answer);
    }
}

