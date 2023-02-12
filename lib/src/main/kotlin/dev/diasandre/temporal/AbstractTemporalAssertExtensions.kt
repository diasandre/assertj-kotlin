@file:Suppress("UNCHECKED_CAST")

package dev.diasandre.temporal

// @JvmName("abstractTemporalIsCloseToTemporal")
// infix fun <T : Temporal> AbstractTemporalAssert<*, T>.isCloseTo(block: () -> Pair<T, TemporalOffset<T>>): AbstractTemporalAssert<*, T> {
//    val (temporal, offset) = block()
//    return isCloseTo(temporal, offset) as AbstractTemporalAssert<*, T>
// }
//
// @JvmName("abstractTemporalIsCloseToString")
// infix fun <T : Temporal> AbstractTemporalAssert<*, T>.isCloseTo(block: () -> Pair<String, TemporalOffset<T>>): AbstractTemporalAssert<*, T> {
//    val (temporal, offset) = block()
//    return isCloseTo(temporal, offset) as AbstractTemporalAssert<*, T>
// }