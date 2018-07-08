package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.test.AndroidTestCase;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

import com.nagy.zsolt.displayjoke.DisplayJoke;

import junit.framework.Assert;

import static org.junit.Assert.assertNotEquals;

public class AndroidTest extends AndroidTestCase implements OnTaskCompleted{

    public void testVerifyResponse() {
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        OnTaskCompleted taskCompleted = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), AndroidTest.this);
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), "TEXT"));
        try {
            result = endpointsAsyncTask.get();
            //check for not null
            Assert.assertFalse(TextUtils.isEmpty(result));
            Log.d("NOT_EMPTY", "Retrieved a non-empty string successfully: " + result);
            //check for errors
            assertNotEquals("Connection refused", result);
            assertNotEquals("Connection timeout", result);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }

    @Override
    public void onTaskCompleted(String response) {
        Intent intent = new Intent(getContext(), DisplayJoke.class);
        intent.putExtra("JOKE_KEY", response);
        getContext().startActivity(intent);
    }
}
