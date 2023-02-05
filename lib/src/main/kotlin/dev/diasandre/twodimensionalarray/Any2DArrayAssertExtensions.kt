package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Object2DArrayAssert
import org.assertj.core.data.Index

infix fun <T> Object2DArrayAssert<T>.isDeepEqualTo(expected: Array<Array<T>?>): Object2DArrayAssert<T> = isDeepEqualTo(expected)

infix fun <T> Object2DArrayAssert<T>.isEqual(expected: Array<FloatArray?>): Object2DArrayAssert<T> = isEqual(expected)

infix fun <T> Object2DArrayAssert<T>.hasDimensions(value: Pair<Int, Int>): Object2DArrayAssert<T> = hasDimensions(value.first, value.second)

infix fun <T> Object2DArrayAssert<T>.hasNumberOfRows(expected: Int): Object2DArrayAssert<T> = hasNumberOfRows(expected)

infix fun <T> Object2DArrayAssert<T>.contains(value: Pair<Array<T>?, Int>): Object2DArrayAssert<T> = contains(value.first, Index.atIndex(value.second))

infix fun <T> Object2DArrayAssert<T>.contains(value: Pair<Array<T>?, Index>): Object2DArrayAssert<T> = contains(value.first, value.second)

infix fun <T> Object2DArrayAssert<T>.doesNotContain(value: Pair<Array<T>?, Int>): Object2DArrayAssert<T> = doesNotContain(value.first, Index.atIndex(value.second))

infix fun <T> Object2DArrayAssert<T>.doesNotContain(value: Pair<Array<T>?, Index>): Object2DArrayAssert<T> = doesNotContain(value.first, value.second)