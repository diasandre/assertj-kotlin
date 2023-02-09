package dev.diasandre.comparable

import org.assertj.core.api.AbstractPathAssert
import java.nio.charset.Charset
import java.nio.file.FileSystem
import java.nio.file.Path
import java.security.MessageDigest
import java.util.function.Predicate

fun AbstractPathAssert<*>.hasSameTextualContentAs(expected: Path): AbstractPathAssert<*> = hasSameTextualContentAs(expected)

fun AbstractPathAssert<*>.hasSameTextualContentAs(block: () -> Pair<Path, Charset>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasSameTextualContentAs(path, charset)
}

fun AbstractPathAssert<*>.hasBinaryContent(expected: ByteArray): AbstractPathAssert<*> = hasBinaryContent(expected)

fun AbstractPathAssert<*>.hasSameBinaryContentAs(expected: Path): AbstractPathAssert<*> = hasSameBinaryContentAs(expected)

fun AbstractPathAssert<*>.usingCharset(charset: Charset): AbstractPathAssert<*> = usingCharset(charset)

fun AbstractPathAssert<*>.usingCharset(charset: String): AbstractPathAssert<*> = usingCharset(charset)

fun AbstractPathAssert<*>.hasContent(expected: String): AbstractPathAssert<*> = hasContent(expected)

fun AbstractPathAssert<*>.hasFileSystem(expected: FileSystem): AbstractPathAssert<*> = hasFileSystem(expected)

fun AbstractPathAssert<*>.hasSameFileSystemAs(expected: Path): AbstractPathAssert<*> = hasSameFileSystemAs(expected)

fun AbstractPathAssert<*>.hasFileName(filename: String): AbstractPathAssert<*> = hasFileName(filename)

fun AbstractPathAssert<*>.hasParent(expected: Path): AbstractPathAssert<*> = hasParent(expected)

fun AbstractPathAssert<*>.hasParentRaw(expected: Path): AbstractPathAssert<*> = hasParentRaw(expected)

fun AbstractPathAssert<*>.hasSize(expectedSize: Long): AbstractPathAssert<*> = hasSize(expectedSize)

fun AbstractPathAssert<*>.startsWith(other: Path): AbstractPathAssert<*> = startsWith(other)

fun AbstractPathAssert<*>.startsWithRaw(other: Path): AbstractPathAssert<*> = startsWithRaw(other)

fun AbstractPathAssert<*>.endsWith(other: Path): AbstractPathAssert<*> = endsWith(other)

fun AbstractPathAssert<*>.endsWithRaw(other: Path): AbstractPathAssert<*> = endsWithRaw(other)

fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<MessageDigest, ByteArray>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<MessageDigest, String>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<String, ByteArray>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

fun AbstractPathAssert<*>.hasDigest(block: () -> Pair<String, String>): AbstractPathAssert<*> {
    val (path, charset) = block()
    return hasDigest(path, charset)
}

fun AbstractPathAssert<*>.isDirectoryContaining(filter: Predicate<Path>): AbstractPathAssert<*> = isDirectoryContaining(filter)

fun AbstractPathAssert<*>.isDirectoryContaining(syntaxAndPattern: String): AbstractPathAssert<*> = isDirectoryContaining(syntaxAndPattern)

fun AbstractPathAssert<*>.isDirectoryRecursivelyContaining(syntaxAndPattern: String): AbstractPathAssert<*> = isDirectoryRecursivelyContaining(syntaxAndPattern)

fun AbstractPathAssert<*>.isDirectoryRecursivelyContaining(filter: Predicate<Path>): AbstractPathAssert<*> = isDirectoryRecursivelyContaining(filter)

fun AbstractPathAssert<*>.isDirectoryNotContaining(filter: Predicate<Path>): AbstractPathAssert<*> = isDirectoryNotContaining(filter)

fun AbstractPathAssert<*>.isDirectoryNotContaining(syntaxAndPattern: String): AbstractPathAssert<*> = isDirectoryNotContaining(syntaxAndPattern)

fun AbstractPathAssert<*>.hasExtension(expectedExtension: String): AbstractPathAssert<*> = hasExtension(expectedExtension)