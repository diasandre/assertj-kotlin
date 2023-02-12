@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractAssert
import org.assertj.core.api.Condition
import org.assertj.core.description.Description
import org.assertj.core.presentation.Representation
import java.util.function.Predicate
import java.util.function.Supplier

infix fun <T> AbstractAssert<*, T>.describedAs(description: Description): AbstractAssert<*, T> = describedAs(description) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.doesNotHave(condition: Condition<T>): AbstractAssert<*, T> = doesNotHave(condition) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isEqualTo(expected: Any?): AbstractAssert<*, T> = isEqualTo(expected) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isNotEqualTo(expected: Any?): AbstractAssert<*, T> = isNotEqualTo(expected) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isSameAs(expected: Any): AbstractAssert<*, T> = isSameAs(expected) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isNotSameAs(other: Any): AbstractAssert<*, T> = isNotSameAs(other) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isIn(values: Iterable<*>): AbstractAssert<*, T> = isIn(values) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isNotIn(values: Iterable<*>): AbstractAssert<*, T> = isNotIn(values) as AbstractAssert<*, T>

// infix fun <T> AbstractAssert<*, T>.isCondition(values: Iterable<*>): AbstractAssert<*, T> = this.is(values) as AbstractAssert<*, T> TODO reserved word

infix fun <T> AbstractAssert<*, T>.isNot(condition: Condition<T>): AbstractAssert<*, T> = isNot(condition) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.has(condition: Condition<T>): AbstractAssert<*, T> = has(condition) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.satisfies(condition: Condition<T>): AbstractAssert<*, T> = satisfies(condition) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isInstanceOf(type: Class<*>): AbstractAssert<*, T> = isInstanceOf(type) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isNotInstanceOf(type: Class<*>): AbstractAssert<*, T> = isNotInstanceOf(type) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.hasSameClassAs(other: Any): AbstractAssert<*, T> = hasSameClassAs(other) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.hasToString(expectedToString: String): AbstractAssert<*, T> = hasToString(expectedToString) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.doesNotHaveToString(expectedToString: String): AbstractAssert<*, T> = doesNotHaveToString(expectedToString) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.doesNotHaveSameClassAs(other: Any): AbstractAssert<*, T> = doesNotHaveSameClassAs(other) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isExactlyInstanceOf(type: Class<*>): AbstractAssert<*, T> = isExactlyInstanceOf(type) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.isNotExactlyInstanceOf(type: Class<*>): AbstractAssert<*, T> = isNotExactlyInstanceOf(type) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.overridingErrorMessage(supplier: Supplier<String>): AbstractAssert<*, T> = overridingErrorMessage(supplier) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.withFailMessage(supplier: Supplier<String>): AbstractAssert<*, T> = withFailMessage(supplier) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.usingComparator(customComparator: Comparator<T>): AbstractAssert<*, T> = usingComparator(customComparator) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.withRepresentation(representation: Representation): AbstractAssert<*, T> = withRepresentation(representation) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.matches(predicate: Predicate<T>): AbstractAssert<*, T> = matches(predicate) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.hasSameHashCodeAs(other: Any): AbstractAssert<*, T> = hasSameHashCodeAs(other) as AbstractAssert<*, T>

infix fun <T> AbstractAssert<*, T>.doesNotHaveSameHashCodeAs(other: Any): AbstractAssert<*, T> = doesNotHaveSameHashCodeAs(other) as AbstractAssert<*, T>