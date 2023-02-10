package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Byte2DArrayAssert
import org.assertj.core.data.Index

infix fun Byte2DArrayAssert.isDeepEqualTo(expected: Array<ByteArray?>): Byte2DArrayAssert = isDeepEqualTo(expected)

infix fun Byte2DArrayAssert.isEqual(expected: Array<ByteArray?>): Byte2DArrayAssert = isEqual(expected)

infix fun Byte2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Byte2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Byte2DArrayAssert.hasNumberOfRows(expected: Int): Byte2DArrayAssert = hasNumberOfRows(expected)

infix fun Byte2DArrayAssert.contains(value: Pair<ByteArray?, Index>): Byte2DArrayAssert = contains(value.first, value.second)

infix fun Byte2DArrayAssert.doesNotContain(value: Pair<ByteArray?, Index>): Byte2DArrayAssert = doesNotContain(value.first, value.second)