package dev.diasandre.comparable

import org.assertj.core.api.AbstractUriAssert

infix fun AbstractUriAssert<*>.hasPath(expected: String): AbstractUriAssert<*> = hasPath(expected)

infix fun AbstractUriAssert<*>.hasPort(expected: Int): AbstractUriAssert<*> = hasPort(expected)

infix fun AbstractUriAssert<*>.hasHost(expected: String): AbstractUriAssert<*> = hasHost(expected)

infix fun AbstractUriAssert<*>.hasAuthority(expected: String): AbstractUriAssert<*> = hasAuthority(expected)

infix fun AbstractUriAssert<*>.hasFragment(expected: String): AbstractUriAssert<*> = hasFragment(expected)

infix fun AbstractUriAssert<*>.hasQuery(expected: String): AbstractUriAssert<*> = hasQuery(expected)

infix fun AbstractUriAssert<*>.hasScheme(expected: String): AbstractUriAssert<*> = hasScheme(expected)

infix fun AbstractUriAssert<*>.hasUserInfo(expected: String): AbstractUriAssert<*> = hasUserInfo(expected)

infix fun AbstractUriAssert<*>.hasParameter(name: String): AbstractUriAssert<*> = hasParameter(name)

infix fun AbstractUriAssert<*>.hasParameter(block: () -> Pair<String, String>): AbstractUriAssert<*> {
    val (queryParam, value) = block()
    return hasParameter(queryParam, value)
}

infix fun AbstractUriAssert<*>.hasNoParameter(name: String): AbstractUriAssert<*> = hasNoParameter(name)

infix fun AbstractUriAssert<*>.hasNoParameter(block: () -> Pair<String, String>): AbstractUriAssert<*> {
    val (queryParam, value) = block()
    return hasNoParameter(queryParam, value)
}