package dev.diasandre.temporal

import org.assertj.core.api.AbstractLocalDateAssert
import java.time.LocalDate
import java.time.Month

infix fun AbstractLocalDateAssert<*>.isBefore(other: LocalDate): AbstractLocalDateAssert<*> = isBefore(other)
infix fun AbstractLocalDateAssert<*>.isBefore(localDateAsString: String): AbstractLocalDateAssert<*> = isBefore(localDateAsString)
infix fun AbstractLocalDateAssert<*>.isBeforeOrEqualTo(other: LocalDate): AbstractLocalDateAssert<*> = isBeforeOrEqualTo(other)
infix fun AbstractLocalDateAssert<*>.isBeforeOrEqualTo(localDateAsString: String): AbstractLocalDateAssert<*> = isBeforeOrEqualTo(localDateAsString)
infix fun AbstractLocalDateAssert<*>.isAfterOrEqualTo(other: LocalDate): AbstractLocalDateAssert<*> = isAfterOrEqualTo(other)
infix fun AbstractLocalDateAssert<*>.isAfterOrEqualTo(localDateAsString: String): AbstractLocalDateAssert<*> = isAfterOrEqualTo(localDateAsString)
infix fun AbstractLocalDateAssert<*>.isAfter(other: LocalDate): AbstractLocalDateAssert<*> = isAfter(other)
infix fun AbstractLocalDateAssert<*>.isAfter(localDateAsString: String): AbstractLocalDateAssert<*> = isAfter(localDateAsString)
infix fun AbstractLocalDateAssert<*>.isEqualTo(localDateAsString: String): AbstractLocalDateAssert<*> = isEqualTo(localDateAsString)
infix fun AbstractLocalDateAssert<*>.isNotEqualTo(localDateAsString: String): AbstractLocalDateAssert<*> = isNotEqualTo(localDateAsString)
infix fun AbstractLocalDateAssert<*>.hasYear(year: Int): AbstractLocalDateAssert<*> = hasYear(year)
infix fun AbstractLocalDateAssert<*>.hasMonth(month: Month): AbstractLocalDateAssert<*> = hasMonth(month)
infix fun AbstractLocalDateAssert<*>.hasMonthValue(year: Int): AbstractLocalDateAssert<*> = hasMonthValue(year)
infix fun AbstractLocalDateAssert<*>.hasDayOfMonth(day: Int): AbstractLocalDateAssert<*> = hasDayOfMonth(day)

infix fun AbstractLocalDateAssert<*>.isBetween(block: () -> Pair<LocalDate, LocalDate>): AbstractLocalDateAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isBetween(startInclusive, endInclusive)
}

infix fun AbstractLocalDateAssert<*>.isStrictlyBetween(block: () -> Pair<LocalDate, LocalDate>): AbstractLocalDateAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isStrictlyBetween(startInclusive, endInclusive)
}