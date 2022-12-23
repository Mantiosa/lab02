package com.example.lab2;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class UITest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.lab2", appContext.getPackageName());
    }


    @Test
    public void AnswerButtonIsClickable() {

        onView(withId(R.id.btnCount)).perform(click());
    }
    @Test
    public void InputBoxIsClickable() {

        onView(withId(R.id.edPhrase)).perform(click());
    }
    @Test
    public void SpinnerIsClickable() {

        onView(withId(R.id.spSelectionOptions)).perform(click());
    }
    @Test
    public void TheAppReturnsCorrectAnswerUsingCharacterCounter() {
        final String givenString = "hello there";
        final String expectedResult = "11";

        onView(withId(R.id.edPhrase)).perform(click(), replaceText(givenString));
        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvMain)).check(matches(withText(expectedResult)));
    }



}