package dev.diasandre.twodimensionalarray

import org.assertj.core.api.Byte2DArrayAssert
import org.assertj.core.data.Index

infix fun Byte2DArrayAssert.isDeepEqualTo(expected: Array<ByteArray?>): Byte2DArrayAssert = isDeepEqualTo(expected)

infix fun Byte2DArrayAssert.hasNumberOfRows(expected: Int): Byte2DArrayAssert = hasNumberOfRows(expected)

infix fun Byte2DArrayAssert.hasDimensions(block: () -> Pair<Int, Int>): Byte2DArrayAssert {
    val (expectedFirstDimension, expectedSecondDimension) = block()
    return hasDimensions(expectedFirstDimension, expectedSecondDimension)
}

infix fun Byte2DArrayAssert.contains(block: () -> Pair<ByteArray?, Index>): Byte2DArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun Byte2DArrayAssert.doesNotContain(block: () -> Pair<ByteArray?, Index>): Byte2DArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}