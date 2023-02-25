package dev.diasandre.temporal

import org.assertj.core.api.AbstractInstantAssert
import java.time.Instant

infix fun AbstractInstantAssert<*>.isBefore(other: Instant): AbstractInstantAssert<*> = isBefore(other)
infix fun AbstractInstantAssert<*>.isBefore(instantAsString: String): AbstractInstantAssert<*> = isBefore(instantAsString)
infix fun AbstractInstantAssert<*>.isBeforeOrEqualTo(other: Instant): AbstractInstantAssert<*> = isBeforeOrEqualTo(other)
infix fun AbstractInstantAssert<*>.isBeforeOrEqualTo(instantAsString: String): AbstractInstantAssert<*> = isBeforeOrEqualTo(instantAsString)
infix fun AbstractInstantAssert<*>.isAfterOrEqualTo(other: Instant): AbstractInstantAssert<*> = isAfterOrEqualTo(other)
infix fun AbstractInstantAssert<*>.isAfterOrEqualTo(instantAsString: String): AbstractInstantAssert<*> = isAfterOrEqualTo(instantAsString)
infix fun AbstractInstantAssert<*>.isAfter(other: Instant): AbstractInstantAssert<*> = isAfter(other)
infix fun AbstractInstantAssert<*>.isAfter(instantAsString: String): AbstractInstantAssert<*> = isAfter(instantAsString)
infix fun AbstractInstantAssert<*>.isEqualTo(instantAsString: String): AbstractInstantAssert<*> = isEqualTo(instantAsString)
infix fun AbstractInstantAssert<*>.isNotEqualTo(instantAsString: String): AbstractInstantAssert<*> = isNotEqualTo(instantAsString)

infix fun AbstractInstantAssert<*>.isBetween(block: () -> Pair<Instant, Instant>): AbstractInstantAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isBetween(startInclusive, endInclusive)
}

infix fun AbstractInstantAssert<*>.isStrictlyBetween(block: () -> Pair<Instant, Instant>): AbstractInstantAssert<*> {
    val (startInclusive, endInclusive) = block()
    return isStrictlyBetween(startInclusive, endInclusive)
}