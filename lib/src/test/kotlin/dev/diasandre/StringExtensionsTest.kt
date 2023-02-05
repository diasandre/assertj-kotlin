package dev.diasandre

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class StringExtensionsTest {

    @Test
    fun `should pass if isEqual from wrapper is equal to core`() {
        val actual = "value"
        val expected = "value"
        assertThat(actual) isEqualTo expected
        assertThat(actual).isEqualTo(expected)
    }
}