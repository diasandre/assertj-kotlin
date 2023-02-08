package dev.diasandre.array

import org.assertj.core.api.BooleanArrayAssert
import org.assertj.core.data.Index

infix fun BooleanArrayAssert.hasSize(expected: Int): BooleanArrayAssert = hasSize(expected)

infix fun BooleanArrayAssert.hasSizeGreaterThan(expected: Int): BooleanArrayAssert = hasSizeGreaterThan(expected)

infix fun BooleanArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Int): BooleanArrayAssert = hasSizeGreaterThanOrEqualTo(expected)

infix fun BooleanArrayAssert.hasSizeLessThan(expected: Int): BooleanArrayAssert = hasSizeLessThan(expected)

infix fun BooleanArrayAssert.hasSizeLessThanOrEqualTo(expected: Int): BooleanArrayAssert = hasSizeLessThanOrEqualTo(expected)

infix fun BooleanArrayAssert.hasSizeBetween(block: () -> Pair<Int, Int>): BooleanArrayAssert {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun BooleanArrayAssert.hasSameSizeAs(expected: Iterable<*>): BooleanArrayAssert = hasSameSizeAs(expected)

infix fun BooleanArrayAssert.contains(values: Array<Boolean>): BooleanArrayAssert = contains(values)

infix fun BooleanArrayAssert.containsOnly(values: Array<Boolean>): BooleanArrayAssert = containsOnly(values)

infix fun BooleanArrayAssert.containsOnlyOnce(values: Array<Boolean>): BooleanArrayAssert = containsOnlyOnce(values)

infix fun BooleanArrayAssert.containsSequence(values: Array<Boolean>): BooleanArrayAssert = containsSequence(values)

infix fun BooleanArrayAssert.containsSubsequence(values: Array<Boolean>): BooleanArrayAssert = containsSubsequence(values)

infix fun BooleanArrayAssert.contains(block: () -> Pair<Boolean, Int>): BooleanArrayAssert {
    val (value, index) = block()
    return contains(value, Index.atIndex(index))
}

infix fun BooleanArrayAssert.contains(block: () -> Pair<Boolean, Index>): BooleanArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun BooleanArrayAssert.doesNotContain(values: Array<Boolean>): BooleanArrayAssert = doesNotContain(values)

infix fun BooleanArrayAssert.doesNotContain(block: () -> Pair<Boolean, Int>): BooleanArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, Index.atIndex(index))
}

infix fun BooleanArrayAssert.doesNotContain(block: () -> Pair<Boolean, Index>): BooleanArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}

infix fun BooleanArrayAssert.startsWith(sequence: Array<Boolean>): BooleanArrayAssert = startsWith(sequence)

infix fun BooleanArrayAssert.endsWith(sequence: Array<Boolean>): BooleanArrayAssert = endsWith(sequence)

infix fun BooleanArrayAssert.isSortedAccordingTo(comparator: Comparator<Boolean>): BooleanArrayAssert = isSortedAccordingTo(comparator)

infix fun BooleanArrayAssert.containsExactly(values: Array<Boolean>): BooleanArrayAssert = containsExactly(values)

infix fun BooleanArrayAssert.containsExactlyInAnyOrder(values: Array<Boolean>): BooleanArrayAssert = containsExactlyInAnyOrder(values)

infix fun BooleanArrayAssert.containsAnyOf(values: Array<Boolean>): BooleanArrayAssert = containsAnyOf(values)