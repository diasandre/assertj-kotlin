package dev.diasandre.array

import org.assertj.core.api.AbstractShortArrayAssert
import org.assertj.core.data.Index

infix fun AbstractShortArrayAssert<*>.hasSize(expected: Short): AbstractShortArrayAssert<*> = hasSize(expected)
infix fun AbstractShortArrayAssert<*>.hasSizeGreaterThan(expected: Short): AbstractShortArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractShortArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Short): AbstractShortArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractShortArrayAssert<*>.hasSizeLessThan(expected: Short): AbstractShortArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractShortArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Short): AbstractShortArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractShortArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractShortArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractShortArrayAssert<*>.contains(values: Array<Short>): AbstractShortArrayAssert<*> = contains(values)
infix fun AbstractShortArrayAssert<*>.containsOnly(values: Array<Short>): AbstractShortArrayAssert<*> = containsOnly(values)
infix fun AbstractShortArrayAssert<*>.containsOnlyOnce(values: Array<Short>): AbstractShortArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractShortArrayAssert<*>.containsSequence(values: Array<Short>): AbstractShortArrayAssert<*> = containsSequence(values)
infix fun AbstractShortArrayAssert<*>.containsSubsequence(values: Array<Short>): AbstractShortArrayAssert<*> = containsSubsequence(values)
infix fun AbstractShortArrayAssert<*>.doesNotContain(values: Array<Short>): AbstractShortArrayAssert<*> = doesNotContain(values)
infix fun AbstractShortArrayAssert<*>.startsWith(sequence: Array<Short>): AbstractShortArrayAssert<*> = startsWith(sequence)
infix fun AbstractShortArrayAssert<*>.endsWith(sequence: Array<Short>): AbstractShortArrayAssert<*> = endsWith(sequence)
infix fun AbstractShortArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Short>): AbstractShortArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractShortArrayAssert<*>.containsExactly(values: Array<Short>): AbstractShortArrayAssert<*> = containsExactly(values)
infix fun AbstractShortArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Short>): AbstractShortArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractShortArrayAssert<*>.containsAnyOf(values: Array<Short>): AbstractShortArrayAssert<*> = containsAnyOf(values)

infix fun AbstractShortArrayAssert<*>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractShortArrayAssert<*> {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun AbstractShortArrayAssert<*>.contains(block: () -> Pair<Short, Index>): AbstractShortArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractShortArrayAssert<*>.doesNotContain(block: () -> Pair<Short, Index>): AbstractShortArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}