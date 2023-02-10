package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Boolean2DArrayAssert
import org.assertj.core.data.Index

infix fun Boolean2DArrayAssert.isDeepEqualTo(expected: Array<BooleanArray?>): Boolean2DArrayAssert = isDeepEqualTo(expected)

infix fun Boolean2DArrayAssert.isEqual(expected: Array<BooleanArray?>): Boolean2DArrayAssert = isEqual(expected)

infix fun Boolean2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Boolean2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Boolean2DArrayAssert.hasNumberOfRows(expected: Int): Boolean2DArrayAssert = hasNumberOfRows(expected)

infix fun Boolean2DArrayAssert.contains(value: Pair<BooleanArray?, Index>): Boolean2DArrayAssert = contains(value.first, value.second)

infix fun Boolean2DArrayAssert.doesNotContain(value: Pair<BooleanArray?, Index>): Boolean2DArrayAssert = doesNotContain(value.first, value.second)