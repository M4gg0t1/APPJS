package com.example.jsapp;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context de la aplicación bajo prueba
        Context appContext = InstrumentationRegistry.getInstrumentation().getContext();
        assertEquals("com.example.jsapp", appContext.getPackageName());
    }
}