@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.AbstractBigIntegerAssert
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage
import java.math.BigInteger

infix fun AbstractBigIntegerAssert<*>.isEqualTo(expected: Int): AbstractBigIntegerAssert<*> = isEqualTo(expected)

infix fun AbstractBigIntegerAssert<*>.isEqualTo(expected: String): AbstractBigIntegerAssert<*> = isEqualTo(expected)

infix fun AbstractBigIntegerAssert<*>.isEqualTo(expected: Long): AbstractBigIntegerAssert<*> = isEqualTo(expected)

infix fun AbstractBigIntegerAssert<*>.isEqualByComparingTo(expected: String): AbstractBigIntegerAssert<*> = isEqualByComparingTo(expected)

infix fun AbstractBigIntegerAssert<*>.isCloseTo(block: () -> Pair<BigInteger, Offset<BigInteger>>): AbstractBigIntegerAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun AbstractBigIntegerAssert<*>.isNotCloseTo(block: () -> Pair<BigInteger, Offset<BigInteger>>): AbstractBigIntegerAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}

infix fun <T : BigInteger> AbstractBigIntegerAssert<*>.isCloseToPercentage(block: () -> Pair<Comparable<T>, Percentage>): AbstractBigIntegerAssert<*> {
    val (expected, offset) = block()
    return isCloseTo(expected as T, offset)
}

infix fun <T : BigInteger> AbstractBigIntegerAssert<*>.isNotCloseToPercentage(block: () -> Pair<Comparable<T>, Percentage>): AbstractBigIntegerAssert<*> {
    val (expected, offset) = block()
    return isNotCloseTo(expected as T, offset)
}