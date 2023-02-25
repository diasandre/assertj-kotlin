package dev.diasandre.comparable

import org.assertj.core.api.ShortAssert
import org.assertj.core.data.Offset

infix fun ShortAssert.isEqualTo(expected: Short?): ShortAssert = isEqualTo(expected)
infix fun ShortAssert.isNotEqualTo(expected: Short?): ShortAssert = isNotEqualTo(expected)
infix fun ShortAssert.isLessThan(other: Short): ShortAssert = isLessThan(other)
infix fun ShortAssert.isLessThanOrEqualTo(other: Short): ShortAssert = isLessThanOrEqualTo(other)
infix fun ShortAssert.isGreaterThan(other: Short): ShortAssert = isGreaterThan(other)
infix fun ShortAssert.isGreaterThanOrEqualTo(other: Short): ShortAssert = isGreaterThanOrEqualTo(other)
infix fun ShortAssert.isEqualByComparingTo(expected: String): ShortAssert = isEqualByComparingTo(expected)

infix fun ShortAssert.isCloseTo(block: () -> Pair<Short, Offset<Short>>): ShortAssert {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun ShortAssert.isNotCloseTo(block: () -> Pair<Short, Offset<Short>>): ShortAssert {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}