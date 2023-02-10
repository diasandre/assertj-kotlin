package dev.diasandre.comparable

import org.assertj.core.api.AbstractPathAssert
import java.nio.charset.Charset
import java.nio.file.FileSystem
import java.nio.file.Path
import java.security.MessageDigest
import java.util.function.Predicate

infix fun AbstractPathAssert<*>.hasSameTextualContentAs(expected: Path): AbstractPathAssert<*> = hasSameTextualContentAs(expected)

infix fun AbstractPathAssert<*>.hasSameTextualContentAs(block: () -> Pair<Path, Charset>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasSameTextualContentAs(path, charset)
}

infix fun AbstractPathAssert<*>.hasBinaryContent(expected: ByteArray): AbstractPathAssert<*> = hasBinaryContent(expected)

infix fun AbstractPathAssert<*>.hasSameBinaryContentAs(expected: Path): AbstractPathAssert<*> = hasSameBinaryContentAs(expected)

infix fun AbstractPathAssert<*>.usingCharset(charset: Charset): AbstractPathAssert<*> = usingCharset(charset)

infix fun AbstractPathAssert<*>.usingCharset(charset: String): AbstractPathAssert<*> = usingCharset(charset)

infix fun AbstractPathAssert<*>.hasContent(expected: String): AbstractPathAssert<*> = hasContent(expected)

infix fun AbstractPathAssert<*>.hasFileSystem(expected: FileSystem): AbstractPathAssert<*> = hasFileSystem(expected)

infix fun AbstractPathAssert<*>.hasSameFileSystemAs(expected: Path): AbstractPathAssert<*> = hasSameFileSystemAs(expected)

infix fun AbstractPathAssert<*>.hasFileName(filename: String): AbstractPathAssert<*> = hasFileName(filename)

infix fun AbstractPathAssert<*>.hasParent(expected: Path): AbstractPathAssert<*> = hasParent(expected)

infix fun AbstractPathAssert<*>.hasParentRaw(expected: Path): AbstractPathAssert<*> = hasParentRaw(expected)

infix fun AbstractPathAssert<*>.hasSize(expectedSize: Long): AbstractPathAssert<*> = hasSize(expectedSize)

infix fun AbstractPathAssert<*>.startsWith(other: Path): AbstractPathAssert<*> = startsWith(other)

infix fun AbstractPathAssert<*>.startsWithRaw(other: Path): AbstractPathAssert<*> = startsWithRaw(other)

infix fun AbstractPathAssert<*>.endsWith(other: Path): AbstractPathAssert<*> = endsWith(other)

infix fun AbstractPathAssert<*>.endsWithRaw(other: Path): AbstractPathAssert<*> = endsWithRaw(other)

@JvmName("hasDigestMessageDigestByteArray")
infix fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<MessageDigest, ByteArray>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

@JvmName("hasDigestMessageDigestString")
infix fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<MessageDigest, String>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

@JvmName("hasDigestStringByteArray")
infix fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<String, ByteArray>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

@JvmName("hasDigestStringString")
infix fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<String, String>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

infix fun AbstractPathAssert<*>.isDirectoryContaining(filter: Predicate<Path>): AbstractPathAssert<*> = isDirectoryContaining(filter)

infix fun AbstractPathAssert<*>.isDirectoryContaining(syntaxAndPattern: String): AbstractPathAssert<*> = isDirectoryContaining(syntaxAndPattern)

infix fun AbstractPathAssert<*>.isDirectoryRecursivelyContaining(syntaxAndPattern: String): AbstractPathAssert<*> = isDirectoryRecursivelyContaining(syntaxAndPattern)

infix fun AbstractPathAssert<*>.isDirectoryRecursivelyContaining(filter: Predicate<Path>): AbstractPathAssert<*> = isDirectoryRecursivelyContaining(filter)

infix fun AbstractPathAssert<*>.isDirectoryNotContaining(filter: Predicate<Path>): AbstractPathAssert<*> = isDirectoryNotContaining(filter)

infix fun AbstractPathAssert<*>.isDirectoryNotContaining(syntaxAndPattern: String): AbstractPathAssert<*> = isDirectoryNotContaining(syntaxAndPattern)

infix fun AbstractPathAssert<*>.hasExtension(expectedExtension: String): AbstractPathAssert<*> = hasExtension(expectedExtension)