@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.IntegerAssert
import org.assertj.core.data.Offset

infix fun IntegerAssert.isEqualTo(expected: Int): IntegerAssert = isEqualTo(expected)
infix fun IntegerAssert.iOsEqualTo(expected: Long): IntegerAssert = isEqualTo(expected)
infix fun IntegerAssert.isNotEqualTo(expected: Int): IntegerAssert = isNotEqualTo(expected)
infix fun IntegerAssert.isLessThan(other: Int): IntegerAssert = isLessThan(other)
infix fun IntegerAssert.isLessThanOrEqualTo(other: Int): IntegerAssert = isLessThanOrEqualTo(other)
infix fun IntegerAssert.isGreaterThan(other: Int): IntegerAssert = isGreaterThan(other)
infix fun IntegerAssert.isGreaterThanOrEqualTo(other: Int): IntegerAssert = isGreaterThanOrEqualTo(other)
infix fun IntegerAssert.isEqualByComparingTo(expected: String): IntegerAssert = isEqualByComparingTo(expected)

infix fun IntegerAssert.isCloseTo(block: () -> Pair<Int, Offset<Int>>): IntegerAssert {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun IntegerAssert.isNotCloseTo(block: () -> Pair<Int, Offset<Int>>): IntegerAssert {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}