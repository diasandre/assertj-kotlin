@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.DoubleAssert
import org.assertj.core.data.Offset

infix fun DoubleAssert.isEqualTo(expected: Double): DoubleAssert = isEqualTo(expected)
infix fun DoubleAssert.isEqualTo(expected: String): DoubleAssert = isEqualTo(expected)
infix fun DoubleAssert.isEqualTo(expected: Long): DoubleAssert = isEqualTo(expected)

infix fun DoubleAssert.isCloseTo(block: () -> Pair<Double, Offset<Double>>): DoubleAssert {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun DoubleAssert.isNotCloseTo(block: () -> Pair<Double, Offset<Double>>): DoubleAssert {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}