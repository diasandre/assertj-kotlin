package dev.diasandre.array

import org.assertj.core.api.AbstractByteArrayAssert
import org.assertj.core.data.Index

infix fun AbstractByteArrayAssert<*>.hasSize(expected: Int): AbstractByteArrayAssert<*> = hasSize(expected)
infix fun AbstractByteArrayAssert<*>.hasSizeGreaterThan(expected: Int): AbstractByteArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractByteArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractByteArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractByteArrayAssert<*>.hasSizeLessThan(expected: Int): AbstractByteArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractByteArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Int): AbstractByteArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractByteArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractByteArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractByteArrayAssert<*>.contains(values: Array<Byte>): AbstractByteArrayAssert<*> = contains(values)
infix fun AbstractByteArrayAssert<*>.containsOnly(values: Array<Byte>): AbstractByteArrayAssert<*> = containsOnly(values)
infix fun AbstractByteArrayAssert<*>.containsOnlyOnce(values: Array<Byte>): AbstractByteArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractByteArrayAssert<*>.containsSequence(values: Array<Byte>): AbstractByteArrayAssert<*> = containsSequence(values)
infix fun AbstractByteArrayAssert<*>.containsSubsequence(values: Array<Byte>): AbstractByteArrayAssert<*> = containsSubsequence(values)
infix fun AbstractByteArrayAssert<*>.startsWith(sequence: Array<Byte>): AbstractByteArrayAssert<*> = startsWith(sequence)
infix fun AbstractByteArrayAssert<*>.endsWith(sequence: Array<Byte>): AbstractByteArrayAssert<*> = endsWith(sequence)
infix fun AbstractByteArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Byte>): AbstractByteArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractByteArrayAssert<*>.containsExactly(values: Array<Byte>): AbstractByteArrayAssert<*> = containsExactly(values)
infix fun AbstractByteArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Byte>): AbstractByteArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractByteArrayAssert<*>.containsAnyOf(values: Array<Byte>): AbstractByteArrayAssert<*> = containsAnyOf(values)
infix fun AbstractByteArrayAssert<*>.doesNotContain(values: Array<Byte>): AbstractByteArrayAssert<*> = doesNotContain(values)

infix fun AbstractByteArrayAssert<*>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractByteArrayAssert<*> {
    val (lowerBoundary, higherBoundary) = block()
    return hasSizeBetween(lowerBoundary, higherBoundary)
}

infix fun AbstractByteArrayAssert<*>.contains(block: () -> Pair<Byte, Index>): AbstractByteArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractByteArrayAssert<*>.doesNotContain(block: () -> Pair<Byte, Index>): AbstractByteArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}