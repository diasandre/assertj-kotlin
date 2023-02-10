@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.AbstractIntegerAssert
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage

infix fun AbstractIntegerAssert<*>.isEqualTo(expected: Int): AbstractIntegerAssert<*> = isEqualTo(expected)

infix fun AbstractIntegerAssert<*>.isEqualTo(expected: Long): AbstractIntegerAssert<*> = isEqualTo(expected)

infix fun AbstractIntegerAssert<*>.isNotEqualTo(expected: Int): AbstractIntegerAssert<*> = isNotEqualTo(expected)

infix fun AbstractIntegerAssert<*>.isLessThan(other: Int): AbstractIntegerAssert<*> = isLessThan(other)

infix fun AbstractIntegerAssert<*>.isLessThanOrEqualTo(other: Int): AbstractIntegerAssert<*> = isLessThanOrEqualTo(other)

infix fun AbstractIntegerAssert<*>.isGreaterThan(other: Int): AbstractIntegerAssert<*> = isGreaterThan(other)

infix fun AbstractIntegerAssert<*>.isGreaterThanOrEqualTo(other: Int): AbstractIntegerAssert<*> = isGreaterThanOrEqualTo(other)

infix fun AbstractIntegerAssert<*>.isEqualByComparingTo(expected: String): AbstractIntegerAssert<*> = isEqualByComparingTo(expected)

infix fun AbstractIntegerAssert<*>.isCloseTo(block: () -> Pair<Int, Offset<Int>>): AbstractIntegerAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractIntegerAssert<*>.isNotCloseTo(block: () -> Pair<Int, Offset<Int>>): AbstractIntegerAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}

@JvmName("isCloseToPercentage")
infix fun AbstractIntegerAssert<*>.isCloseTo(block: () -> Pair<Int, Percentage>): AbstractIntegerAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

@JvmName("isNotCloseToPercentage")
infix fun AbstractIntegerAssert<*>.isNotCloseTo(block: () -> Pair<Int, Percentage>): AbstractIntegerAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}