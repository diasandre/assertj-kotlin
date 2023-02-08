package dev.diasandre.comparable

import org.assertj.core.api.AbstractByteAssert
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage

infix fun AbstractByteAssert<*>.isEqualTo(expected: Byte): AbstractByteAssert<*> = isEqualTo(expected)

infix fun AbstractByteAssert<*>.isNotEqualTo(other: Byte): AbstractByteAssert<*> = isNotEqualTo(other)

infix fun AbstractByteAssert<*>.isLessThan(other: Byte): AbstractByteAssert<*> = isLessThan(other)

infix fun AbstractByteAssert<*>.isLessThanOrEqualTo(other: Byte): AbstractByteAssert<*> = isLessThanOrEqualTo(other)

infix fun AbstractByteAssert<*>.isGreaterThan(other: Byte): AbstractByteAssert<*> = isGreaterThan(other)

infix fun AbstractByteAssert<*>.isGreaterThanOrEqualTo(other: Byte): AbstractByteAssert<*> = isGreaterThanOrEqualTo(other)

infix fun AbstractByteAssert<*>.isCloseTo(block: () -> Pair<Byte, Offset<Byte>>): AbstractByteAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractByteAssert<*>.isNotCloseTo(block: () -> Pair<Byte, Offset<Byte>>): AbstractByteAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}

infix fun AbstractByteAssert<*>.isCloseToPercentage(block: () -> Pair<Comparable<Byte>, Percentage>): AbstractByteAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected as Byte, offset)
}

infix fun AbstractByteAssert<*>.isNotCloseToPercentage(block: () -> Pair<Comparable<Byte>, Percentage>): AbstractByteAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected as Byte, offset)
}