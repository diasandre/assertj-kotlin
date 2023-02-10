package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Short2DArrayAssert
import org.assertj.core.data.Index

infix fun Short2DArrayAssert.isDeepEqualTo(expected: Array<ShortArray?>): Short2DArrayAssert = isDeepEqualTo(expected)

infix fun Short2DArrayAssert.isEqual(expected: Array<ShortArray?>): Short2DArrayAssert = isEqual(expected)

infix fun Short2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Short2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Short2DArrayAssert.hasNumberOfRows(expected: Int): Short2DArrayAssert = hasNumberOfRows(expected)

infix fun Short2DArrayAssert.contains(value: Pair<ShortArray?, Index>): Short2DArrayAssert = contains(value.first, value.second)

infix fun Short2DArrayAssert.doesNotContain(value: Pair<ShortArray?, Index>): Short2DArrayAssert = doesNotContain(value.first, value.second)