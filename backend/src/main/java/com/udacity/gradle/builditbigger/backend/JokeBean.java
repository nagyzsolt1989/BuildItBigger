package com.udacity.gradle.builditbigger.backend;

import com.nagy.zsolt.jokeprovider.JokeProvider;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    public JokeBean() {
    }

    public String getJoke() {
        return JokeProvider.getJoke();
    }
}