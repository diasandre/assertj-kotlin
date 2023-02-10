package dev.diasandre

import org.assertj.core.api.AbstractStringAssert

infix fun AbstractStringAssert<*>.isEqualTo(expected: String): AbstractStringAssert<*> = isEqualTo(expected)

infix fun AbstractStringAssert<*>.isStrictlyBetween(value: Pair<String, String>): AbstractStringAssert<*> = isStrictlyBetween(value.first, value.second)

infix fun AbstractStringAssert<*>.isBetween(value: Pair<String, String>): AbstractStringAssert<*> = isBetween(value.first, value.second)

infix fun AbstractStringAssert<*>.isGreaterThanOrEqualTo(other: String): AbstractStringAssert<*> = isGreaterThanOrEqualTo(other)

infix fun AbstractStringAssert<*>.isGreaterThan(other: String): AbstractStringAssert<*> = isGreaterThan(other)

infix fun AbstractStringAssert<*>.isLessThanOrEqualTo(other: String): AbstractStringAssert<*> = isLessThanOrEqualTo(other)

infix fun AbstractStringAssert<*>.isLessThan(other: String): AbstractStringAssert<*> = isLessThan(other)

fun main() {
    println("a")
}