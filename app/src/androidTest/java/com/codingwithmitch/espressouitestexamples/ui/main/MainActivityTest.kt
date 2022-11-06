package com.codingwithmitch.espressouitestexamples.ui.main

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import org.junit.Rule
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get:Rule
    val activityScenario:ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testActivity_inView() {
        onView(withId(R.id.main)).check(matches(isDisplayed()))
        onView(withId(R.id.button_next_activity)).perform(click())
        onView(withId(R.id.button_back)).perform(click())
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }



}
















