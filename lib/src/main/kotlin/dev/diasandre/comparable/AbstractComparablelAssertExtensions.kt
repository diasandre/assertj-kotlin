@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.comparable

import org.assertj.core.api.AbstractComparableAssert

infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isEqualTo(expected: T): AbstractComparableAssert<*, T> = isEqualTo(expected) as AbstractComparableAssert<*, T>
infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isEqualByComparingTo(expected: T): AbstractComparableAssert<*, T> = isEqualByComparingTo(expected) as AbstractComparableAssert<*, T>
infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isNotEqualByComparingTo(expected: T): AbstractComparableAssert<*, T> = isNotEqualByComparingTo(expected) as AbstractComparableAssert<*, T>
infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isLessThan(expected: T): AbstractComparableAssert<*, T> = isLessThan(expected) as AbstractComparableAssert<*, T>
infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isLessThanOrEqualTo(expected: T): AbstractComparableAssert<*, T> = isLessThanOrEqualTo(expected) as AbstractComparableAssert<*, T>
infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isGreaterThan(expected: T): AbstractComparableAssert<*, T> = isGreaterThan(expected) as AbstractComparableAssert<*, T>
infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isGreaterThanOrEqualTo(expected: T): AbstractComparableAssert<*, T> = isGreaterThan(expected) as AbstractComparableAssert<*, T>

infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isBetween(block: () -> Pair<T, T>): AbstractComparableAssert<*, T> {
    val (start, end) = block()
    return isBetween(start, end) as AbstractComparableAssert<*, T>
}

infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.isStrictlyBetween(block: () -> Pair<T, T>): AbstractComparableAssert<*, T> {
    val (start, end) = block()
    return isStrictlyBetween(start, end) as AbstractComparableAssert<*, T>
}

infix fun <T : Comparable<T>> AbstractComparableAssert<*, T>.usingComparator(customComparator: Comparator<T>): AbstractComparableAssert<*, T> = usingComparator(customComparator) as AbstractComparableAssert<*, T>