package dev.diasandre

import org.assertj.core.api.AbstractClassAssert

infix fun AbstractClassAssert<*>.isAssignableTo(other: Class<*>): AbstractClassAssert<*> = isAssignableTo(other)
infix fun AbstractClassAssert<*>.hasAnnotation(other: Class<Annotation>): AbstractClassAssert<*> = hasAnnotation(other)
infix fun AbstractClassAssert<*>.hasSuperclass(superclass: Class<*>): AbstractClassAssert<*> = hasSuperclass(superclass)
infix fun AbstractClassAssert<*>.hasPackage(packageName: String): AbstractClassAssert<*> = hasPackage(packageName)
infix fun AbstractClassAssert<*>.hasPackage(packageName: Package): AbstractClassAssert<*> = hasPackage(packageName)