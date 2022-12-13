package com.mkacunha

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("unit")
internal class UtilsTest {

    @Test
    internal fun sum() {
        assertEquals(2, Utils().sum(1, 1))
    }

}
