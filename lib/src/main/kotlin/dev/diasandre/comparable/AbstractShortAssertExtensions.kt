package dev.diasandre.comparable

import org.assertj.core.api.AbstractShortAssert
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage

infix fun AbstractShortAssert<*>.isEqualTo(expected: Short): AbstractShortAssert<*> = isEqualTo(expected)

infix fun AbstractShortAssert<*>.isNotEqualTo(expected: Short): AbstractShortAssert<*> = isNotEqualTo(expected)

infix fun AbstractShortAssert<*>.isLessThan(other: Short): AbstractShortAssert<*> = isLessThan(other)

infix fun AbstractShortAssert<*>.isLessThanOrEqualTo(other: Short): AbstractShortAssert<*> = isLessThanOrEqualTo(other)

infix fun AbstractShortAssert<*>.isGreaterThan(other: Short): AbstractShortAssert<*> = isGreaterThan(other)

infix fun AbstractShortAssert<*>.isGreaterThanOrEqualTo(other: Short): AbstractShortAssert<*> = isGreaterThanOrEqualTo(other)

infix fun AbstractShortAssert<*>.isEqualByComparingTo(expected: String): AbstractShortAssert<*> = isEqualByComparingTo(expected)

infix fun AbstractShortAssert<*>.isCloseTo(block: () -> Pair<Short, Offset<Short>>): AbstractShortAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractShortAssert<*>.isNotCloseTo(block: () -> Pair<Short, Offset<Short>>): AbstractShortAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}

@JvmName("isCloseToPercentage")
infix fun AbstractShortAssert<*>.isCloseTo(block: () -> Pair<Short, Percentage>): AbstractShortAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

@JvmName("isNotCloseToPercentage")
infix fun AbstractShortAssert<*>.isNotCloseTo(block: () -> Pair<Short, Percentage>): AbstractShortAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}