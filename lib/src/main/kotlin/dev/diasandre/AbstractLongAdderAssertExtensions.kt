package dev.diasandre

import org.assertj.core.api.AbstractLongAdderAssert

infix fun AbstractLongAdderAssert<*>.hasValue(expected: Long): AbstractLongAdderAssert<*> = hasValue(expected)
infix fun AbstractLongAdderAssert<*>.doesNotHaveValue(unexpected: Long): AbstractLongAdderAssert<*> = doesNotHaveValue(unexpected)