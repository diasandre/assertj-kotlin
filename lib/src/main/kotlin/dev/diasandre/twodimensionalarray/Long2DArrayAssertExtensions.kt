package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Long2DArrayAssert
import org.assertj.core.data.Index

infix fun Long2DArrayAssert.isDeepEqualTo(expected: Array<LongArray?>): Long2DArrayAssert = isDeepEqualTo(expected)

infix fun Long2DArrayAssert.isEqual(expected: Array<LongArray?>): Long2DArrayAssert = isEqual(expected)

infix fun Long2DArrayAssert.hasDimensions(value: Pair<Int, Int>): Long2DArrayAssert = hasDimensions(value.first, value.second)

infix fun Long2DArrayAssert.hasNumberOfRows(expected: Int): Long2DArrayAssert = hasNumberOfRows(expected)

infix fun Long2DArrayAssert.contains(value: Pair<LongArray?, Int>): Long2DArrayAssert = contains(value.first, Index.atIndex(value.second))

infix fun Long2DArrayAssert.contains(value: Pair<LongArray?, Index>): Long2DArrayAssert = contains(value.first, value.second)

infix fun Long2DArrayAssert.doesNotContain(value: Pair<LongArray?, Int>): Long2DArrayAssert = doesNotContain(value.first, Index.atIndex(value.second))

infix fun Long2DArrayAssert.doesNotContain(value: Pair<LongArray?, Index>): Long2DArrayAssert = doesNotContain(value.first, value.second)