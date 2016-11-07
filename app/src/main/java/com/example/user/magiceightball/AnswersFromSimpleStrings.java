package com.example.user.magiceightball;

import java.util.ArrayList;

/**
 * Created by user on 31/08/2016.
 */
public class AnswersFromSimpleStrings extends Answer {

    public AnswersFromSimpleStrings() {
        super();
        setupAnswers();
    }

    public AnswersFromSimpleStrings(ArrayList<String> answers) {
        super(answers);
    }

    @Override
    public void setupAnswers() {
        String[] answers = {"Try again!",
                      "You wish!",
                      "Not a chance!",
                      "No",
                      "I don't think so",
                      "Probably not",
                      "Not today",
                      "You're not the boss of me",
                      "Could you repeat the question",
                      "Not in a million years",
                      "Nah",
                      "Why would you even ask that?",
                      "Wouldn't you like to know...",
                      "An unlikely story",
                      "Don't get your hopes up",
                      "Yeah whatever buddy",
                      "Whatever you say...",
                      ":(",
                      "Wouldn't you like to know",
                      "Alright then",
                      "What?"};
        for (String answer : answers) {
            add(answer);
        }
    }
}