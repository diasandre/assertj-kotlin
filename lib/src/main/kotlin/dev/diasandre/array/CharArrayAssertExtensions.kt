package dev.diasandre.array

import org.assertj.core.api.CharArrayAssert
import org.assertj.core.data.Index

infix fun CharArrayAssert.hasSize(expected: Int): CharArrayAssert = hasSize(expected)

infix fun CharArrayAssert.hasSizeGreaterThan(expected: Int): CharArrayAssert = hasSizeGreaterThan(expected)

infix fun CharArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Int): CharArrayAssert =
    hasSizeGreaterThanOrEqualTo(expected)

infix fun CharArrayAssert.hasSizeLessThan(expected: Int): CharArrayAssert = hasSizeLessThan(expected)

infix fun CharArrayAssert.hasSizeLessThanOrEqualTo(expected: Int): CharArrayAssert =
    hasSizeLessThanOrEqualTo(expected)

infix fun CharArrayAssert.hasSizeBetween(pair: Pair<Int, Int>): CharArrayAssert =
    hasSizeBetween(pair.first, pair.second)

infix fun CharArrayAssert.hasSameSizeAs(expected: Iterable<*>): CharArrayAssert =
    hasSameSizeAs(expected)

infix fun CharArrayAssert.contains(values: Array<Char>): CharArrayAssert = contains(values)

infix fun CharArrayAssert.containsOnly(values: Array<Char>): CharArrayAssert = containsOnly(values)

infix fun CharArrayAssert.containsOnlyOnce(values: Array<Char>): CharArrayAssert = containsOnlyOnce(values)

infix fun CharArrayAssert.containsSequence(values: Array<Char>): CharArrayAssert = containsSequence(values)

infix fun CharArrayAssert.containsSubsequence(values: Array<Char>): CharArrayAssert =
    containsSubsequence(values)

infix fun CharArrayAssert.contains(pair: Pair<Char, Index>): CharArrayAssert =
    contains(pair.first, pair.second)

infix fun CharArrayAssert.doesNotContain(values: Array<Char>): CharArrayAssert =
    doesNotContain(values)

infix fun CharArrayAssert.doesNotContain(pair: Pair<Char, Index>): CharArrayAssert =
    doesNotContain(pair.first, pair.second)

infix fun CharArrayAssert.startsWith(sequence: Array<Char>): CharArrayAssert = startsWith(sequence)

infix fun CharArrayAssert.endsWith(sequence: Array<Char>): CharArrayAssert = endsWith(sequence)

infix fun CharArrayAssert.isSortedAccordingTo(comparator: Comparator<Char>): CharArrayAssert =
    isSortedAccordingTo(comparator)

infix fun CharArrayAssert.containsExactly(values: Array<Char>): CharArrayAssert = containsExactly(values)

infix fun CharArrayAssert.containsExactlyInAnyOrder(values: Array<Char>): CharArrayAssert =
    containsExactlyInAnyOrder(values)

infix fun CharArrayAssert.containsAnyOf(values: Array<Char>): CharArrayAssert = containsAnyOf(values)