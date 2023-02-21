package dev.diasandre.comparable

import org.assertj.core.api.AbstractBigDecimalAssert
import org.assertj.core.data.Offset
import java.math.BigDecimal

infix fun AbstractBigDecimalAssert<*>.isEqualTo(expected: String?): AbstractBigDecimalAssert<*> = isEqualTo(expected)
infix fun AbstractBigDecimalAssert<*>.isEqualByComparingTo(expected: String): AbstractBigDecimalAssert<*> = isEqualByComparingTo(expected)
infix fun AbstractBigDecimalAssert<*>.isNotEqualByComparingTo(notExpected: String): AbstractBigDecimalAssert<*> = isNotEqualByComparingTo(notExpected)
infix fun AbstractBigDecimalAssert<*>.hasScaleOf(expectedScale: Int): AbstractBigDecimalAssert<*> = hasScaleOf(expectedScale)

infix fun AbstractBigDecimalAssert<*>.isCloseTo(block: () -> Pair<BigDecimal, Offset<BigDecimal>>): AbstractBigDecimalAssert<*> {
    val (expected: BigDecimal, offset: Offset<BigDecimal>) = block()
    return isCloseTo(expected, offset)
}