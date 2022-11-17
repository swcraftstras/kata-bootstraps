package com.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class
HelloWorldTest {

    @Test
    fun greeting() {
        assertEquals("Hello Wordl", HelloWorld().greeting())
    }
}