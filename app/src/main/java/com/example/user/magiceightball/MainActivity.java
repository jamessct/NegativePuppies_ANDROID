package com.example.user.magiceightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.InputStream;
import java.util.Random;

/**
 * Created by user on 30/08/2016.
 */
public class MainActivity extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mShakeButton;
    Button mFeedButton;

    Answer mAnswers;
    Answer mFeedPuppies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream file = getResources().openRawResource(R.raw.sandy_answers);
        InputStream file2 = getResources().openRawResource(R.raw.james_answers);

        mAnswers = new AnswersFromFile(file);
        mFeedPuppies = new AnswersFromFile(file2);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mShakeButton = (Button)findViewById(R.id.shake_button);
        mFeedButton = (Button)findViewById(R.id.feed_button);

        mShakeButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick (View view) {
              String question = mQuestionEditText.getText().toString();
              Log.d("EightBall", "ball shook");
              Log.d("EightBall", "The question asked was '"
                        + question + "'");

              String answer = mAnswers.getAnswer();
              Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
              intent.putExtra("answer", answer);

              startActivity(intent);
          }
        });

        mFeedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                String answer = mFeedPuppies.getAnswer();
                Intent intent = new Intent(MainActivity.this, FeedPuppies.class);
                intent.putExtra("answer", answer);

                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_hello) {
            Toast.makeText(MainActivity.this, R.string.menu_toast_hello, Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

