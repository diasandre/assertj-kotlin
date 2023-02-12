@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractCharSequenceAssert
import java.util.regex.Pattern

infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSize(expected: Int): AbstractCharSequenceAssert<*, CharSequence> = hasSize(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSizeLessThan(expected: Int): AbstractCharSequenceAssert<*, CharSequence> = hasSizeLessThan(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSizeLessThanOrEqualTo(expected: Int): AbstractCharSequenceAssert<*, CharSequence> = hasSizeLessThanOrEqualTo(expected) as AbstractCharSequenceAssert<*, CharSequence>
infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSizeGreaterThan(expected: Int): AbstractCharSequenceAssert<*, CharSequence> = hasSizeGreaterThan(expected) as AbstractCharSequenceAssert<*, CharSequence>
infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSizeGreaterThanOrEqualTo(expected: Int): AbstractCharSequenceAssert<*, CharSequence> = hasSizeGreaterThanOrEqualTo(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSizeBetween(block: () -> Pair<Int, Int>): AbstractCharSequenceAssert<*, CharSequence> {
    val (lowerBoundary, higherBoundary) = block()
    return hasSizeBetween(lowerBoundary, higherBoundary) as AbstractCharSequenceAssert<*, CharSequence>
}

infix fun AbstractCharSequenceAssert<*, CharSequence>.hasLineCount(expectedLineCount: Int): AbstractCharSequenceAssert<*, CharSequence> = hasLineCount(expectedLineCount) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSameSizeAs(other: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = hasSameSizeAs(other) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.hasSameSizeAs(other: Any): AbstractCharSequenceAssert<*, CharSequence> = hasSameSizeAs(other) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isEqualToIgnoringCase(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isEqualToIgnoringCase(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isNotEqualToIgnoringCase(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isNotEqualToIgnoringCase(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.containsOnlyOnce(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = containsOnlyOnce(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.contains(values: Iterable<CharSequence>): AbstractCharSequenceAssert<*, CharSequence> = contains(values) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.containsSequence(values: Iterable<CharSequence>): AbstractCharSequenceAssert<*, CharSequence> = containsSequence(values) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.containsSubsequence(values: Iterable<CharSequence>): AbstractCharSequenceAssert<*, CharSequence> = containsSubsequence(values) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.containsIgnoringCase(sequence: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = containsIgnoringCase(sequence) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotContain(values: Iterable<CharSequence>): AbstractCharSequenceAssert<*, CharSequence> = doesNotContain(values) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotContainPattern(pattern: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = doesNotContainPattern(pattern) as AbstractCharSequenceAssert<*, CharSequence>
infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotContainPattern(pattern: Pattern): AbstractCharSequenceAssert<*, CharSequence> = doesNotContainPattern(pattern) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.startsWith(prefix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = startsWith(prefix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.startsWithIgnoringCase(prefix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = startsWithIgnoringCase(prefix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotStartWith(prefix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = doesNotStartWith(prefix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotStartWithIgnoringCase(prefix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = doesNotStartWithIgnoringCase(prefix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.endsWith(suffix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = endsWith(suffix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.endsWithIgnoringCase(suffix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = endsWithIgnoringCase(suffix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotEndWith(suffix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = doesNotEndWith(suffix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotEndWithIgnoringCase(suffix: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = doesNotEndWithIgnoringCase(suffix) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.matches(regex: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = matches(regex) as AbstractCharSequenceAssert<*, CharSequence>
infix fun AbstractCharSequenceAssert<*, CharSequence>.matches(regex: Pattern): AbstractCharSequenceAssert<*, CharSequence> = matches(regex) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotMatch(regex: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = doesNotMatch(regex) as AbstractCharSequenceAssert<*, CharSequence>
infix fun AbstractCharSequenceAssert<*, CharSequence>.doesNotMatch(regex: Pattern): AbstractCharSequenceAssert<*, CharSequence> = doesNotMatch(regex) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isEqualToIgnoringWhitespace(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isEqualToIgnoringWhitespace(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isNotEqualToIgnoringWhitespace(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isNotEqualToIgnoringWhitespace(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isEqualToNormalizingWhitespace(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isEqualToNormalizingWhitespace(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isNotEqualToNormalizingWhitespace(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isNotEqualToNormalizingWhitespace(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isEqualToNormalizingPunctuationAndWhitespace(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isEqualToNormalizingPunctuationAndWhitespace(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isSubstringOf(sequence: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isSubstringOf(sequence) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.containsPattern(regex: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = containsPattern(regex) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.containsPattern(regex: Pattern): AbstractCharSequenceAssert<*, CharSequence> = containsPattern(regex) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isEqualToNormalizingNewlines(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isEqualToNormalizingNewlines(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isEqualToIgnoringNewLines(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isEqualToIgnoringNewLines(expected) as AbstractCharSequenceAssert<*, CharSequence>

infix fun AbstractCharSequenceAssert<*, CharSequence>.isEqualToNormalizingUnicode(expected: CharSequence): AbstractCharSequenceAssert<*, CharSequence> = isEqualToNormalizingUnicode(expected) as AbstractCharSequenceAssert<*, CharSequence>