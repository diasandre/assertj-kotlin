@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractOptionalAssert
import org.assertj.core.api.AbstractOptionalDoubleAssert
import org.assertj.core.api.AbstractOptionalIntAssert
import org.assertj.core.api.AbstractOptionalLongAssert
import org.assertj.core.api.Condition
import java.util.function.Consumer

infix fun <VALUE> AbstractOptionalAssert<*, VALUE>.contains(expectedValue: VALUE): AbstractOptionalAssert<*, VALUE> = contains(expectedValue) as AbstractOptionalAssert<*, VALUE>
infix fun <VALUE> AbstractOptionalAssert<*, VALUE>.hasValue(expectedValue: VALUE): AbstractOptionalAssert<*, VALUE> = hasValue(expectedValue) as AbstractOptionalAssert<*, VALUE>
infix fun <VALUE> AbstractOptionalAssert<*, VALUE>.hasValueSatisfying(requirement: Consumer<VALUE>): AbstractOptionalAssert<*, VALUE> = hasValueSatisfying(requirement) as AbstractOptionalAssert<*, VALUE>
infix fun <VALUE> AbstractOptionalAssert<*, VALUE>.hasValueSatisfying(condition: Condition<VALUE>): AbstractOptionalAssert<*, VALUE> = hasValueSatisfying(condition) as AbstractOptionalAssert<*, VALUE>
infix fun <VALUE> AbstractOptionalAssert<*, VALUE>.containsInstanceOf(clazz: Class<*>?): AbstractOptionalAssert<*, VALUE> = containsInstanceOf(clazz) as AbstractOptionalAssert<*, VALUE>
infix fun <VALUE> AbstractOptionalAssert<*, VALUE>.usingValueComparator(customComparator: Comparator<VALUE>?): AbstractOptionalAssert<*, VALUE> = usingValueComparator(customComparator) as AbstractOptionalAssert<*, VALUE>
infix fun <VALUE> AbstractOptionalAssert<*, VALUE>.containsSame(expectedValue: VALUE): AbstractOptionalAssert<*, VALUE> = containsSame(expectedValue) as AbstractOptionalAssert<*, VALUE>

infix fun AbstractOptionalDoubleAssert<*>.hasValue(expectedValue: Double): AbstractOptionalDoubleAssert<*> = hasValue(expectedValue) as AbstractOptionalDoubleAssert<*>

infix fun AbstractOptionalIntAssert<*>.hasValue(expectedValue: Int): AbstractOptionalIntAssert<*> = hasValue(expectedValue) as AbstractOptionalIntAssert<*>

infix fun AbstractOptionalLongAssert<*>.hasValue(expectedValue: Long): AbstractOptionalLongAssert<*> = hasValue(expectedValue) as AbstractOptionalLongAssert<*>