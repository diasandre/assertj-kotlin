package dev.diasandre.assertions

import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage
import org.assertj.core.data.Percentage.withPercentage

infix fun <T : Number> T.byLessThan(value: T): Pair<T, Offset<T>> = this to Offset.strictOffset(value)

infix fun <T : Number> T.withinPercentage(value: T): Pair<T, Percentage> = this to withPercentage(value.toDouble())