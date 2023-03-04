@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractThrowableAssert
import java.util.regex.Pattern

infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessage(message: String?): AbstractThrowableAssert<*, ACTUAL> = hasMessage(message) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasCause(cause: Throwable): AbstractThrowableAssert<*, ACTUAL> = hasCause(cause) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasCauseReference(expected: Throwable): AbstractThrowableAssert<*, ACTUAL> = hasCauseReference(expected) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessageStartingWith(description: String?): AbstractThrowableAssert<*, ACTUAL> = hasMessageStartingWith(description) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessageContaining(description: String?): AbstractThrowableAssert<*, ACTUAL> = hasMessageContaining(description) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessageNotContaining(description: String?): AbstractThrowableAssert<*, ACTUAL> = hasMessageNotContaining(description) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasStackTraceContaining(description: String?): AbstractThrowableAssert<*, ACTUAL> = hasStackTraceContaining(description) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessageMatching(description: String): AbstractThrowableAssert<*, ACTUAL> = hasMessageMatching(description) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessageMatching(regex: Pattern): AbstractThrowableAssert<*, ACTUAL> = hasMessageMatching(regex) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessageFindingMatch(regex: String): AbstractThrowableAssert<*, ACTUAL> = hasMessageFindingMatch(regex) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasMessageEndingWith(description: String?): AbstractThrowableAssert<*, ACTUAL> = hasMessageEndingWith(description) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasCauseInstanceOf(type: Class<Throwable>): AbstractThrowableAssert<*, ACTUAL> = hasCauseInstanceOf(type) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasCauseExactlyInstanceOf(type: Class<Throwable>): AbstractThrowableAssert<*, ACTUAL> = hasCauseExactlyInstanceOf(type) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasRootCauseInstanceOf(type: Class<Throwable>): AbstractThrowableAssert<*, ACTUAL> = hasRootCauseInstanceOf(type) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasRootCauseExactlyInstanceOf(type: Class<Throwable>): AbstractThrowableAssert<*, ACTUAL> = hasRootCauseExactlyInstanceOf(type) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasRootCause(cause: Throwable?): AbstractThrowableAssert<*, ACTUAL> = hasRootCause(cause) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasRootCauseMessage(message: String?): AbstractThrowableAssert<*, ACTUAL> = hasRootCauseMessage(message) as AbstractThrowableAssert<*, ACTUAL>
infix fun <ACTUAL : Throwable> AbstractThrowableAssert<*, ACTUAL>.hasSuppressedException(suppressedException: Throwable): AbstractThrowableAssert<*, ACTUAL> = hasSuppressedException(suppressedException) as AbstractThrowableAssert<*, ACTUAL>