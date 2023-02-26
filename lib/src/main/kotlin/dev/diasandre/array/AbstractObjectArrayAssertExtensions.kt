@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.array

import org.assertj.core.api.AbstractObjectArrayAssert
import org.assertj.core.api.Condition
import org.assertj.core.api.ThrowingConsumer
import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration
import org.assertj.core.data.Index
import java.util.function.Consumer
import java.util.function.Predicate

infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasSize(expected: Int): AbstractObjectArrayAssert<*, ELEMENT> = hasSize(expected) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasSizeGreaterThan(expected: Int): AbstractObjectArrayAssert<*, ELEMENT> = hasSizeGreaterThan(expected) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractObjectArrayAssert<*, ELEMENT> = hasSizeGreaterThanOrEqualTo(expected) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasSizeLessThan(expected: Int): AbstractObjectArrayAssert<*, ELEMENT> = hasSizeLessThan(expected) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasSizeLessThanOrEqualTo(expected: Int): AbstractObjectArrayAssert<*, ELEMENT> = hasSizeLessThanOrEqualTo(expected) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasSameSizeAs(expected: Iterable<*>): AbstractObjectArrayAssert<*, ELEMENT> = hasSameSizeAs(expected) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasOnlyOneElementSatisfying(elementAssertions: Consumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = hasOnlyOneElementSatisfying(elementAssertions) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasSameElementsAs(iterable: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = hasSameElementsAs(iterable) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.containsOnlyOnceElementsOf(iterable: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = containsOnlyOnceElementsOf(iterable) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.containsExactlyInAnyOrderElementsOf(iterable: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = containsExactlyInAnyOrderElementsOf(iterable) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.containsExactlyElementsOf(iterable: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = containsExactlyElementsOf(iterable) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.containsSequence(values: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = containsSequence(values) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.doesNotContainSequence(values: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = doesNotContainSequence(values) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.containsSubsequence(values: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = containsSubsequence(values) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.doesNotContainSubsequence(values: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = doesNotContainSubsequence(values) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.doesNotContainAnyElementsOf(values: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = doesNotContainAnyElementsOf(values) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.endsWith(sequence: Array<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = endsWith(sequence) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.isSubsetOf(values: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = isSubsetOf(values) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.are(condition: Condition<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = are(condition) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.areNot(condition: Condition<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = areNot(condition) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.have(condition: Condition<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = have(condition) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.doNotHave(condition: Condition<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = doNotHave(condition) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.areAtLeastOne(condition: Condition<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = areAtLeastOne(condition) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.haveAtLeastOne(condition: Condition<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = haveAtLeastOne(condition) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasAtLeastOneElementOfType(type: Class<*>): AbstractObjectArrayAssert<*, ELEMENT> = hasAtLeastOneElementOfType(type) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.hasOnlyElementsOfType(type: Class<*>): AbstractObjectArrayAssert<*, ELEMENT> = hasOnlyElementsOfType(type) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.isSortedAccordingTo(type: Comparator<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = isSortedAccordingTo(type) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.containsAll(iterable: Iterable<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = containsAll(iterable) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.usingElementComparator(elementComparator: Comparator<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = usingElementComparator(elementComparator) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.usingRecursiveFieldByFieldElementComparator(configuration: RecursiveComparisonConfiguration): AbstractObjectArrayAssert<*, ELEMENT> = usingRecursiveFieldByFieldElementComparator(configuration) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.filteredOnNull(propertyOrFieldName: String): AbstractObjectArrayAssert<*, ELEMENT> = filteredOnNull(propertyOrFieldName) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.filteredOn(condition: Condition<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = filteredOn(condition) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.filteredOnAssertions(elementAssertions: Consumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = filteredOnAssertions(elementAssertions) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.filteredOnAssertions(elementAssertions: ThrowingConsumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = filteredOnAssertions(elementAssertions) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.filteredOn(predicate: Predicate<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = filteredOn(predicate) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.allMatch(predicate: Predicate<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = allMatch(predicate) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.allSatisfy(requirements: Consumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = allSatisfy(requirements) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.allSatisfy(requirements: ThrowingConsumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = allSatisfy(requirements) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.anyMatch(predicate: Predicate<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = anyMatch(predicate) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.anySatisfy(requirements: Consumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = anySatisfy(requirements) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.anySatisfy(requirements: ThrowingConsumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = anySatisfy(requirements) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.noneSatisfy(requirements: Consumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = noneSatisfy(requirements) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.noneSatisfy(requirements: ThrowingConsumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = noneSatisfy(requirements) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.satisfiesOnlyOnce(requirements: Consumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = satisfiesOnlyOnce(requirements) as AbstractObjectArrayAssert<*, ELEMENT>
infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.satisfiesOnlyOnce(requirements: ThrowingConsumer<ELEMENT>): AbstractObjectArrayAssert<*, ELEMENT> = satisfiesOnlyOnce(requirements) as AbstractObjectArrayAssert<*, ELEMENT>

infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.contains(block: () -> Pair<ELEMENT, Index>): AbstractObjectArrayAssert<*, ELEMENT> {
    val (value, index) = block()
    return contains(value, index) as AbstractObjectArrayAssert<*, ELEMENT>
}

infix fun <ELEMENT> AbstractObjectArrayAssert<*, ELEMENT>.doesNotContain(block: () -> Pair<ELEMENT, Index>): AbstractObjectArrayAssert<*, ELEMENT> {
    val (value, index) = block()
    return doesNotContain(value, index) as AbstractObjectArrayAssert<*, ELEMENT>
}