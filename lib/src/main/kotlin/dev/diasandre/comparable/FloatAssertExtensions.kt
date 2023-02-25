package dev.diasandre.comparable

import org.assertj.core.api.FloatAssert
import org.assertj.core.data.Offset

infix fun FloatAssert.isEqualTo(expected: Float): FloatAssert = isEqualTo(expected)
infix fun FloatAssert.isNotEqualTo(other: Float): FloatAssert = isEqualTo(other)
infix fun FloatAssert.isLessThan(other: Float): FloatAssert = isLessThan(other)
infix fun FloatAssert.isLessThanOrEqualTo(other: Float): FloatAssert = isLessThanOrEqualTo(other)
infix fun FloatAssert.isGreaterThan(other: Float): FloatAssert = isGreaterThan(other)
infix fun FloatAssert.isGreaterThanOrEqualTo(other: Float): FloatAssert = isGreaterThanOrEqualTo(other)

infix fun FloatAssert.isCloseTo(block: () -> Pair<Float, Offset<Float>>): FloatAssert {
    val (expected: Float, offset: Offset<Float>) = block()
    return isCloseTo(expected, offset)
}

infix fun FloatAssert.isNotClose(block: () -> Pair<Float, Offset<Float>>): FloatAssert {
    val (expected: Float, offset: Offset<Float>) = block()
    return isNotCloseTo(expected, offset)
}

infix fun FloatAssert.isEqualTo(block: () -> Pair<Float, Offset<Float>>): FloatAssert {
    val (expected: Float, offset: Offset<Float>) = block()
    return isEqualTo(expected, offset)
}