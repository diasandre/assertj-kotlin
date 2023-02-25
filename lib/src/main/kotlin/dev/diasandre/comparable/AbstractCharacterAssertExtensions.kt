package dev.diasandre.comparable

import org.assertj.core.api.AbstractCharacterAssert

infix fun AbstractCharacterAssert<*>.isEqualTo(expected: Char): AbstractCharacterAssert<*> = isEqualTo(expected)
infix fun AbstractCharacterAssert<*>.isNotEqualTo(other: Char): AbstractCharacterAssert<*> = isNotEqualTo(other)
infix fun AbstractCharacterAssert<*>.isLessThan(other: Char): AbstractCharacterAssert<*> = isLessThan(other)
infix fun AbstractCharacterAssert<*>.isLessThanOrEqualTo(other: Char): AbstractCharacterAssert<*> = isLessThanOrEqualTo(other)
infix fun AbstractCharacterAssert<*>.isGreaterThan(other: Char): AbstractCharacterAssert<*> = isGreaterThan(other)
infix fun AbstractCharacterAssert<*>.isGreaterThanOrEqualTo(expected: Char): AbstractCharacterAssert<*> = isGreaterThanOrEqualTo(expected)