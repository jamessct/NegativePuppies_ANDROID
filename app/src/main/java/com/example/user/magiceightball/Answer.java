package com.example.user.magiceightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 31/08/2016.
 */
public abstract class Answer implements Answerable {

    protected ArrayList<String> mAnswers;

    public Answer() {
        mAnswers = new ArrayList<String>();
    }

    public Answer(ArrayList<String> answer) {
        mAnswers = new ArrayList<String>(answer);
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>(mAnswers);
    }

    public void add(String answer) {
        mAnswers.add(answer);
    }

    public int getLength() {
        return mAnswers.size();
    }

    public String getAnswerAtIndex(int index) {
        return mAnswers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listLength = getLength();
        int index = rand.nextInt(listLength);
        String answer = getAnswerAtIndex(index);
        return answer;
    }

    abstract public void setupAnswers();
}
