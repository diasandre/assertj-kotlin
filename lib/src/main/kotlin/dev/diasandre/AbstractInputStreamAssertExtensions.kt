@file:Suppress("UNCHECKED_CAST")

package dev.diasandre

import org.assertj.core.api.AbstractInputStreamAssert
import java.io.InputStream

infix fun <T : InputStream> AbstractInputStreamAssert<*, T>.hasSameContentAs(expected: InputStream): AbstractInputStreamAssert<*, T> = hasSameContentAs(expected) as AbstractInputStreamAssert<*, T>
infix fun <T : InputStream> AbstractInputStreamAssert<*, T>.hasContent(expected: String): AbstractInputStreamAssert<*, T> = hasContent(expected) as AbstractInputStreamAssert<*, T>
infix fun <T : InputStream> AbstractInputStreamAssert<*, T>.hasBinaryContent(expected: ByteArray): AbstractInputStreamAssert<*, T> = hasBinaryContent(expected) as AbstractInputStreamAssert<*, T>

// @JvmName("abstractInputStreamHasDigestMessageDigestByteArray")
// infix fun <T : InputStream> AbstractInputStreamAssert<*, T>.hasDigest(block: () -> Pair<MessageDigest, ByteArray>): AbstractInputStreamAssert<*, T> {
//    val (messageDigest, expected) = block()
//    return hasDigest(messageDigest, expected) as AbstractInputStreamAssert<*, T>
// }
//
// @JvmName("abstractInputStreamHasDigestMessageDigestString")
// infix fun <T : InputStream> AbstractInputStreamAssert<*, T>.hasDigest(block: () -> Pair<MessageDigest, String>): AbstractInputStreamAssert<*, T> {
//    val (messageDigest, expected) = block()
//    return hasDigest(messageDigest, expected) as AbstractInputStreamAssert<*, T>
// }
//
// @JvmName("abstractInputStreamHasDigestStringByteArray")
// infix fun <T : InputStream> AbstractInputStreamAssert<*, T>.hasDigest(block: () -> Pair<String, ByteArray>): AbstractInputStreamAssert<*, T> {
//    val (algorithm, expected) = block()
//    return hasDigest(algorithm, expected) as AbstractInputStreamAssert<*, T>
// }
//
// @JvmName("abstractInputStreamHasDigestStringString")
// infix fun <T : InputStream> AbstractInputStreamAssert<*, T>.hasDigest(block: () -> Pair<String, String>): AbstractInputStreamAssert<*, T> {
//    val (algorithm, expected) = block()
//    return hasDigest(algorithm, expected) as AbstractInputStreamAssert<*, T>
// }