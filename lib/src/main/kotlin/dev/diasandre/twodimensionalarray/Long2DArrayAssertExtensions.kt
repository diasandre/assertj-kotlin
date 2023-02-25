package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Long2DArrayAssert
import org.assertj.core.data.Index

infix fun Long2DArrayAssert.isDeepEqualTo(expected: Array<LongArray?>): Long2DArrayAssert = isDeepEqualTo(expected)
infix fun Long2DArrayAssert.hasNumberOfRows(expected: Int): Long2DArrayAssert = hasNumberOfRows(expected)

infix fun Long2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Long2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Long2DArrayAssert.contains(block: () -> Pair<LongArray?, Index>): Long2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Long2DArrayAssert.doesNotContain(block: () -> Pair<LongArray?, Index>): Long2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}