package dev.diasandre.array

import org.assertj.core.api.AbstractCharArrayAssert
import org.assertj.core.data.Index

infix fun AbstractCharArrayAssert<*>.hasSize(expected: Int): AbstractCharArrayAssert<*> = hasSize(expected)
infix fun AbstractCharArrayAssert<*>.hasSizeGreaterThan(expected: Int): AbstractCharArrayAssert<*> = hasSizeGreaterThan(expected)
infix fun AbstractCharArrayAssert<*>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractCharArrayAssert<*> = hasSizeGreaterThanOrEqualTo(expected)
infix fun AbstractCharArrayAssert<*>.hasSizeLessThan(expected: Int): AbstractCharArrayAssert<*> = hasSizeLessThan(expected)
infix fun AbstractCharArrayAssert<*>.hasSizeLessThanOrEqualTo(expected: Int): AbstractCharArrayAssert<*> = hasSizeLessThanOrEqualTo(expected)
infix fun AbstractCharArrayAssert<*>.hasSizeBetween(pair: Pair<Int, Int>): AbstractCharArrayAssert<*> = hasSizeBetween(pair.first, pair.second)
infix fun AbstractCharArrayAssert<*>.hasSameSizeAs(expected: Iterable<*>): AbstractCharArrayAssert<*> = hasSameSizeAs(expected)
infix fun AbstractCharArrayAssert<*>.contains(values: Array<Char>): AbstractCharArrayAssert<*> = contains(values)
infix fun AbstractCharArrayAssert<*>.containsOnly(values: Array<Char>): AbstractCharArrayAssert<*> = containsOnly(values)
infix fun AbstractCharArrayAssert<*>.containsOnlyOnce(values: Array<Char>): AbstractCharArrayAssert<*> = containsOnlyOnce(values)
infix fun AbstractCharArrayAssert<*>.containsSequence(values: Array<Char>): AbstractCharArrayAssert<*> = containsSequence(values)
infix fun AbstractCharArrayAssert<*>.containsSubsequence(values: Array<Char>): AbstractCharArrayAssert<*> = containsSubsequence(values)
infix fun AbstractCharArrayAssert<*>.doesNotContain(values: Array<Char>): AbstractCharArrayAssert<*> = doesNotContain(values)
infix fun AbstractCharArrayAssert<*>.startsWith(sequence: Array<Char>): AbstractCharArrayAssert<*> = startsWith(sequence)
infix fun AbstractCharArrayAssert<*>.endsWith(sequence: Array<Char>): AbstractCharArrayAssert<*> = endsWith(sequence)
infix fun AbstractCharArrayAssert<*>.isSortedAccordingTo(comparator: Comparator<Char>): AbstractCharArrayAssert<*> = isSortedAccordingTo(comparator)
infix fun AbstractCharArrayAssert<*>.containsExactly(values: Array<Char>): AbstractCharArrayAssert<*> = containsExactly(values)
infix fun AbstractCharArrayAssert<*>.containsExactlyInAnyOrder(values: Array<Char>): AbstractCharArrayAssert<*> = containsExactlyInAnyOrder(values)
infix fun AbstractCharArrayAssert<*>.containsAnyOf(values: Array<Char>): AbstractCharArrayAssert<*> = containsAnyOf(values)

infix fun AbstractCharArrayAssert<*>.contains(block: () -> Pair<Char, Index>): AbstractCharArrayAssert<*> {
    val (value, index) = block()
    return contains(value, index)
}

infix fun AbstractCharArrayAssert<*>.doesNotContain(block: () -> Pair<Char, Index>): AbstractCharArrayAssert<*> {
    val (value, index) = block()
    return doesNotContain(value, index)
}