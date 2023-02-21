package dev.diasandre.array

import org.assertj.core.api.ByteArrayAssert
import org.assertj.core.data.Index

infix fun ByteArrayAssert.hasSize(expected: Int): ByteArrayAssert = hasSize(expected)
infix fun ByteArrayAssert.hasSizeGreaterThan(expected: Int): ByteArrayAssert = hasSizeGreaterThan(expected)
infix fun ByteArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Int): ByteArrayAssert = hasSizeGreaterThanOrEqualTo(expected)
infix fun ByteArrayAssert.hasSizeLessThan(expected: Int): ByteArrayAssert = hasSizeLessThan(expected)
infix fun ByteArrayAssert.hasSizeLessThanOrEqualTo(expected: Int): ByteArrayAssert = hasSizeLessThanOrEqualTo(expected)
infix fun ByteArrayAssert.hasSameSizeAs(expected: Iterable<*>): ByteArrayAssert = hasSameSizeAs(expected)
infix fun ByteArrayAssert.contains(values: Array<Byte>): ByteArrayAssert = contains(values)
infix fun ByteArrayAssert.containsOnly(values: Array<Byte>): ByteArrayAssert = containsOnly(values)
infix fun ByteArrayAssert.containsOnlyOnce(values: Array<Byte>): ByteArrayAssert = containsOnlyOnce(values)
infix fun ByteArrayAssert.containsSequence(values: Array<Byte>): ByteArrayAssert = containsSequence(values)
infix fun ByteArrayAssert.containsSubsequence(values: Array<Byte>): ByteArrayAssert = containsSubsequence(values)
infix fun ByteArrayAssert.startsWith(sequence: Array<Byte>): ByteArrayAssert = startsWith(sequence)
infix fun ByteArrayAssert.endsWith(sequence: Array<Byte>): ByteArrayAssert = endsWith(sequence)
infix fun ByteArrayAssert.isSortedAccordingTo(comparator: Comparator<Byte>): ByteArrayAssert = isSortedAccordingTo(comparator)
infix fun ByteArrayAssert.containsExactly(values: Array<Byte>): ByteArrayAssert = containsExactly(values)
infix fun ByteArrayAssert.containsExactlyInAnyOrder(values: Array<Byte>): ByteArrayAssert = containsExactlyInAnyOrder(values)
infix fun ByteArrayAssert.containsAnyOf(values: Array<Byte>): ByteArrayAssert = containsAnyOf(values)
infix fun ByteArrayAssert.doesNotContain(values: Array<Byte>): ByteArrayAssert = doesNotContain(values)

infix fun ByteArrayAssert.hasSizeBetween(block: () -> Pair<Int, Int>): ByteArrayAssert {
    val (lowerBoundary, higherBoundary) = block()
    return hasSizeBetween(lowerBoundary, higherBoundary)
}

infix fun ByteArrayAssert.contains(block: () -> Pair<Byte, Index>): ByteArrayAssert {
    val (value, index) = block()
    return contains(value, index)
}

infix fun ByteArrayAssert.doesNotContain(block: () -> Pair<Byte, Index>): ByteArrayAssert {
    val (value, index) = block()
    return doesNotContain(value, index)
}