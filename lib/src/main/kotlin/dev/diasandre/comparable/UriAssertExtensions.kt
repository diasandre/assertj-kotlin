package dev.diasandre.comparable

import org.assertj.core.api.UriAssert

infix fun UriAssert.hasPath(expected: String?): UriAssert = hasPath(expected)
infix fun UriAssert.hasPort(expected: Int): UriAssert = hasPort(expected)
infix fun UriAssert.hasHost(expected: String): UriAssert = hasHost(expected)
infix fun UriAssert.hasAuthority(expected: String?): UriAssert = hasAuthority(expected)
infix fun UriAssert.hasFragment(expected: String?): UriAssert = hasFragment(expected)
infix fun UriAssert.hasQuery(expected: String?): UriAssert = hasQuery(expected)
infix fun UriAssert.hasScheme(expected: String?): UriAssert = hasScheme(expected)
infix fun UriAssert.hasUserInfo(expected: String?): UriAssert = hasUserInfo(expected)
infix fun UriAssert.hasParameter(name: String?): UriAssert = hasParameter(name)
infix fun UriAssert.hasNoParameter(name: String?): UriAssert = hasNoParameter(name)

infix fun UriAssert.hasParameter(block: () -> Pair<String, String>): UriAssert {
    val (queryParam, value) = block()
    return hasParameter(queryParam, value)
}

infix fun UriAssert.hasNoParameter(block: () -> Pair<String, String>): UriAssert {
    val (queryParam, value) = block()
    return hasNoParameter(queryParam, value)
}