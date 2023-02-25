package dev.diasandre

import org.assertj.core.api.AbstractFileAssert
import java.io.File
import java.nio.charset.Charset
import java.util.function.Predicate

infix fun AbstractFileAssert<*>.hasSameTextualContentAs(expected: File): AbstractFileAssert<*> = hasSameTextualContentAs(expected)
infix fun AbstractFileAssert<*>.hasSameBinaryContentAs(expected: File): AbstractFileAssert<*> = hasSameBinaryContentAs(expected)

/**
 * Example:
 * assertThat(File("/home")) hasSameTextualContentAs { File("/home") usingCharset Charsets.US_ASCII }
 */
infix fun AbstractFileAssert<*>.hasSameTextualContentAs(block: () -> Pair<File, Charset>): AbstractFileAssert<*> {
    val (file, charset) = block()
    return hasSameTextualContentAs(file, charset)
}

infix fun AbstractFileAssert<*>.hasBinaryContent(expected: ByteArray): AbstractFileAssert<*> = hasBinaryContent(expected)
infix fun AbstractFileAssert<*>.hasSize(expectedSizeInBytes: Long): AbstractFileAssert<*> = hasSize(expectedSizeInBytes)
infix fun AbstractFileAssert<*>.usingCharset(charsetName: String): AbstractFileAssert<*> = usingCharset(charsetName)
infix fun AbstractFileAssert<*>.usingCharset(charsetName: Charset): AbstractFileAssert<*> = usingCharset(charsetName)
infix fun AbstractFileAssert<*>.hasContent(expected: String): AbstractFileAssert<*> = hasContent(expected)
infix fun AbstractFileAssert<*>.hasParent(expected: File): AbstractFileAssert<*> = hasParent(expected)
infix fun AbstractFileAssert<*>.hasParent(expected: String): AbstractFileAssert<*> = hasParent(expected)
infix fun AbstractFileAssert<*>.hasExtension(expected: String): AbstractFileAssert<*> = hasExtension(expected)
infix fun AbstractFileAssert<*>.hasName(expected: String): AbstractFileAssert<*> = hasName(expected)
infix fun AbstractFileAssert<*>.hasFileName(expected: String): AbstractFileAssert<*> = hasFileName(expected)
infix fun AbstractFileAssert<*>.isDirectoryContaining(filter: Predicate<File>): AbstractFileAssert<*> = isDirectoryContaining(filter)
infix fun AbstractFileAssert<*>.isDirectoryContaining(syntaxAndPattern: String): AbstractFileAssert<*> = isDirectoryContaining(syntaxAndPattern)
infix fun AbstractFileAssert<*>.isDirectoryRecursivelyContaining(syntaxAndPattern: String): AbstractFileAssert<*> = isDirectoryRecursivelyContaining(syntaxAndPattern)
infix fun AbstractFileAssert<*>.isDirectoryRecursivelyContaining(filter: Predicate<File>): AbstractFileAssert<*> = isDirectoryRecursivelyContaining(filter)
infix fun AbstractFileAssert<*>.isDirectoryNotContaining(filter: Predicate<File>): AbstractFileAssert<*> = isDirectoryNotContaining(filter)
infix fun AbstractFileAssert<*>.isDirectoryNotContaining(syntaxAndPattern: String): AbstractFileAssert<*> = isDirectoryNotContaining(syntaxAndPattern)

// @JvmName("abstractFileHasDigestMessageDigestByteArray")
// infix fun AbstractFileAssert<*>.hasDigest(block: () -> Pair<MessageDigest, ByteArray>): AbstractFileAssert<*> {
//    val (file, charset) = block()
//    return hasDigest(file, charset)
// }
//
// @JvmName("abstractFileHasDigestMessageDigestString")
// infix fun AbstractFileAssert<*>.hasDigest(block: () -> Pair<MessageDigest, String>): AbstractFileAssert<*> {
//    val (file, charset) = block()
//    return hasDigest(file, charset)
// }
//
// @JvmName("abstractFileHasDigestStringByteArray")
// infix fun AbstractFileAssert<*>.hasDigest(block: () -> Pair<String, ByteArray>): AbstractFileAssert<*> {
//    val (file, charset) = block()
//    return hasDigest(file, charset)
// }
//
// @JvmName("abstractFileHasDigestStringString")
// infix fun AbstractFileAssert<*>.hasDigest(block: () -> Pair<String, String>): AbstractFileAssert<*> {
//    val (file, charset) = block()
//    return hasDigest(file, charset)
// }