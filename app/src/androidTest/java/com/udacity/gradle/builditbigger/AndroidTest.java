package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

import junit.framework.Assert;

public class AndroidTest extends AndroidTestCase {

    public void testVerifyResponse() {
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), "TEXT"));
        try {
            result = endpointsAsyncTask.get();
            Assert.assertFalse(TextUtils.isEmpty(result));
            Log.d("NOT_EMPTY", "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            Assert.assertNull(e);
        }
    }
}
