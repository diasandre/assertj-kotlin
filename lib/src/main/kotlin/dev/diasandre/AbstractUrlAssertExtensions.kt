package dev.diasandre

import org.assertj.core.api.AbstractUrlAssert
import java.net.URL

infix fun AbstractUrlAssert<*>.hasProtocol(expected: String?): AbstractUrlAssert<*> = hasProtocol(expected)
infix fun AbstractUrlAssert<*>.hasPath(expected: String): AbstractUrlAssert<*> = hasPath(expected)
infix fun AbstractUrlAssert<*>.hasPort(expected: Int): AbstractUrlAssert<*> = hasPort(expected)
infix fun AbstractUrlAssert<*>.hasHost(expected: String?): AbstractUrlAssert<*> = hasHost(expected)
infix fun AbstractUrlAssert<*>.hasAuthority(expected: String?): AbstractUrlAssert<*> = hasAuthority(expected)
infix fun AbstractUrlAssert<*>.hasQuery(expected: String?): AbstractUrlAssert<*> = hasQuery(expected)
infix fun AbstractUrlAssert<*>.hasAnchor(expected: String?): AbstractUrlAssert<*> = hasAnchor(expected)
infix fun AbstractUrlAssert<*>.hasUserInfo(expected: String?): AbstractUrlAssert<*> = hasUserInfo(expected)
infix fun AbstractUrlAssert<*>.hasParameter(name: String?): AbstractUrlAssert<*> = hasParameter(name)
infix fun AbstractUrlAssert<*>.hasNoParameter(name: String?): AbstractUrlAssert<*> = hasNoParameter(name)
infix fun AbstractUrlAssert<*>.isEqualToWithSortedQueryParameters(expected: URL): AbstractUrlAssert<*> = isEqualToWithSortedQueryParameters(expected)

infix fun AbstractUrlAssert<*>.hasParameter(block: () -> Pair<String, String>): AbstractUrlAssert<*> {
    val (queryParam, value) = block()
    return hasParameter(queryParam, value)
}

infix fun AbstractUrlAssert<*>.hasNoParameter(block: () -> Pair<String, String>): AbstractUrlAssert<*> {
    val (queryParam, value) = block()
    return hasNoParameter(queryParam, value)
}