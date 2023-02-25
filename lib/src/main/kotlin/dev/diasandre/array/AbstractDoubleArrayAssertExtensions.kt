package dev.diasandre.array

import org.assertj.core.api.AbstractDoubleArrayAssert
import org.assertj.core.data.Index

infix fun AbstractDoubleArrayAssert<*>.hasSize(expected: Int): AbstractDoubleArrayAssert<*> = hasSize(expected)
infix fun AbstractDoubleArrayAssert<*>.hasSizeGreaterThan(expected: Int): AbstractDoubleArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractDoubleArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractDoubleArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractDoubleArrayAssert<*>.hasSizeLessThan(expected: Int): AbstractDoubleArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractDoubleArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Int): AbstractDoubleArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractDoubleArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractDoubleArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractDoubleArrayAssert<*>.contains(values: Array<Double>): AbstractDoubleArrayAssert<*> = contains(values)
infix fun AbstractDoubleArrayAssert<*>.containsOnly(values: Array<Double>): AbstractDoubleArrayAssert<*> = containsOnly(values)
infix fun AbstractDoubleArrayAssert<*>.containsOnlyOnce(values: Array<Double>): AbstractDoubleArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractDoubleArrayAssert<*>.containsSequence(values: Array<Double>): AbstractDoubleArrayAssert<*> = containsSequence(values)
infix fun AbstractDoubleArrayAssert<*>.containsSubsequence(values: Array<Double>): AbstractDoubleArrayAssert<*> = containsSubsequence(values)
infix fun AbstractDoubleArrayAssert<*>.doesNotContain(values: Array<Double>): AbstractDoubleArrayAssert<*> = doesNotContain(values)
infix fun AbstractDoubleArrayAssert<*>.startsWith(sequence: Array<Double>): AbstractDoubleArrayAssert<*> = startsWith(sequence)
infix fun AbstractDoubleArrayAssert<*>.endsWith(sequence: Array<Double>): AbstractDoubleArrayAssert<*> = endsWith(sequence)
infix fun AbstractDoubleArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Double>): AbstractDoubleArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractDoubleArrayAssert<*>.containsExactly(values: Array<Double>): AbstractDoubleArrayAssert<*> = containsExactly(values)
infix fun AbstractDoubleArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Double>): AbstractDoubleArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractDoubleArrayAssert<*>.containsAnyOf(values: Array<Double>): AbstractDoubleArrayAssert<*> = containsAnyOf(values)

infix fun AbstractDoubleArrayAssert<*>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractDoubleArrayAssert<*> {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun AbstractDoubleArrayAssert<*>.contains(block: () -> Pair<Double, Index>): AbstractDoubleArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractDoubleArrayAssert<*>.doesNotContain(block: () -> Pair<Double, Index>): AbstractDoubleArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}