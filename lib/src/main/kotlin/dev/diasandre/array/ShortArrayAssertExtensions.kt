package dev.diasandre.array

import org.assertj.core.api.ShortArrayAssert
import org.assertj.core.data.Index

infix fun ShortArrayAssert.hasSize(expected: Short): ShortArrayAssert = hasSize(expected)
infix fun ShortArrayAssert.hasSizeGreaterThan(expected: Short): ShortArrayAssert = hasSizeGreaterThan(expected)
infix fun ShortArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Short): ShortArrayAssert = hasSizeGreaterThanOrEqualTo(expected)
infix fun ShortArrayAssert.hasSizeLessThan(expected: Short): ShortArrayAssert = hasSizeLessThan(expected)
infix fun ShortArrayAssert.hasSizeLessThanOrEqualTo(expected: Short): ShortArrayAssert = hasSizeLessThanOrEqualTo(expected)
infix fun ShortArrayAssert.hasSameSizeAs(expected: Iterable<*>): ShortArrayAssert = hasSameSizeAs(expected)
infix fun ShortArrayAssert.contains(values: Array<Short>): ShortArrayAssert = contains(values)
infix fun ShortArrayAssert.containsOnly(values: Array<Short>): ShortArrayAssert = containsOnly(values)
infix fun ShortArrayAssert.containsOnlyOnce(values: Array<Short>): ShortArrayAssert = containsOnlyOnce(values)
infix fun ShortArrayAssert.containsSequence(values: Array<Short>): ShortArrayAssert = containsSequence(values)
infix fun ShortArrayAssert.containsSubsequence(values: Array<Short>): ShortArrayAssert = containsSubsequence(values)
infix fun ShortArrayAssert.doesNotContain(values: Array<Short>): ShortArrayAssert = doesNotContain(values)
infix fun ShortArrayAssert.startsWith(sequence: Array<Short>): ShortArrayAssert = startsWith(sequence)
infix fun ShortArrayAssert.endsWith(sequence: Array<Short>): ShortArrayAssert = endsWith(sequence)
infix fun ShortArrayAssert.isSortedAccordingTo(comparator: Comparator<Short>): ShortArrayAssert = isSortedAccordingTo(comparator)
infix fun ShortArrayAssert.containsExactly(values: Array<Short>): ShortArrayAssert = containsExactly(values)
infix fun ShortArrayAssert.containsExactlyInAnyOrder(values: Array<Short>): ShortArrayAssert = containsExactlyInAnyOrder(values)
infix fun ShortArrayAssert.containsAnyOf(values: Array<Short>): ShortArrayAssert = containsAnyOf(values)

infix fun ShortArrayAssert.hasSizeBetween(block: () -> Pair<Int, Int>): ShortArrayAssert {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun ShortArrayAssert.contains(block: () -> Pair<Short, Index>): ShortArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun ShortArrayAssert.doesNotContain(block: () -> Pair<Short, Index>): ShortArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}