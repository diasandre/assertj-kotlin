package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Boolean2DArrayAssert
import org.assertj.core.data.Index

infix fun Boolean2DArrayAssert.isDeepEqualTo(expected: Array<BooleanArray?>): Boolean2DArrayAssert = isDeepEqualTo(expected)
infix fun Boolean2DArrayAssert.hasNumberOfRows(expected: Int): Boolean2DArrayAssert = hasNumberOfRows(expected)

infix fun Boolean2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Boolean2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Boolean2DArrayAssert.contains(block: () -> Pair<BooleanArray?, Index>): Boolean2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Boolean2DArrayAssert.doesNotContain(block: () -> Pair<BooleanArray?, Index>): Boolean2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}