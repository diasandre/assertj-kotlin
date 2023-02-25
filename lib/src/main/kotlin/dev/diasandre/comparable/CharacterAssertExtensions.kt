package dev.diasandre.comparable

import org.assertj.core.api.CharacterAssert

infix fun CharacterAssert.isEqualTo(expected: Char): CharacterAssert = isEqualTo(expected)
infix fun CharacterAssert.isNotEqualTo(other: Char): CharacterAssert = isNotEqualTo(other)
infix fun CharacterAssert.isLessThan(other: Char): CharacterAssert = isLessThan(other)
infix fun CharacterAssert.isLessThanOrEqualTo(other: Char): CharacterAssert = isLessThanOrEqualTo(other)
infix fun CharacterAssert.isGreaterThan(other: Char): CharacterAssert = isGreaterThan(other)
infix fun CharacterAssert.isGreaterThanOrEqualTo(expected: Char): CharacterAssert = isGreaterThanOrEqualTo(expected)