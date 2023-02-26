package dev.diasandre.temporal

import org.assertj.core.api.AbstractOffsetTimeAssert
import java.time.OffsetTime

infix fun AbstractOffsetTimeAssert<*>.isBefore(other: OffsetTime): AbstractOffsetTimeAssert<*> = isBefore(other)
infix fun AbstractOffsetTimeAssert<*>.isBefore(offsetTimeAsString: String): AbstractOffsetTimeAssert<*> = isBefore(offsetTimeAsString)
infix fun AbstractOffsetTimeAssert<*>.isBeforeOrEqualTo(other: OffsetTime): AbstractOffsetTimeAssert<*> = isBeforeOrEqualTo(other)
infix fun AbstractOffsetTimeAssert<*>.isBeforeOrEqualTo(offsetTimeAsString: String): AbstractOffsetTimeAssert<*> = isBeforeOrEqualTo(offsetTimeAsString)
infix fun AbstractOffsetTimeAssert<*>.isAfterOrEqualTo(other: OffsetTime): AbstractOffsetTimeAssert<*> = isAfterOrEqualTo(other)
infix fun AbstractOffsetTimeAssert<*>.isAfterOrEqualTo(offsetTimeAsString: String): AbstractOffsetTimeAssert<*> = isAfterOrEqualTo(offsetTimeAsString)
infix fun AbstractOffsetTimeAssert<*>.isAfter(other: OffsetTime): AbstractOffsetTimeAssert<*> = isAfter(other)
infix fun AbstractOffsetTimeAssert<*>.isAfter(offsetTimeAsString: String): AbstractOffsetTimeAssert<*> = isAfter(offsetTimeAsString)
infix fun AbstractOffsetTimeAssert<*>.isEqualTo(offsetTimeAsString: String): AbstractOffsetTimeAssert<*> = isEqualTo(offsetTimeAsString)
infix fun AbstractOffsetTimeAssert<*>.isNotEqualTo(offsetTimeAsString: String): AbstractOffsetTimeAssert<*> = isNotEqualTo(offsetTimeAsString)
infix fun AbstractOffsetTimeAssert<*>.isEqualToIgnoringNanos(other: OffsetTime): AbstractOffsetTimeAssert<*> = isEqualToIgnoringNanos(other)
infix fun AbstractOffsetTimeAssert<*>.isEqualToIgnoringTimezone(other: OffsetTime): AbstractOffsetTimeAssert<*> = isEqualToIgnoringTimezone(other)
infix fun AbstractOffsetTimeAssert<*>.isEqualToIgnoringSeconds(other: OffsetTime): AbstractOffsetTimeAssert<*> = isEqualToIgnoringSeconds(other)
infix fun AbstractOffsetTimeAssert<*>.hasSameHourAs(other: OffsetTime): AbstractOffsetTimeAssert<*> = hasSameHourAs(other)

infix fun AbstractOffsetTimeAssert<*>.isBetween(block: () -> Pair<OffsetTime, OffsetTime>): AbstractOffsetTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isBetween(startInclusive, endInclusive)
}

infix fun AbstractOffsetTimeAssert<*>.isStrictlyBetween(block: () -> Pair<OffsetTime, OffsetTime>): AbstractOffsetTimeAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isStrictlyBetween(startInclusive, endInclusive)
}