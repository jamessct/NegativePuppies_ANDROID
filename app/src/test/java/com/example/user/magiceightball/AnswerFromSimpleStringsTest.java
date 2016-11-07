package com.example.user.magiceightball;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 31/08/2016.
 */
public class AnswerFromSimpleStringsTest {
    Answer answer;

    @Before
    public void theAnswer() {
        answer = new AnswersFromSimpleStrings();
    }

    @Test
    public void getAnswersTest() {
        assertNotNull(answer.getAnswers());
    }

    @Test
    public void getLengthTest() {
        assertEquals(2, answer.getLength());
    }

    @Test
    public void getAnswerTest() {
        assertNotNull(answer.getAnswer());
    }

    @Test
    public void getAnswerAtIndexTest() {
        assertEquals("Yes", answer.getAnswerAtIndex(0));
    }
}
