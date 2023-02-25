@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.BigIntegerAssert
import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage
import java.math.BigInteger

infix fun BigIntegerAssert.isEqualTo(expected: Int): BigIntegerAssert = isEqualTo(expected)
infix fun BigIntegerAssert.isEqualTo(expected: String): BigIntegerAssert = isEqualTo(expected)
infix fun BigIntegerAssert.isEqualTo(expected: Long): BigIntegerAssert = isEqualTo(expected)
infix fun BigIntegerAssert.isEqualByComparingTo(expected: String): BigIntegerAssert = isEqualByComparingTo(expected)

infix fun BigIntegerAssert.isCloseTo(block: () -> Pair<BigInteger, Offset<BigInteger>>): BigIntegerAssert {
    val (expected, offset) = block()
    return isCloseTo(expected, offset)
}

infix fun BigIntegerAssert.isNotCloseTo(block: () -> Pair<BigInteger, Offset<BigInteger>>): BigIntegerAssert {
    val (expected, offset) = block()
    return isNotCloseTo(expected, offset)
}

infix fun <T : BigInteger> BigIntegerAssert.isCloseToPercentage(block: () -> Pair<Comparable<T>, Percentage>): BigIntegerAssert {
    val (expected, offset) = block()
    return isCloseTo(expected as T, offset)
}

infix fun <T : BigInteger> BigIntegerAssert.isNotCloseToPercentage(block: () -> Pair<Comparable<T>, Percentage>): BigIntegerAssert {
    val (expected, offset) = block()
    return isNotCloseTo(expected as T, offset)
}