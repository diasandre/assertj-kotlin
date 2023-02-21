@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.AbstractDoubleAssert
import org.assertj.core.data.Offset

infix fun AbstractDoubleAssert<*>.isEqualTo(expected: Double): AbstractDoubleAssert<*> = isEqualTo(expected)
infix fun AbstractDoubleAssert<*>.isEqualTo(expected: String): AbstractDoubleAssert<*> = isEqualTo(expected)
infix fun AbstractDoubleAssert<*>.isEqualTo(expected: Long): AbstractDoubleAssert<*> = isEqualTo(expected)

infix fun AbstractDoubleAssert<*>.isCloseTo(block: () -> Pair<Double, Offset<Double>>): AbstractDoubleAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractDoubleAssert<*>.isNotCloseTo(block: () -> Pair<Double, Offset<Double>>): AbstractDoubleAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}

// infix fun AbstractDoubleAssert<*>.isCloseToPercentage(block: () -> Pair<Comparable<Double>, Percentage>): AbstractDoubleAssert<*> {
//    val (expected, offset) = block()
//    return isCloseTo(expected as Double, offset)
// }
//
// infix fun AbstractDoubleAssert<*>.isNotCloseToPercentage(block: () -> Pair<Comparable<Double>, Percentage>): AbstractDoubleAssert<*> {
//    val (expected, offset) = block()
//    return isNotCloseTo(expected as Double, offset)
// }