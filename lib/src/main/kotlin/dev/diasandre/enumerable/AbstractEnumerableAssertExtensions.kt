package dev.diasandre.enumerable // ktlint-disable filename

import org.assertj.core.api.AbstractEnumerableAssert

private typealias AbstractEnumerable<ACTUAL, ELEMENT> = AbstractEnumerableAssert<*, ACTUAL, ELEMENT>

infix fun <ACTUAL, ELEMENT> AbstractEnumerable<ACTUAL, ELEMENT>.hasSameSizeAs(other: Any): AbstractEnumerable<ACTUAL, ELEMENT> = hasSameSizeAs(other) as AbstractEnumerable<ACTUAL, ELEMENT>