package dev.diasandre.array

import org.assertj.core.api.AbstractBooleanArrayAssert
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.data.Index

infix fun BooleanArray.hasSize(expected: Int): AbstractBooleanArrayAssert<*> = assertThat(this) hasSize expected
infix fun AbstractBooleanArrayAssert<*>.hasSize(expected: Int): AbstractBooleanArrayAssert<*> = hasSize(expected)

infix fun AbstractBooleanArrayAssert<*>.hasSizeGreaterThan(expected: Int): AbstractBooleanArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractBooleanArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractBooleanArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractBooleanArrayAssert<*>.hasSizeLessThan(expected: Int): AbstractBooleanArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractBooleanArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Int): AbstractBooleanArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractBooleanArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractBooleanArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractBooleanArrayAssert<*>.contains(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = contains(values)
infix fun AbstractBooleanArrayAssert<*>.containsOnly(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = containsOnly(values)
infix fun AbstractBooleanArrayAssert<*>.containsOnlyOnce(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractBooleanArrayAssert<*>.containsSequence(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = containsSequence(values)
infix fun AbstractBooleanArrayAssert<*>.containsSubsequence(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = containsSubsequence(values)
infix fun AbstractBooleanArrayAssert<*>.doesNotContain(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = doesNotContain(values)
infix fun AbstractBooleanArrayAssert<*>.startsWith(sequence: Array<Boolean>): AbstractBooleanArrayAssert<*> = startsWith(sequence)
infix fun AbstractBooleanArrayAssert<*>.endsWith(sequence: Array<Boolean>): AbstractBooleanArrayAssert<*> = endsWith(sequence)
infix fun AbstractBooleanArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Boolean>): AbstractBooleanArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractBooleanArrayAssert<*>.containsExactly(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = containsExactly(values)
infix fun AbstractBooleanArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractBooleanArrayAssert<*>.containsAnyOf(values: Array<Boolean>): AbstractBooleanArrayAssert<*> = containsAnyOf(values)

infix fun AbstractBooleanArrayAssert<*>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractBooleanArrayAssert<*> {
    val (start, end) = block()
    return hasSizeBetween(start, end)
}

infix fun AbstractBooleanArrayAssert<*>.contains(block: () -> Pair<Boolean, Index>): AbstractBooleanArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractBooleanArrayAssert<*>.doesNotContain(block: () -> Pair<Boolean, Index>): AbstractBooleanArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}