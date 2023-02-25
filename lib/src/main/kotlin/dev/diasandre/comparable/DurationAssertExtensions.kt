@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.DurationAssert
import java.time.Duration

infix fun DurationAssert.hasNanos(otherNanos: Long): DurationAssert = hasNanos(otherNanos)
infix fun DurationAssert.hasMillis(otherMillis: Long): DurationAssert = hasMillis(otherMillis)
infix fun DurationAssert.hasSeconds(otherSeconds: Long): DurationAssert = hasSeconds(otherSeconds)
infix fun DurationAssert.hasMinutes(otherMinutes: Long): DurationAssert = hasMinutes(otherMinutes)
infix fun DurationAssert.hasHours(otherHours: Long): DurationAssert = hasHours(otherHours)
infix fun DurationAssert.hasDays(otherDays: Long): DurationAssert = hasDays(otherDays)

infix fun DurationAssert.isCloseTo(block: () -> Pair<Duration, Duration>): DurationAssert {
    val (expected, allowedDifference) = block()
    return isCloseTo(expected, allowedDifference)
}