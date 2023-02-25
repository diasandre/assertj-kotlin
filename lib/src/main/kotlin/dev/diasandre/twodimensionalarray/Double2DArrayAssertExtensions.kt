package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Double2DArrayAssert
import org.assertj.core.data.Index

infix fun Double2DArrayAssert.isDeepEqualTo(expected: Array<DoubleArray?>): Double2DArrayAssert = isDeepEqualTo(expected)
infix fun Double2DArrayAssert.hasNumberOfRows(expected: Int): Double2DArrayAssert = hasNumberOfRows(expected)

infix fun Double2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Double2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Double2DArrayAssert.contains(block: () -> Pair<DoubleArray?, Index>): Double2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Double2DArrayAssert.doesNotContain(block: () -> Pair<DoubleArray?, Index>): Double2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}