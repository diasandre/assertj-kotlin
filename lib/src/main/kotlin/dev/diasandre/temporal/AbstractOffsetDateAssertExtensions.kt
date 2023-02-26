package dev.diasandre.temporal

import org.assertj.core.api.AbstractOffsetDateTimeAssert
import org.assertj.core.data.TemporalUnitOffset
import java.time.OffsetDateTime

infix fun AbstractOffsetDateTimeAssert<*>.isBefore(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isBefore(other)
infix fun AbstractOffsetDateTimeAssert<*>.isBefore(offsetDateTimeAsString: String): AbstractOffsetDateTimeAssert<*> = isBefore(offsetDateTimeAsString)
infix fun AbstractOffsetDateTimeAssert<*>.isBeforeOrEqualTo(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isBeforeOrEqualTo(other)
infix fun AbstractOffsetDateTimeAssert<*>.isBeforeOrEqualTo(offsetDateTimeAsString: String): AbstractOffsetDateTimeAssert<*> = isBeforeOrEqualTo(offsetDateTimeAsString)
infix fun AbstractOffsetDateTimeAssert<*>.isAfterOrEqualTo(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isAfterOrEqualTo(other)
infix fun AbstractOffsetDateTimeAssert<*>.isAfterOrEqualTo(offsetDateTimeAsString: String): AbstractOffsetDateTimeAssert<*> = isAfterOrEqualTo(offsetDateTimeAsString)
infix fun AbstractOffsetDateTimeAssert<*>.isAfter(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isAfter(other)
infix fun AbstractOffsetDateTimeAssert<*>.isAfter(offsetDateTimeAsString: String): AbstractOffsetDateTimeAssert<*> = isAfter(offsetDateTimeAsString)
infix fun AbstractOffsetDateTimeAssert<*>.isCloseToUtcNow(offset: TemporalUnitOffset): AbstractOffsetDateTimeAssert<*> = isCloseToUtcNow(offset)
infix fun AbstractOffsetDateTimeAssert<*>.isEqualTo(offsetDateTimeAsString: String): AbstractOffsetDateTimeAssert<*> = isEqualTo(offsetDateTimeAsString)
infix fun AbstractOffsetDateTimeAssert<*>.isNotEqualTo(offsetDateTimeAsString: String): AbstractOffsetDateTimeAssert<*> = isNotEqualTo(offsetDateTimeAsString)
infix fun AbstractOffsetDateTimeAssert<*>.isEqualToIgnoringNanos(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isEqualToIgnoringNanos(other)
infix fun AbstractOffsetDateTimeAssert<*>.isEqualToIgnoringTimezone(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isEqualToIgnoringTimezone(other)
infix fun AbstractOffsetDateTimeAssert<*>.isEqualToIgnoringSeconds(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isEqualToIgnoringSeconds(other)
infix fun AbstractOffsetDateTimeAssert<*>.isEqualToIgnoringMinutes(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isEqualToIgnoringMinutes(other)
infix fun AbstractOffsetDateTimeAssert<*>.isEqualToIgnoringHours(other: OffsetDateTime): AbstractOffsetDateTimeAssert<*> = isEqualToIgnoringHours(other)

infix fun AbstractOffsetDateTimeAssert<*>.isBetween(block: () -> Pair<OffsetDateTime, OffsetDateTime>): AbstractOffsetDateTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isBetween(startInclusive, endInclusive)
}

infix fun AbstractOffsetDateTimeAssert<*>.isStrictlyBetween(block: () -> Pair<OffsetDateTime, OffsetDateTime>): AbstractOffsetDateTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isStrictlyBetween(startInclusive, endInclusive)
}