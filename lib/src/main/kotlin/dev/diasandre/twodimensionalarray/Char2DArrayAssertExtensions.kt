package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Char2DArrayAssert
import org.assertj.core.data.Index

infix fun Char2DArrayAssert.isDeepEqualTo(expected: Array<CharArray?>): Char2DArrayAssert = isDeepEqualTo(expected)
infix fun Char2DArrayAssert.hasNumberOfRows(expected: Int): Char2DArrayAssert = hasNumberOfRows(expected)

infix fun Char2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Char2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Char2DArrayAssert.contains(block: () -> Pair<CharArray?, Index>): Char2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Char2DArrayAssert.doesNotContain(block: () -> Pair<CharArray?, Index>): Char2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}