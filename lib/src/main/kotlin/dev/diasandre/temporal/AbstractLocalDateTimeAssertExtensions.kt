package dev.diasandre.temporal

import org.assertj.core.api.AbstractLocalDateTimeAssert
import org.assertj.core.data.TemporalUnitOffset
import java.time.LocalDateTime
import java.time.Month

infix fun AbstractLocalDateTimeAssert<*>.isBefore(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isBefore(other)
infix fun AbstractLocalDateTimeAssert<*>.isBefore(localDateTimeAsString: String): AbstractLocalDateTimeAssert<*> = isBefore(localDateTimeAsString)
infix fun AbstractLocalDateTimeAssert<*>.isBeforeOrEqualTo(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isBeforeOrEqualTo(other)
infix fun AbstractLocalDateTimeAssert<*>.isBeforeOrEqualTo(localDateTimeAsString: String): AbstractLocalDateTimeAssert<*> = isBeforeOrEqualTo(localDateTimeAsString)
infix fun AbstractLocalDateTimeAssert<*>.isAfterOrEqualTo(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isAfterOrEqualTo(other)
infix fun AbstractLocalDateTimeAssert<*>.isAfterOrEqualTo(localDateTimeAsString: String): AbstractLocalDateTimeAssert<*> = isAfterOrEqualTo(localDateTimeAsString)
infix fun AbstractLocalDateTimeAssert<*>.isAfter(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isAfter(other)
infix fun AbstractLocalDateTimeAssert<*>.isAfter(localDateTimeAsString: String): AbstractLocalDateTimeAssert<*> = isAfter(localDateTimeAsString)
infix fun AbstractLocalDateTimeAssert<*>.isEqualTo(localDateTimeAsString: String): AbstractLocalDateTimeAssert<*> = isEqualTo(localDateTimeAsString)
infix fun AbstractLocalDateTimeAssert<*>.isNotEqualTo(localDateTimeAsString: String): AbstractLocalDateTimeAssert<*> = isNotEqualTo(localDateTimeAsString)
infix fun AbstractLocalDateTimeAssert<*>.isEqualToIgnoringNanos(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isEqualToIgnoringNanos(other)
infix fun AbstractLocalDateTimeAssert<*>.isEqualToIgnoringSeconds(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isEqualToIgnoringSeconds(other)
infix fun AbstractLocalDateTimeAssert<*>.isEqualToIgnoringMinutes(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isEqualToIgnoringMinutes(other)
infix fun AbstractLocalDateTimeAssert<*>.isEqualToIgnoringHours(other: LocalDateTime): AbstractLocalDateTimeAssert<*> = isEqualToIgnoringHours(other)

infix fun AbstractLocalDateTimeAssert<*>.hasYear(year: Int): AbstractLocalDateTimeAssert<*> = hasYear(year)
infix fun AbstractLocalDateTimeAssert<*>.hasMonth(month: Month): AbstractLocalDateTimeAssert<*> = hasMonth(month)
infix fun AbstractLocalDateTimeAssert<*>.hasMonthValue(year: Int): AbstractLocalDateTimeAssert<*> = hasMonthValue(year)
infix fun AbstractLocalDateTimeAssert<*>.hasDayOfMonth(day: Int): AbstractLocalDateTimeAssert<*> = hasDayOfMonth(day)
infix fun AbstractLocalDateTimeAssert<*>.hasHour(hour: Int): AbstractLocalDateTimeAssert<*> = hasHour(hour)
infix fun AbstractLocalDateTimeAssert<*>.hasMinute(minute: Int): AbstractLocalDateTimeAssert<*> = hasMinute(minute)
infix fun AbstractLocalDateTimeAssert<*>.hasSecond(second: Int): AbstractLocalDateTimeAssert<*> = hasSecond(second)
infix fun AbstractLocalDateTimeAssert<*>.hasNano(nano: Int): AbstractLocalDateTimeAssert<*> = hasNano(nano)

infix fun AbstractLocalDateTimeAssert<*>.isCloseToUtcNow(offset: TemporalUnitOffset): AbstractLocalDateTimeAssert<*> = isCloseToUtcNow(offset)

infix fun AbstractLocalDateTimeAssert<*>.isBetween(block: () -> Pair<LocalDateTime, LocalDateTime>): AbstractLocalDateTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isBetween(startInclusive, endInclusive)
}

infix fun AbstractLocalDateTimeAssert<*>.isStrictlyBetween(block: () -> Pair<LocalDateTime, LocalDateTime>): AbstractLocalDateTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isStrictlyBetween(startInclusive, endInclusive)
}