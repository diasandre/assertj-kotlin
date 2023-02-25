package dev.diasandre.array

import org.assertj.core.api.AbstractIntArrayAssert
import org.assertj.core.data.Index

infix fun AbstractIntArrayAssert<*>.hasSize(expected: Int): AbstractIntArrayAssert<*> = hasSize(expected)
infix fun AbstractIntArrayAssert<*>.hasSizeGreaterThan(expected: Int): AbstractIntArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractIntArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractIntArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractIntArrayAssert<*>.hasSizeLessThan(expected: Int): AbstractIntArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractIntArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Int): AbstractIntArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractIntArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractIntArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractIntArrayAssert<*>.contains(values: Array<Int>): AbstractIntArrayAssert<*> = contains(values)
infix fun AbstractIntArrayAssert<*>.containsOnly(values: Array<Int>): AbstractIntArrayAssert<*> = containsOnly(values)
infix fun AbstractIntArrayAssert<*>.containsOnlyOnce(values: Array<Int>): AbstractIntArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractIntArrayAssert<*>.containsSequence(values: Array<Int>): AbstractIntArrayAssert<*> = containsSequence(values)
infix fun AbstractIntArrayAssert<*>.containsSubsequence(values: Array<Int>): AbstractIntArrayAssert<*> = containsSubsequence(values)
infix fun AbstractIntArrayAssert<*>.doesNotContain(values: Array<Int>): AbstractIntArrayAssert<*> = doesNotContain(values)
infix fun AbstractIntArrayAssert<*>.startsWith(sequence: Array<Int>): AbstractIntArrayAssert<*> = startsWith(sequence)
infix fun AbstractIntArrayAssert<*>.endsWith(sequence: Array<Int>): AbstractIntArrayAssert<*> = endsWith(sequence)
infix fun AbstractIntArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Int>): AbstractIntArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractIntArrayAssert<*>.containsExactly(values: Array<Int>): AbstractIntArrayAssert<*> = containsExactly(values)
infix fun AbstractIntArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Int>): AbstractIntArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractIntArrayAssert<*>.containsAnyOf(values: Array<Int>): AbstractIntArrayAssert<*> = containsAnyOf(values)

infix fun AbstractIntArrayAssert<*>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractIntArrayAssert<*> {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun AbstractIntArrayAssert<*>.contains(block: () -> Pair<Int, Index>): AbstractIntArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractIntArrayAssert<*>.doesNotContain(block: () -> Pair<Int, Index>): AbstractIntArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}