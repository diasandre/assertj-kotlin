package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Int2DArrayAssert
import org.assertj.core.data.Index

infix fun Int2DArrayAssert.isDeepEqualTo(expected: Array<IntArray?>): Int2DArrayAssert = isDeepEqualTo(expected)
infix fun Int2DArrayAssert.hasNumberOfRows(expected: Int): Int2DArrayAssert = hasNumberOfRows(expected)

infix fun Int2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Int2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Int2DArrayAssert.contains(block: () -> Pair<IntArray?, Index>): Int2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Int2DArrayAssert.doesNotContain(block: () -> Pair<IntArray?, Index>): Int2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}