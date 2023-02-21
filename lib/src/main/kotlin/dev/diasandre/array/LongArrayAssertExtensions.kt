package dev.diasandre.array

import org.assertj.core.api.LongArrayAssert
import org.assertj.core.data.Index

infix fun LongArrayAssert.hasSize(expected: Long): LongArrayAssert = hasSize(expected)
infix fun LongArrayAssert.hasSizeGreaterThan(expected: Long): LongArrayAssert = hasSizeGreaterThan(expected)
infix fun LongArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Long): LongArrayAssert = hasSizeGreaterThanOrEqualTo(expected)
infix fun LongArrayAssert.hasSizeLessThan(expected: Long): LongArrayAssert = hasSizeLessThan(expected)
infix fun LongArrayAssert.hasSizeLessThanOrEqualTo(expected: Long): LongArrayAssert = hasSizeLessThanOrEqualTo(expected)
infix fun LongArrayAssert.hasSameSizeAs(expected: Iterable<*>): LongArrayAssert = hasSameSizeAs(expected)
infix fun LongArrayAssert.contains(values: Array<Long>): LongArrayAssert = contains(values)
infix fun LongArrayAssert.containsOnly(values: Array<Long>): LongArrayAssert = containsOnly(values)
infix fun LongArrayAssert.containsOnlyOnce(values: Array<Long>): LongArrayAssert = containsOnlyOnce(values)
infix fun LongArrayAssert.containsSequence(values: Array<Long>): LongArrayAssert = containsSequence(values)
infix fun LongArrayAssert.containsSubsequence(values: Array<Long>): LongArrayAssert = containsSubsequence(values)
infix fun LongArrayAssert.doesNotContain(values: Array<Long>): LongArrayAssert = doesNotContain(values)
infix fun LongArrayAssert.startsWith(sequence: Array<Long>): LongArrayAssert = startsWith(sequence)
infix fun LongArrayAssert.endsWith(sequence: Array<Long>): LongArrayAssert = endsWith(sequence)
infix fun LongArrayAssert.isSortedAccordingTo(comparator: Comparator<Long>): LongArrayAssert = isSortedAccordingTo(comparator)
infix fun LongArrayAssert.containsExactly(values: Array<Long>): LongArrayAssert = containsExactly(values)
infix fun LongArrayAssert.containsExactlyInAnyOrder(values: Array<Long>): LongArrayAssert = containsExactlyInAnyOrder(values)
infix fun LongArrayAssert.containsAnyOf(values: Array<Long>): LongArrayAssert = containsAnyOf(values)

infix fun LongArrayAssert.hasSizeBetween(block: () -> Pair<Int, Int>): LongArrayAssert {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun LongArrayAssert.contains(block: () -> Pair<Long, Index>): LongArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun LongArrayAssert.doesNotContain(block: () -> Pair<Long, Index>): LongArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}