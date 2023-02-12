package dev.diasandre.assertions

import org.assertj.core.data.Offset
import org.assertj.core.data.Percentage
import org.assertj.core.data.Percentage.withPercentage
import java.nio.charset.Charset

infix fun <T : Number> T.byLessThan(value: T): Pair<T, Offset<T>> = this to Offset.strictOffset(value)

infix fun <T : Number> T.withinPercentage(value: T): Pair<T, Percentage> = this to withPercentage(value.toDouble())

infix fun <T> T.usingCharset(value: Charset): Pair<T, Charset> = this to value