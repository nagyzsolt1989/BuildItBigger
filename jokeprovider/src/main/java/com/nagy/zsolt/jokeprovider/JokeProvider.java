package com.nagy.zsolt.jokeprovider;

import java.util.Random;

public class JokeProvider {

    private static final String[] jokes = new String[] {
            "How did you like my HTTP 200 joke?\n" +
                    "It was Ok",
            "Why do Python Devs need glasses?\n" +
                    "Because they don't C#.",
            "There are only 10 types of people in the world: those who understand binary, and those who don't.",
            "There are no shortcuts in life, unless you right click and find one...",
            "I'd tell you a joke about UDP, but you probably wouldn't get it.",
            "An ARP request goes to McDonald's and asks for a Big MAC.",
    };

    public JokeProvider() {
    }

    public static String getJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

}
