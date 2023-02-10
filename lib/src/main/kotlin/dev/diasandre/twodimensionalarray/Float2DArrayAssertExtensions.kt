package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Float2DArrayAssert
import org.assertj.core.data.Index

infix fun Float2DArrayAssert.isDeepEqualTo(expected: Array<FloatArray?>): Float2DArrayAssert = isDeepEqualTo(expected)

infix fun Float2DArrayAssert.isEqual(expected: Array<FloatArray?>): Float2DArrayAssert = isEqual(expected)

infix fun Float2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Float2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Float2DArrayAssert.hasNumberOfRows(expected: Int): Float2DArrayAssert = hasNumberOfRows(expected)

infix fun Float2DArrayAssert.contains(value: Pair<FloatArray?, Index>): Float2DArrayAssert = contains(value.first, value.second)

infix fun Float2DArrayAssert.doesNotContain(value: Pair<FloatArray?, Index>): Float2DArrayAssert = doesNotContain(value.first, value.second)