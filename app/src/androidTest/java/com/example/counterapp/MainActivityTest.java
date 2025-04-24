package com.example.counterapp;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

/*
 * Test case 1: Menekan tombol tambah akan menambah angka
 * Test case 2: Menekan tombol kurang akan mengurangi angka
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testIncrementButton() {
        onView(withId(R.id.button_increment)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("1")));
    }

    @Test
    public void testDecrementButton() {
        onView(withId(R.id.button_decrement)).perform(click());
        onView(withId(R.id.text_result)).check(matches(withText("-1")));
    }
}
