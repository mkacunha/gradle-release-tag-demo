package com.mkacunha

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.concurrent.thread

@Tag("integration")
internal class UtilsIntegrationTest {

    @Test
    internal fun sum() {
        Thread.sleep(3000)
        assertEquals(2, Utils().sum(1, 1))
    }
}