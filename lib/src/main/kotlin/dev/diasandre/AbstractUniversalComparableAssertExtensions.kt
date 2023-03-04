@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractUniversalComparableAssert

infix fun <T> AbstractUniversalComparableAssert<*, T>.isEqualByComparingTo(other: T): AbstractUniversalComparableAssert<*, T> = isEqualByComparingTo(other) as AbstractUniversalComparableAssert<*, T>
infix fun <T> AbstractUniversalComparableAssert<*, T>.isNotEqualByComparingTo(other: T): AbstractUniversalComparableAssert<*, T> = isNotEqualByComparingTo(other) as AbstractUniversalComparableAssert<*, T>
infix fun <T> AbstractUniversalComparableAssert<*, T>.isLessThan(other: T): AbstractUniversalComparableAssert<*, T> = isLessThan(other) as AbstractUniversalComparableAssert<*, T>
infix fun <T> AbstractUniversalComparableAssert<*, T>.isLessThanOrEqualTo(other: T): AbstractUniversalComparableAssert<*, T> = isLessThanOrEqualTo(other) as AbstractUniversalComparableAssert<*, T>
infix fun <T> AbstractUniversalComparableAssert<*, T>.isGreaterThan(other: T): AbstractUniversalComparableAssert<*, T> = isGreaterThan(other) as AbstractUniversalComparableAssert<*, T>
infix fun <T> AbstractUniversalComparableAssert<*, T>.isGreaterThanOrEqualTo(other: T): AbstractUniversalComparableAssert<*, T> = isGreaterThanOrEqualTo(other) as AbstractUniversalComparableAssert<*, T>

infix fun <T> AbstractUniversalComparableAssert<*, T>.isBetween(block: () -> Pair<T, T>): AbstractUniversalComparableAssert<*, T> {
    val (start, end) = block()
    return isBetween(start, end) as AbstractUniversalComparableAssert<*, T>
}

infix fun <T> AbstractUniversalComparableAssert<*, T>.isStrictlyBetween(block: () -> Pair<T, T>): AbstractUniversalComparableAssert<*, T> {
    val (start, end) = block()
    return isStrictlyBetween(start, end) as AbstractUniversalComparableAssert<*, T>
}