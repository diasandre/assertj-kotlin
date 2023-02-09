package dev.diasandre.comparable

import org.assertj.core.api.AbstractFloatAssert
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage

infix fun AbstractFloatAssert<*>.isEqualTo(expected: Float): AbstractFloatAssert<*> = isEqualTo(expected)
infix fun AbstractFloatAssert<*>.isNotEqualTo(other: Float): AbstractFloatAssert<*> = isEqualTo(other)
infix fun AbstractFloatAssert<*>.isLessThan(other: Float): AbstractFloatAssert<*> = isLessThan(other)
infix fun AbstractFloatAssert<*>.isLessThanOrEqualTo(other: Float): AbstractFloatAssert<*> = isLessThanOrEqualTo(other)
infix fun AbstractFloatAssert<*>.isGreaterThan(other: Float): AbstractFloatAssert<*> = isGreaterThan(other)
infix fun AbstractFloatAssert<*>.isGreaterThanOrEqualTo(other: Float): AbstractFloatAssert<*> = isGreaterThanOrEqualTo(other)

infix fun AbstractFloatAssert<*>.isCloseTo(block: () -> Pair<Float, Offset<Float>>): AbstractFloatAssert<*> {
    val (expected: Float, offset: Offset<Float>) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractFloatAssert<*>.isNotClose(block: () -> Pair<Float, Offset<Float>>): AbstractFloatAssert<*> {
    val (expected: Float, offset: Offset<Float>) = block()
    return isNotCloseTo(expected, offset)
}

infix fun AbstractFloatAssert<*>.isCloseTo(block: () -> Pair<Float, Percentage>): AbstractFloatAssert<*> {
    val (expected: Float, offset: Percentage) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractFloatAssert<*>.isNotClose(block: () -> Pair<Float, Percentage>): AbstractFloatAssert<*> {
    val (expected: Float, offset: Percentage) = block()
    return isNotCloseTo(expected, offset)
}

infix fun AbstractFloatAssert<*>.isEqualTo(block: () -> Pair<Float, Offset<Float>>): AbstractFloatAssert<*> {
    val (expected: Float, offset: Offset<Float>) = block()
    return isEqualTo(expected, offset)
}