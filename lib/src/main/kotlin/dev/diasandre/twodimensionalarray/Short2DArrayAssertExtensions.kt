package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Short2DArrayAssert
import org.assertj.core.data.Index

infix fun Short2DArrayAssert.isDeepEqualTo(expected: Array<ShortArray?>): Short2DArrayAssert = isDeepEqualTo(expected)
infix fun Short2DArrayAssert.hasNumberOfRows(expected: Int): Short2DArrayAssert = hasNumberOfRows(expected)

infix fun Short2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Short2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Short2DArrayAssert.contains(block: () -> Pair<ShortArray?, Index>): Short2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Short2DArrayAssert.doesNotContain(block: () -> Pair<ShortArray?, Index>): Short2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}