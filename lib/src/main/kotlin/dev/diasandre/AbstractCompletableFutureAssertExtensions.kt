@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractCompletableFutureAssert
import java.util.function.Predicate

infix fun <T> AbstractCompletableFutureAssert<*, T>.isCompletedWithValue(expected: T): AbstractCompletableFutureAssert<*, T> = isCompletedWithValue(expected) as AbstractCompletableFutureAssert<*, T>

infix fun <T> AbstractCompletableFutureAssert<*, T>.isCompletedWithValueMatching(predicate: Predicate<T>): AbstractCompletableFutureAssert<*, T> = isCompletedWithValueMatching(predicate) as AbstractCompletableFutureAssert<*, T>