package dev.diasandre.array

import org.assertj.core.api.IntArrayAssert
import org.assertj.core.data.Index

infix fun IntArrayAssert.hasSize(expected: Int): IntArrayAssert = hasSize(expected)
infix fun IntArrayAssert.hasSizeGreaterThan(expected: Int): IntArrayAssert = hasSizeGreaterThan(expected)
infix fun IntArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Int): IntArrayAssert = hasSizeGreaterThanOrEqualTo(expected)
infix fun IntArrayAssert.hasSizeLessThan(expected: Int): IntArrayAssert = hasSizeLessThan(expected)
infix fun IntArrayAssert.hasSizeLessThanOrEqualTo(expected: Int): IntArrayAssert = hasSizeLessThanOrEqualTo(expected)
infix fun IntArrayAssert.hasSameSizeAs(expected: Iterable<*>): IntArrayAssert = hasSameSizeAs(expected)
infix fun IntArrayAssert.contains(values: Array<Int>): IntArrayAssert = contains(values)
infix fun IntArrayAssert.containsOnly(values: Array<Int>): IntArrayAssert = containsOnly(values)
infix fun IntArrayAssert.containsOnlyOnce(values: Array<Int>): IntArrayAssert = containsOnlyOnce(values)
infix fun IntArrayAssert.containsSequence(values: Array<Int>): IntArrayAssert = containsSequence(values)
infix fun IntArrayAssert.containsSubsequence(values: Array<Int>): IntArrayAssert = containsSubsequence(values)
infix fun IntArrayAssert.doesNotContain(values: Array<Int>): IntArrayAssert = doesNotContain(values)
infix fun IntArrayAssert.startsWith(sequence: Array<Int>): IntArrayAssert = startsWith(sequence)
infix fun IntArrayAssert.endsWith(sequence: Array<Int>): IntArrayAssert = endsWith(sequence)
infix fun IntArrayAssert.isSortedAccordingTo(comparator: Comparator<Int>): IntArrayAssert = isSortedAccordingTo(comparator)
infix fun IntArrayAssert.containsExactly(values: Array<Int>): IntArrayAssert = containsExactly(values)
infix fun IntArrayAssert.containsExactlyInAnyOrder(values: Array<Int>): IntArrayAssert = containsExactlyInAnyOrder(values)
infix fun IntArrayAssert.containsAnyOf(values: Array<Int>): IntArrayAssert = containsAnyOf(values)

infix fun IntArrayAssert.hasSizeBetween(block: () -> Pair<Int, Int>): IntArrayAssert {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun IntArrayAssert.contains(block: () -> Pair<Int, Index>): IntArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun IntArrayAssert.doesNotContain(block: () -> Pair<Int, Index>): IntArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}