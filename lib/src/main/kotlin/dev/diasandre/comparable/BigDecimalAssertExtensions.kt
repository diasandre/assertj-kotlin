package dev.diasandre.comparable

import org.assertj.core.api.BigDecimalAssert
import org.assertj.core.data.Offset
import java.math.BigDecimal

infix fun BigDecimalAssert.isEqualTo(expected: String?): BigDecimalAssert = isEqualTo(expected)
infix fun BigDecimalAssert.isEqualByComparingTo(expected: String): BigDecimalAssert = isEqualByComparingTo(expected)
infix fun BigDecimalAssert.isNotEqualByComparingTo(notExpected: String): BigDecimalAssert = isNotEqualByComparingTo(notExpected)
infix fun BigDecimalAssert.hasScaleOf(expectedScale: Int): BigDecimalAssert = hasScaleOf(expectedScale)

infix fun BigDecimalAssert.isCloseTo(block: () -> Pair<BigDecimal, Offset<BigDecimal>>): BigDecimalAssert {
    val (expected: BigDecimal, offset: Offset<BigDecimal>) = block()
    return isCloseTo(expected, offset)
}