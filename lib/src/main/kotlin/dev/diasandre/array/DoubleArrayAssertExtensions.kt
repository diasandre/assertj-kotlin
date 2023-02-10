package dev.diasandre.array

import org.assertj.core.api.DoubleArrayAssert
import org.assertj.core.data.Index

infix fun DoubleArrayAssert.hasSize(expected: Int): DoubleArrayAssert = hasSize(expected)

infix fun DoubleArrayAssert.hasSizeGreaterThan(expected: Int): DoubleArrayAssert = hasSizeGreaterThan(expected)

infix fun DoubleArrayAssert.hasSizeGreaterThanOrEqualTo(expected: Int): DoubleArrayAssert =
    hasSizeGreaterThanOrEqualTo(expected)

infix fun DoubleArrayAssert.hasSizeLessThan(expected: Int): DoubleArrayAssert = hasSizeLessThan(expected)

infix fun DoubleArrayAssert.hasSizeLessThanOrEqualTo(expected: Int): DoubleArrayAssert =
    hasSizeLessThanOrEqualTo(expected)

infix fun DoubleArrayAssert.hasSizeBetween(pair: Pair<Int, Int>): DoubleArrayAssert =
    hasSizeBetween(pair.first, pair.second)

infix fun DoubleArrayAssert.hasSameSizeAs(expected: Iterable<*>): DoubleArrayAssert =
    hasSameSizeAs(expected)

infix fun DoubleArrayAssert.contains(values: Array<Double>): DoubleArrayAssert = contains(values)

infix fun DoubleArrayAssert.containsOnly(values: Array<Double>): DoubleArrayAssert = containsOnly(values)

infix fun DoubleArrayAssert.containsOnlyOnce(values: Array<Double>): DoubleArrayAssert = containsOnlyOnce(values)

infix fun DoubleArrayAssert.containsSequence(values: Array<Double>): DoubleArrayAssert = containsSequence(values)

infix fun DoubleArrayAssert.containsSubsequence(values: Array<Double>): DoubleArrayAssert =
    containsSubsequence(values)

infix fun DoubleArrayAssert.contains(pair: Pair<Double, Index>): DoubleArrayAssert =
    contains(pair.first, pair.second)

infix fun DoubleArrayAssert.doesNotContain(values: Array<Double>): DoubleArrayAssert =
    doesNotContain(values)

infix fun DoubleArrayAssert.doesNotContain(pair: Pair<Double, Index>): DoubleArrayAssert =
    doesNotContain(pair.first, pair.second)

infix fun DoubleArrayAssert.startsWith(sequence: Array<Double>): DoubleArrayAssert = startsWith(sequence)

infix fun DoubleArrayAssert.endsWith(sequence: Array<Double>): DoubleArrayAssert = endsWith(sequence)

infix fun DoubleArrayAssert.isSortedAccordingTo(comparator: Comparator<Double>): DoubleArrayAssert =
    isSortedAccordingTo(comparator)

infix fun DoubleArrayAssert.containsExactly(values: Array<Double>): DoubleArrayAssert = containsExactly(values)

infix fun DoubleArrayAssert.containsExactlyInAnyOrder(values: Array<Double>): DoubleArrayAssert =
    containsExactlyInAnyOrder(values)

infix fun DoubleArrayAssert.containsAnyOf(values: Array<Double>): DoubleArrayAssert = containsAnyOf(values)