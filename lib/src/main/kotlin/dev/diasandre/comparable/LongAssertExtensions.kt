@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.LongAssert
import org.assertj.core.data.Offset

infix fun LongAssert.isEqualTo(expected: Long): LongAssert = isEqualTo(expected)
infix fun LongAssert.isNotEqualTo(expected: Long): LongAssert = isNotEqualTo(expected)
infix fun LongAssert.isLessThan(other: Long): LongAssert = isLessThan(other)
infix fun LongAssert.isLessThanOrEqualTo(other: Long): LongAssert = isLessThanOrEqualTo(other)
infix fun LongAssert.isGreaterThan(other: Long): LongAssert = isGreaterThan(other)
infix fun LongAssert.isGreaterThanOrEqualTo(other: Long): LongAssert = isGreaterThanOrEqualTo(other)
infix fun LongAssert.isEqualByComparingTo(expected: String): LongAssert = isEqualByComparingTo(expected)

infix fun LongAssert.isCloseTo(block: () -> Pair<Long, Offset<Long>>): LongAssert {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun LongAssert.isNotCloseTo(block: () -> Pair<Long, Offset<Long>>): LongAssert {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}