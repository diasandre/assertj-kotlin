package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Object2DArrayAssert
import org.assertj.core.data.Index

infix fun <T> Object2DArrayAssert<T>.isDeepEqualTo(expected: Array<Array<T>?>): Object2DArrayAssert<T> = isDeepEqualTo(expected)
infix fun <T> Object2DArrayAssert<T>.hasNumberOfRows(expected: Int): Object2DArrayAssert<T> = hasNumberOfRows(expected)

infix fun <T> Object2DArrayAssert<T>.hasDimensions(block: () -> Pair<Int, Int>): Object2DArrayAssert<T> {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun <T> Object2DArrayAssert<T>.contains(block: () -> Pair<Array<T>?, Index>): Object2DArrayAssert<T> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun <T> Object2DArrayAssert<T>.doesNotContain(block: () -> Pair<Array<T>?, Index>): Object2DArrayAssert<T> {
    val (value, index) = block()
    return doesNotContain(value, index)
}