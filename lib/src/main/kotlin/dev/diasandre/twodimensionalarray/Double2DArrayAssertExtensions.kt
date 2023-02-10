package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Double2DArrayAssert
import org.assertj.core.data.Index

infix fun Double2DArrayAssert.isDeepEqualTo(expected: Array<DoubleArray?>): Double2DArrayAssert = isDeepEqualTo(expected)

infix fun Double2DArrayAssert.isEqual(expected: Array<DoubleArray?>): Double2DArrayAssert = isEqual(expected)

infix fun Double2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Double2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Double2DArrayAssert.hasNumberOfRows(expected: Int): Double2DArrayAssert = hasNumberOfRows(expected)

infix fun Double2DArrayAssert.contains(value: Pair<DoubleArray?, Index>): Double2DArrayAssert = contains(value.first, value.second)

infix fun Double2DArrayAssert.doesNotContain(value: Pair<DoubleArray?, Index>): Double2DArrayAssert = doesNotContain(value.first, value.second)