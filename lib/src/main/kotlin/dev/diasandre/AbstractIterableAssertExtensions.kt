@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractIterableAssert
import org.assertj.core.api.Condition
import org.assertj.core.api.ThrowingConsumer
import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration
import java.util.function.Consumer
import java.util.function.Predicate

typealias IterableAssert<ELEMENT> = AbstractIterableAssert<*, Iterable<ELEMENT>, ELEMENT, *>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSize(expected: Int): IterableAssert<ELEMENT> = hasSize(expected) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSizeGreaterThan(boundary: Int): IterableAssert<ELEMENT> = hasSizeGreaterThan(boundary) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSizeGreaterThanOrEqualTo(boundary: Int): IterableAssert<ELEMENT> = hasSizeGreaterThan(boundary) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSizeLessThan(boundary: Int): IterableAssert<ELEMENT> = hasSizeLessThan(boundary) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSizeLessThanOrEqualTo(boundary: Int): IterableAssert<ELEMENT> = hasSizeLessThanOrEqualTo(boundary) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSizeBetween(block: () -> Pair<Int, Int>): IterableAssert<ELEMENT> {
    val (lowerBoundary, higherBoundary) = block()
    return hasSizeBetween(lowerBoundary, higherBoundary) as IterableAssert<ELEMENT>
}

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSameSizeAs(expected: Iterable<*>): IterableAssert<ELEMENT> = hasSameSizeAs(expected) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.containsExactlyInAnyOrderElementsOf(values: Iterable<ELEMENT>): IterableAssert<ELEMENT> = containsExactlyInAnyOrderElementsOf(values) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.isSubsetOf(values: Iterable<ELEMENT>): IterableAssert<ELEMENT> = isSubsetOf(values) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.containsSequence(values: Iterable<ELEMENT>): IterableAssert<ELEMENT> = containsSequence(values) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.doesNotContainSequence(sequence: Iterable<ELEMENT>): IterableAssert<ELEMENT> = doesNotContainSequence(sequence) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.containsSubsequence(subsequence: Iterable<ELEMENT>): IterableAssert<ELEMENT> = containsSubsequence(subsequence) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.doesNotContainSubsequence(subsequence: Iterable<ELEMENT>): IterableAssert<ELEMENT> = doesNotContainSubsequence(subsequence) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.doesNotContainAnyElementsOf(iterable: Iterable<ELEMENT>): IterableAssert<ELEMENT> = doesNotContainAnyElementsOf(iterable) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.endsWith(sequence: Array<ELEMENT>): IterableAssert<ELEMENT> = endsWith(sequence) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.are(condition: Condition<ELEMENT>): IterableAssert<ELEMENT> = are(condition) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.areNot(condition: Condition<ELEMENT>): IterableAssert<ELEMENT> = areNot(condition) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.have(condition: Condition<ELEMENT>): IterableAssert<ELEMENT> = have(condition) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.doNotHave(condition: Condition<ELEMENT>): IterableAssert<ELEMENT> = doNotHave(condition) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.areAtLeastOne(condition: Condition<ELEMENT>): IterableAssert<ELEMENT> = areAtLeastOne(condition) as IterableAssert<ELEMENT>

// public SELF areAtLeast(int times, Condition<? super ELEMENT> condition)

// public SELF areAtMost(int times, Condition<? super ELEMENT> condition)

// public SELF areExactly(int times, Condition<? super ELEMENT> condition)

infix fun <ELEMENT> IterableAssert<ELEMENT>.haveAtLeastOne(condition: Condition<ELEMENT>): IterableAssert<ELEMENT> = haveAtLeastOne(condition) as IterableAssert<ELEMENT>

// public SELF haveAtLeast(int times, Condition<? super ELEMENT> condition)

// public SELF haveExactly(int times, Condition<? super ELEMENT> condition)

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasAtLeastOneElementOfType(expectedType: Class<*>): IterableAssert<ELEMENT> = hasAtLeastOneElementOfType(expectedType) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasOnlyElementsOfType(expectedType: Class<*>): IterableAssert<ELEMENT> = hasOnlyElementsOfType(expectedType) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.containsAll(iterable: Iterable<ELEMENT>): IterableAssert<ELEMENT> = containsAll(iterable) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.usingElementComparator(elementComparator: Comparator<ELEMENT>): IterableAssert<ELEMENT> = usingElementComparator(elementComparator) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.containsAnyElementsOf(iterable: Iterable<ELEMENT>): IterableAssert<ELEMENT> = containsAnyElementsOf(iterable) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.containsExactlyElementsOf(iterable: Iterable<ELEMENT>): IterableAssert<ELEMENT> = containsExactlyElementsOf(iterable) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.containsOnlyOnceElementsOf(iterable: Iterable<ELEMENT>): IterableAssert<ELEMENT> = containsOnlyOnceElementsOf(iterable) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.hasSameElementsAs(iterable: Iterable<ELEMENT>): IterableAssert<ELEMENT> = hasSameElementsAs(iterable) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.usingRecursiveFieldByFieldElementComparator(configuration: RecursiveComparisonConfiguration): IterableAssert<ELEMENT> = usingRecursiveFieldByFieldElementComparator(configuration) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.filteredOnNull(propertyOrFieldName: String): IterableAssert<ELEMENT> = filteredOnNull(propertyOrFieldName) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.filteredOn(condition: Condition<ELEMENT>): IterableAssert<ELEMENT> = filteredOn(condition) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.filteredOnAssertions(elementAssertions: Consumer<ELEMENT>): IterableAssert<ELEMENT> = filteredOnAssertions(elementAssertions) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.filteredOnAssertions(elementAssertions: ThrowingConsumer<ELEMENT>): IterableAssert<ELEMENT> = filteredOnAssertions(elementAssertions) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.filteredOn(predicate: Predicate<ELEMENT>): IterableAssert<ELEMENT> = filteredOn(predicate) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.allMatch(predicate: Predicate<ELEMENT>): IterableAssert<ELEMENT> = allMatch(predicate) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.allSatisfy(requirements: Consumer<ELEMENT>): IterableAssert<ELEMENT> = allSatisfy(requirements) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.allSatisfy(requirements: ThrowingConsumer<ELEMENT>): IterableAssert<ELEMENT> = allSatisfy(requirements) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.anyMatch(predicate: Predicate<ELEMENT>): IterableAssert<ELEMENT> = anyMatch(predicate) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.anySatisfy(requirements: Consumer<ELEMENT>): IterableAssert<ELEMENT> = anySatisfy(requirements) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.anySatisfy(requirements: ThrowingConsumer<ELEMENT>): IterableAssert<ELEMENT> = anySatisfy(requirements) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.noneSatisfy(requirements: Consumer<ELEMENT>): IterableAssert<ELEMENT> = noneSatisfy(requirements) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.noneSatisfy(requirements: ThrowingConsumer<ELEMENT>): IterableAssert<ELEMENT> = noneSatisfy(requirements) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.satisfiesOnlyOnce(requirements: Consumer<ELEMENT>): IterableAssert<ELEMENT> = satisfiesOnlyOnce(requirements) as IterableAssert<ELEMENT>

infix fun <ELEMENT> IterableAssert<ELEMENT>.satisfiesOnlyOnce(requirements: ThrowingConsumer<ELEMENT>): IterableAssert<ELEMENT> = satisfiesOnlyOnce(requirements) as IterableAssert<ELEMENT>