package dev.diasandre.array

import org.assertj.core.api.FloatArrayAssert
import org.assertj.core.data.Index

infix fun FloatArrayAssert.hasSize(expected: Int): FloatArrayAssert = hasSize(expected)

infix fun FloatArrayAssert.hasSizeGreaterThan(expected: Int): FloatArrayAssert = hasSizeGreaterThan(expected)

infix fun FloatArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Int): FloatArrayAssert =
    hasSizeGreaterThanOrEqualTo(expected)

infix fun FloatArrayAssert.hasSizeLessThan(expected: Int): FloatArrayAssert = hasSizeLessThan(expected)

infix fun FloatArrayAssert.hasSizeLessThanOrEqualTo(expected: Int): FloatArrayAssert =
    hasSizeLessThanOrEqualTo(expected)

infix fun FloatArrayAssert.hasSizeBetween(pair: Pair<Int, Int>): FloatArrayAssert =
    hasSizeBetween(pair.first, pair.second)

infix fun FloatArrayAssert.hasSameSizeAs(expected: Iterable<*>): FloatArrayAssert =
    hasSameSizeAs(expected)

infix fun FloatArrayAssert.contains(values: Array<Float>): FloatArrayAssert = contains(values)

infix fun FloatArrayAssert.containsOnly(values: Array<Float>): FloatArrayAssert = containsOnly(values)

infix fun FloatArrayAssert.containsOnlyOnce(values: Array<Float>): FloatArrayAssert = containsOnlyOnce(values)

infix fun FloatArrayAssert.containsSequence(values: Array<Float>): FloatArrayAssert = containsSequence(values)

infix fun FloatArrayAssert.containsSubsequence(values: Array<Float>): FloatArrayAssert =
    containsSubsequence(values)

infix fun FloatArrayAssert.contains(pair: Pair<Float, Int>): FloatArrayAssert =
    contains(pair.first, Index.atIndex(pair.second))

infix fun FloatArrayAssert.contains(pair: Pair<Float, Index>): FloatArrayAssert =
    contains(pair.first, pair.second)

infix fun FloatArrayAssert.doesNotContain(values: Array<Float>): FloatArrayAssert =
    doesNotContain(values)

infix fun FloatArrayAssert.doesNotContain(pair: Pair<Float, Int>): FloatArrayAssert =
    doesNotContain(pair.first, Index.atIndex(pair.second))

infix fun FloatArrayAssert.doesNotContain(pair: Pair<Float, Index>): FloatArrayAssert =
    doesNotContain(pair.first, pair.second)

infix fun FloatArrayAssert.startsWith(sequence: Array<Float>): FloatArrayAssert = startsWith(sequence)

infix fun FloatArrayAssert.endsWith(sequence: Array<Float>): FloatArrayAssert = endsWith(sequence)

infix fun FloatArrayAssert.isSortedAccordingTo(comparator: Comparator<Float>): FloatArrayAssert =
    isSortedAccordingTo(comparator)

infix fun FloatArrayAssert.containsExactly(values: Array<Float>): FloatArrayAssert = containsExactly(values)

infix fun FloatArrayAssert.containsExactlyInAnyOrder(values: Array<Float>): FloatArrayAssert =
    containsExactlyInAnyOrder(values)

infix fun FloatArrayAssert.containsAnyOf(values: Array<Float>): FloatArrayAssert = containsAnyOf(values)