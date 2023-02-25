package dev.diasandre.array

import org.assertj.core.api.AbstractLongArrayAssert
import org.assertj.core.data.Index

infix fun AbstractLongArrayAssert<*>.hasSize(expected: Long): AbstractLongArrayAssert<*> = hasSize(expected)
infix fun AbstractLongArrayAssert<*>.hasSizeGreaterThan(expected: Long): AbstractLongArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractLongArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Long): AbstractLongArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractLongArrayAssert<*>.hasSizeLessThan(expected: Long): AbstractLongArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractLongArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Long): AbstractLongArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractLongArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractLongArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractLongArrayAssert<*>.contains(values: Array<Long>): AbstractLongArrayAssert<*> = contains(values)
infix fun AbstractLongArrayAssert<*>.containsOnly(values: Array<Long>): AbstractLongArrayAssert<*> = containsOnly(values)
infix fun AbstractLongArrayAssert<*>.containsOnlyOnce(values: Array<Long>): AbstractLongArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractLongArrayAssert<*>.containsSequence(values: Array<Long>): AbstractLongArrayAssert<*> = containsSequence(values)
infix fun AbstractLongArrayAssert<*>.containsSubsequence(values: Array<Long>): AbstractLongArrayAssert<*> = containsSubsequence(values)
infix fun AbstractLongArrayAssert<*>.doesNotContain(values: Array<Long>): AbstractLongArrayAssert<*> = doesNotContain(values)
infix fun AbstractLongArrayAssert<*>.startsWith(sequence: Array<Long>): AbstractLongArrayAssert<*> = startsWith(sequence)
infix fun AbstractLongArrayAssert<*>.endsWith(sequence: Array<Long>): AbstractLongArrayAssert<*> = endsWith(sequence)
infix fun AbstractLongArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Long>): AbstractLongArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractLongArrayAssert<*>.containsExactly(values: Array<Long>): AbstractLongArrayAssert<*> = containsExactly(values)
infix fun AbstractLongArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Long>): AbstractLongArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractLongArrayAssert<*>.containsAnyOf(values: Array<Long>): AbstractLongArrayAssert<*> = containsAnyOf(values)

infix fun AbstractLongArrayAssert<*>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractLongArrayAssert<*> {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun AbstractLongArrayAssert<*>.contains(block: () -> Pair<Long, Index>): AbstractLongArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractLongArrayAssert<*>.doesNotContain(block: () -> Pair<Long, Index>): AbstractLongArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}