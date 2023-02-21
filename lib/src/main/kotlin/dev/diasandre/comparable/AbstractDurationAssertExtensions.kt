@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.AbstractDurationAssert
import java.time.Duration

infix fun AbstractDurationAssert<*>.hasNanos(otherNanos: Long): AbstractDurationAssert<*> = hasNanos(otherNanos)
infix fun AbstractDurationAssert<*>.hasMillis(otherMillis: Long): AbstractDurationAssert<*> = hasMillis(otherMillis)
infix fun AbstractDurationAssert<*>.hasSeconds(otherSeconds: Long): AbstractDurationAssert<*> = hasSeconds(otherSeconds)
infix fun AbstractDurationAssert<*>.hasMinutes(otherMinutes: Long): AbstractDurationAssert<*> = hasMinutes(otherMinutes)
infix fun AbstractDurationAssert<*>.hasHours(otherHours: Long): AbstractDurationAssert<*> = hasHours(otherHours)
infix fun AbstractDurationAssert<*>.hasDays(otherDays: Long): AbstractDurationAssert<*> = hasDays(otherDays)

infix fun AbstractDurationAssert<*>.isCloseTo(block: () -> Pair<Duration, Duration>): AbstractDurationAssert<*> {
    val (expected, allowedDifference) = block()
    return isCloseTo(expected, allowedDifference)
}