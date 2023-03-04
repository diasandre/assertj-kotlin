package dev.diasandre.temporal

import org.assertj.core.api.AbstractZonedDateTimeAssert
import java.time.ZonedDateTime

infix fun AbstractZonedDateTimeAssert<*>.isBefore(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isBefore(other)
infix fun AbstractZonedDateTimeAssert<*>.isBefore(dateTimeAsString: String): AbstractZonedDateTimeAssert<*> = isBefore(dateTimeAsString)
infix fun AbstractZonedDateTimeAssert<*>.isBeforeOrEqualTo(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isBeforeOrEqualTo(other)
infix fun AbstractZonedDateTimeAssert<*>.isBeforeOrEqualTo(dateTimeAsString: String): AbstractZonedDateTimeAssert<*> = isBeforeOrEqualTo(dateTimeAsString)
infix fun AbstractZonedDateTimeAssert<*>.isAfterOrEqualTo(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isAfterOrEqualTo(other)
infix fun AbstractZonedDateTimeAssert<*>.isAfterOrEqualTo(dateTimeAsString: String): AbstractZonedDateTimeAssert<*> = isAfterOrEqualTo(dateTimeAsString)
infix fun AbstractZonedDateTimeAssert<*>.isAfter(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isAfter(other)
infix fun AbstractZonedDateTimeAssert<*>.isAfter(dateTimeAsString: String): AbstractZonedDateTimeAssert<*> = isAfter(dateTimeAsString)
infix fun AbstractZonedDateTimeAssert<*>.isEqualTo(dateTimeAsString: String): AbstractZonedDateTimeAssert<*> = isEqualTo(dateTimeAsString)
infix fun AbstractZonedDateTimeAssert<*>.isNotEqualTo(dateTimeAsString: String): AbstractZonedDateTimeAssert<*> = isNotEqualTo(dateTimeAsString)
infix fun AbstractZonedDateTimeAssert<*>.isEqualToIgnoringNanos(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isEqualToIgnoringNanos(other)
infix fun AbstractZonedDateTimeAssert<*>.isEqualToIgnoringSeconds(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isEqualToIgnoringSeconds(other)
infix fun AbstractZonedDateTimeAssert<*>.isEqualToIgnoringMinutes(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isEqualToIgnoringMinutes(other)
infix fun AbstractZonedDateTimeAssert<*>.isEqualToIgnoringHours(other: ZonedDateTime): AbstractZonedDateTimeAssert<*> = isEqualToIgnoringHours(other)

infix fun AbstractZonedDateTimeAssert<*>.isBetween(block: () -> Pair<ZonedDateTime, ZonedDateTime>): AbstractZonedDateTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isBetween(startInclusive, endInclusive)
}

infix fun AbstractZonedDateTimeAssert<*>.isStrictlyBetween(block: () -> Pair<ZonedDateTime, ZonedDateTime>): AbstractZonedDateTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isStrictlyBetween(startInclusive, endInclusive)
}