package dev.diasandre.comparable

import org.assertj.core.api.PathAssert
import java.nio.charset.Charset
import java.nio.file.FileSystem
import java.nio.file.Path
import java.util.function.Predicate

infix fun PathAssert.hasSameTextualContentAs(expected: Path): PathAssert = hasSameTextualContentAs(expected)
infix fun PathAssert.hasBinaryContent(expected: ByteArray): PathAssert = hasBinaryContent(expected)
infix fun PathAssert.hasSameBinaryContentAs(expected: Path): PathAssert = hasSameBinaryContentAs(expected)
infix fun PathAssert.usingCharset(charset: Charset): PathAssert = usingCharset(charset)
infix fun PathAssert.usingCharset(charset: String): PathAssert = usingCharset(charset)
infix fun PathAssert.hasContent(expected: String): PathAssert = hasContent(expected)
infix fun PathAssert.hasFileSystem(expected: FileSystem): PathAssert = hasFileSystem(expected)
infix fun PathAssert.hasSameFileSystemAs(expected: Path): PathAssert = hasSameFileSystemAs(expected)
infix fun PathAssert.hasFileName(filename: String): PathAssert = hasFileName(filename)
infix fun PathAssert.hasParent(expected: Path): PathAssert = hasParent(expected)
infix fun PathAssert.hasParentRaw(expected: Path): PathAssert = hasParentRaw(expected)
infix fun PathAssert.hasSize(expectedSize: Long): PathAssert = hasSize(expectedSize)
infix fun PathAssert.startsWith(other: Path): PathAssert = startsWith(other)
infix fun PathAssert.startsWithRaw(other: Path): PathAssert = startsWithRaw(other)
infix fun PathAssert.endsWith(other: Path): PathAssert = endsWith(other)
infix fun PathAssert.endsWithRaw(other: Path): PathAssert = endsWithRaw(other)
infix fun PathAssert.isDirectoryContaining(filter: Predicate<Path>): PathAssert = isDirectoryContaining(filter)
infix fun PathAssert.isDirectoryContaining(syntaxAndPattern: String): PathAssert = isDirectoryContaining(syntaxAndPattern)
infix fun PathAssert.isDirectoryRecursivelyContaining(syntaxAndPattern: String): PathAssert = isDirectoryRecursivelyContaining(syntaxAndPattern)
infix fun PathAssert.isDirectoryRecursivelyContaining(filter: Predicate<Path>): PathAssert = isDirectoryRecursivelyContaining(filter)
infix fun PathAssert.isDirectoryNotContaining(filter: Predicate<Path>): PathAssert = isDirectoryNotContaining(filter)
infix fun PathAssert.isDirectoryNotContaining(syntaxAndPattern: String): PathAssert = isDirectoryNotContaining(syntaxAndPattern)
infix fun PathAssert.hasExtension(expectedExtension: String): PathAssert = hasExtension(expectedExtension)

infix fun PathAssert.hasSameTextualContentAs(block: () -> Pair<Path, Charset>): PathAssert {
    val (path, charset) = block()
    return hasSameTextualContentAs(path, charset)
}