package dev.diasandre.array

import org.assertj.core.api.AbstractFloatArrayAssert
import org.assertj.core.data.Index

infix fun AbstractFloatArrayAssert<*>.hasSize(expected: Int): AbstractFloatArrayAssert<*> = hasSize(expected)
infix fun AbstractFloatArrayAssert<*>.hasSizeGreaterThan(expected: Int): AbstractFloatArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractFloatArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractFloatArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractFloatArrayAssert<*>.hasSizeLessThan(expected: Int): AbstractFloatArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractFloatArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Int): AbstractFloatArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractFloatArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractFloatArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractFloatArrayAssert<*>.contains(values: Array<Float>): AbstractFloatArrayAssert<*> = contains(values)
infix fun AbstractFloatArrayAssert<*>.containsOnly(values: Array<Float>): AbstractFloatArrayAssert<*> = containsOnly(values)
infix fun AbstractFloatArrayAssert<*>.containsOnlyOnce(values: Array<Float>): AbstractFloatArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractFloatArrayAssert<*>.containsSequence(values: Array<Float>): AbstractFloatArrayAssert<*> = containsSequence(values)
infix fun AbstractFloatArrayAssert<*>.containsSubsequence(values: Array<Float>): AbstractFloatArrayAssert<*> = containsSubsequence(values)
infix fun AbstractFloatArrayAssert<*>.doesNotContain(values: Array<Float>): AbstractFloatArrayAssert<*> = doesNotContain(values)
infix fun AbstractFloatArrayAssert<*>.startsWith(sequence: Array<Float>): AbstractFloatArrayAssert<*> = startsWith(sequence)
infix fun AbstractFloatArrayAssert<*>.endsWith(sequence: Array<Float>): AbstractFloatArrayAssert<*> = endsWith(sequence)
infix fun AbstractFloatArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Float>): AbstractFloatArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractFloatArrayAssert<*>.containsExactly(values: Array<Float>): AbstractFloatArrayAssert<*> = containsExactly(values)
infix fun AbstractFloatArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Float>): AbstractFloatArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractFloatArrayAssert<*>.containsAnyOf(values: Array<Float>): AbstractFloatArrayAssert<*> = containsAnyOf(values)

infix fun AbstractFloatArrayAssert<*>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractFloatArrayAssert<*> {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun AbstractFloatArrayAssert<*>.contains(block: () -> Pair<Float, Index>): AbstractFloatArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractFloatArrayAssert<*>.doesNotContain(block: () -> Pair<Float, Index>): AbstractFloatArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}