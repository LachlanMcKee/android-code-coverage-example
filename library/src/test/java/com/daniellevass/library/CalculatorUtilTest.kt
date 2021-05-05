package com.daniellevass.library

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Unit tests for CalculatorUtil
 */
class CalculatorUtilTest {

    @Test
    fun add() {
        assertEquals(3, CalculatorUtil.add(1, 2))
    }

    @Test
    fun subtract() {
        assertEquals(10, CalculatorUtil.subtract(15, 5))
    }
}