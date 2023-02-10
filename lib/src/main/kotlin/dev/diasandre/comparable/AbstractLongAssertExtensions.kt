@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.AbstractLongAssert
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage

infix fun AbstractLongAssert<*>.isEqualTo(expected: Long): AbstractLongAssert<*> = isEqualTo(expected)

infix fun AbstractLongAssert<*>.isNotEqualTo(expected: Long): AbstractLongAssert<*> = isNotEqualTo(expected)

infix fun AbstractLongAssert<*>.isLessThan(other: Long): AbstractLongAssert<*> = isLessThan(other)

infix fun AbstractLongAssert<*>.isLessThanOrEqualTo(other: Long): AbstractLongAssert<*> = isLessThanOrEqualTo(other)

infix fun AbstractLongAssert<*>.isGreaterThan(other: Long): AbstractLongAssert<*> = isGreaterThan(other)

infix fun AbstractLongAssert<*>.isGreaterThanOrEqualTo(other: Long): AbstractLongAssert<*> = isGreaterThanOrEqualTo(other)

infix fun AbstractLongAssert<*>.isEqualByComparingTo(expected: String): AbstractLongAssert<*> = isEqualByComparingTo(expected)

infix fun AbstractLongAssert<*>.isCloseTo(block: () -> Pair<Long, Offset<Long>>): AbstractLongAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractLongAssert<*>.isNotCloseTo(block: () -> Pair<Long, Offset<Long>>): AbstractLongAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}

@JvmName("isCloseToPercentage")
infix fun AbstractLongAssert<*>.isCloseTo(block: () -> Pair<Long, Percentage>): AbstractLongAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

@JvmName("isNotCloseToPercentage")
infix fun AbstractLongAssert<*>.isNotCloseTo(block: () -> Pair<Long, Percentage>): AbstractLongAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}