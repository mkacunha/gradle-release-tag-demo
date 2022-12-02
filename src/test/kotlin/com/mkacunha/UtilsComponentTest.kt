package com.mkacunha

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("component")
internal class UtilsComponentTest {

    @Test
    internal fun sum() {
        Thread.sleep(6000)
        assertEquals(2, Utils().sum(1, 1))
    }
}