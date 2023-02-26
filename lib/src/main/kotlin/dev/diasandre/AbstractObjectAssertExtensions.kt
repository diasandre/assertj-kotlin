@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractObjectAssert

infix fun <T> AbstractObjectAssert<*, T>.hasFieldOrProperty(expected: String): AbstractObjectAssert<*, T> = hasFieldOrProperty(expected) as AbstractObjectAssert<*, T>

infix fun <T> AbstractObjectAssert<*, T>.hasFieldOrPropertyWithValue(block: () -> Pair<String, Any>): AbstractObjectAssert<*, T> {
    val (name, value) = block()
    return hasFieldOrPropertyWithValue(name, value) as AbstractObjectAssert<*, T>
}