package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Int2DArrayAssert
import org.assertj.core.data.Index

infix fun Int2DArrayAssert.isDeepEqualTo(expected: Array<IntArray?>): Int2DArrayAssert = isDeepEqualTo(expected)

infix fun Int2DArrayAssert.isEqual(expected: Array<IntArray?>): Int2DArrayAssert = isEqual(expected)

infix fun Int2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Int2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Int2DArrayAssert.hasNumberOfRows(expected: Int): Int2DArrayAssert = hasNumberOfRows(expected)

infix fun Int2DArrayAssert.contains(value: Pair<IntArray?, Index>): Int2DArrayAssert = contains(value.first, value.second)

infix fun Int2DArrayAssert.doesNotContain(value: Pair<IntArray?, Index>): Int2DArrayAssert = doesNotContain(value.first, value.second)