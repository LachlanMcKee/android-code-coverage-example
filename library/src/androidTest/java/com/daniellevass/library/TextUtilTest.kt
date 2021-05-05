package com.daniellevass.library

import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test for TextUtil
 */
@RunWith(AndroidJUnit4::class)
class TextUtilTest {
    @Test
    fun useAppContext() {
        assertEquals("helloworld", TextUtil.concat("hello", "world"))
    }
}