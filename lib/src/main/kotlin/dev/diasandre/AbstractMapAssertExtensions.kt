@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractMapAssert
import org.assertj.core.api.Condition

typealias MapAssert<K, V> = AbstractMapAssert<*, Map<K, V>, K, V>

infix fun <K, V> MapAssert<K, V>.hasFieldOrProperty(expected: String): MapAssert<K, V> = hasFieldOrProperty(expected) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.allSatisfy(block: (K, V) -> Unit): MapAssert<K, V> = allSatisfy(block) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.anySatisfy(block: (K, V) -> Unit): MapAssert<K, V> = anySatisfy(block) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.noneSatisfy(block: (K, V) -> Unit): MapAssert<K, V> = noneSatisfy(block) as MapAssert<K, V>

infix fun <K, V> MapAssert<K, V>.hasSize(expected: Int): MapAssert<K, V> = hasSize(expected) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasSizeGreaterThan(boundary: Int): MapAssert<K, V> = hasSizeGreaterThan(boundary) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasSizeGreaterThanOrEqualTo(boundary: Int): MapAssert<K, V> = hasSizeGreaterThanOrEqualTo(boundary) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasSizeLessThan(boundary: Int): MapAssert<K, V> = hasSizeLessThan(boundary) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasSizeLessThanOrEqualTo(boundary: Int): MapAssert<K, V> = hasSizeLessThanOrEqualTo(boundary) as MapAssert<K, V>

infix fun <K, V> MapAssert<K, V>.hasSameSizeAs(other: Any): MapAssert<K, V> = hasSameSizeAs(other) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasSameSizeAs(other: Iterable<*>): MapAssert<K, V> = hasSameSizeAs(other) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasSameSizeAs(other: Map<*, *>): MapAssert<K, V> = hasSameSizeAs(other) as MapAssert<K, V>

infix fun <K, V> MapAssert<K, V>.containsAllEntriesOf(other: Map<K, V>): MapAssert<K, V> = containsAllEntriesOf(other) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.containsExactlyEntriesOf(map: Map<K, V>): MapAssert<K, V> = containsExactlyEntriesOf(map) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.containsExactlyInAnyOrderEntriesOf(map: Map<K, V>): MapAssert<K, V> = containsExactlyInAnyOrderEntriesOf(map) as MapAssert<K, V>

infix fun <K, V> MapAssert<K, V>.hasEntrySatisfying(entryCondition: Condition<Map.Entry<K, V>>): MapAssert<K, V> = hasEntrySatisfying(entryCondition) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasKeySatisfying(entryCondition: Condition<K>): MapAssert<K, V> = hasKeySatisfying(entryCondition) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.hasValueSatisfying(entryCondition: Condition<V>): MapAssert<K, V> = hasValueSatisfying(entryCondition) as MapAssert<K, V>

infix fun <K, V> MapAssert<K, V>.containsKey(key: K): MapAssert<K, V> = containsKey(key) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.doesNotContainKey(key: K): MapAssert<K, V> = doesNotContainKey(key) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.containsOnlyKeys(keys: Iterable<K>): MapAssert<K, V> = containsOnlyKeys(keys) as MapAssert<K, V>

infix fun <K, V> MapAssert<K, V>.containsValue(value: V): MapAssert<K, V> = containsValue(value) as MapAssert<K, V>
infix fun <K, V> MapAssert<K, V>.doesNotContainValue(value: V): MapAssert<K, V> = doesNotContainValue(value) as MapAssert<K, V>

infix fun <K, V> MapAssert<K, V>.containsEntry(block: () -> Pair<K, V>): MapAssert<K, V> {
    val (key, value) = block()
    return containsEntry(key, value) as MapAssert<K, V>
}

infix fun <K, V> MapAssert<K, V>.doesNotContainEntry(block: () -> Pair<K, V>): MapAssert<K, V> {
    val (key, value) = block()
    return doesNotContainEntry(key, value) as MapAssert<K, V>
}

infix fun <K, V> MapAssert<K, V>.hasSizeBetween(block: () -> Pair<Int, Int>): MapAssert<K, V> {
    val (start, end) = block()
    return hasSizeBetween(start, end) as MapAssert<K, V>
}