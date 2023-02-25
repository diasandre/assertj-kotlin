package dev.diasandre.comparable

import org.assertj.core.api.ByteAssert
import org.assertj.core.data.Offset

infix fun ByteAssert.isEqualTo(expected: Byte?): ByteAssert = isEqualTo(expected)
infix fun ByteAssert.isNotEqualTo(other: Byte?): ByteAssert = isNotEqualTo(other)
infix fun ByteAssert.isLessThan(other: Byte): ByteAssert = isLessThan(other)
infix fun ByteAssert.isLessThanOrEqualTo(other: Byte): ByteAssert = isLessThanOrEqualTo(other)
infix fun ByteAssert.isGreaterThan(other: Byte): ByteAssert = isGreaterThan(other)
infix fun ByteAssert.isGreaterThanOrEqualTo(other: Byte): ByteAssert = isGreaterThanOrEqualTo(other)

infix fun ByteAssert.isCloseTo(block: () -> Pair<Byte, Offset<Byte>>): ByteAssert {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun ByteAssert.isNotCloseTo(block: () -> Pair<Byte, Offset<Byte>>): ByteAssert {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}