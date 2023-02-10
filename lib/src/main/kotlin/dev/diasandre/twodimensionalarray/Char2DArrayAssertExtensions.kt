package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Char2DArrayAssert
import org.assertj.core.data.Index

infix fun Char2DArrayAssert.isDeepEqualTo(expected: Array<CharArray?>): Char2DArrayAssert = isDeepEqualTo(expected)

infix fun Char2DArrayAssert.isEqual(expected: Array<CharArray?>): Char2DArrayAssert = isEqual(expected)

infix fun Char2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Char2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Char2DArrayAssert.hasNumberOfRows(expected: Int): Char2DArrayAssert = hasNumberOfRows(expected)

infix fun Char2DArrayAssert.contains(value: Pair<CharArray?, Index>): Char2DArrayAssert = contains(value.first, value.second)

infix fun Char2DArrayAssert.doesNotContain(value: Pair<CharArray?, Index>): Char2DArrayAssert = doesNotContain(value.first, value.second)