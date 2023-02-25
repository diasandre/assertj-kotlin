package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Float2DArrayAssert
import org.assertj.core.data.Index

infix fun Float2DArrayAssert.isDeepEqualTo(expected: Array<FloatArray?>): Float2DArrayAssert = isDeepEqualTo(expected)
infix fun Float2DArrayAssert.hasNumberOfRows(expected: Int): Float2DArrayAssert = hasNumberOfRows(expected)

infix fun Float2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Float2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Float2DArrayAssert.contains(block: () -> Pair<FloatArray?, Index>): Float2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Float2DArrayAssert.doesNotContain(block: () -> Pair<FloatArray?, Index>): Float2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}