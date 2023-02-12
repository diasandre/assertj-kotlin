package dev.diasandre

import org.assertj.core.api.AbstractDateAssert
import java.text.DateFormat
import java.time.Instant
import java.util.Date

infix fun AbstractDateAssert<*>.isEqualTo(dateAsString: String): AbstractDateAssert<*> = isEqualTo(dateAsString)

infix fun AbstractDateAssert<*>.isEqualTo(instant: Instant): AbstractDateAssert<*> = isEqualTo(instant)

infix fun AbstractDateAssert<*>.isEqualToIgnoringHours(dateAsString: String): AbstractDateAssert<*> = isEqualToIgnoringHours(dateAsString)

infix fun AbstractDateAssert<*>.isEqualToIgnoringHours(instant: Instant): AbstractDateAssert<*> = isEqualToIgnoringHours(instant)

infix fun AbstractDateAssert<*>.isEqualToIgnoringHours(date: Date): AbstractDateAssert<*> = isEqualToIgnoringHours(date)

infix fun AbstractDateAssert<*>.isEqualToIgnoringMinutes(dateAsString: String): AbstractDateAssert<*> = isEqualToIgnoringMinutes(dateAsString)

infix fun AbstractDateAssert<*>.isEqualToIgnoringMinutes(instant: Instant): AbstractDateAssert<*> = isEqualToIgnoringMinutes(instant)

infix fun AbstractDateAssert<*>.isEqualToIgnoringMinutes(date: Date): AbstractDateAssert<*> = isEqualToIgnoringMinutes(date)

infix fun AbstractDateAssert<*>.isEqualToIgnoringSeconds(dateAsString: String): AbstractDateAssert<*> = isEqualToIgnoringSeconds(dateAsString)

infix fun AbstractDateAssert<*>.isEqualToIgnoringSeconds(instant: Instant): AbstractDateAssert<*> = isEqualToIgnoringSeconds(instant)

infix fun AbstractDateAssert<*>.isEqualToIgnoringSeconds(date: Date): AbstractDateAssert<*> = isEqualToIgnoringSeconds(date)

infix fun AbstractDateAssert<*>.isEqualToIgnoringMillis(dateAsString: String): AbstractDateAssert<*> = isEqualToIgnoringMillis(dateAsString)

infix fun AbstractDateAssert<*>.isEqualToIgnoringMillis(instant: Instant): AbstractDateAssert<*> = isEqualToIgnoringMillis(instant)

infix fun AbstractDateAssert<*>.isEqualToIgnoringMillis(date: Date): AbstractDateAssert<*> = isEqualToIgnoringMillis(date)

infix fun AbstractDateAssert<*>.isNotEqualTo(dateAsString: String): AbstractDateAssert<*> = isNotEqualTo(dateAsString)

infix fun AbstractDateAssert<*>.isNotEqualTo(instant: Instant): AbstractDateAssert<*> = isNotEqualTo(instant)

infix fun AbstractDateAssert<*>.isInWithStringDateCollection(datesAsString: Collection<String>): AbstractDateAssert<*> = isInWithStringDateCollection(datesAsString)

infix fun AbstractDateAssert<*>.isNotInWithStringDateCollection(datesAsString: Collection<String>): AbstractDateAssert<*> = isNotInWithStringDateCollection(datesAsString)

infix fun AbstractDateAssert<*>.isBefore(other: Date): AbstractDateAssert<*> = isBefore(other)

infix fun AbstractDateAssert<*>.isBefore(other: Instant): AbstractDateAssert<*> = isBefore(other)

infix fun AbstractDateAssert<*>.isBefore(dateAsString: String): AbstractDateAssert<*> = isBefore(dateAsString)

infix fun AbstractDateAssert<*>.isBeforeOrEqualTo(other: Date): AbstractDateAssert<*> = isBeforeOrEqualTo(other)

infix fun AbstractDateAssert<*>.isBeforeOrEqualTo(other: Instant): AbstractDateAssert<*> = isBeforeOrEqualTo(other)

infix fun AbstractDateAssert<*>.isBeforeOrEqualTo(dateAsString: String): AbstractDateAssert<*> = isBeforeOrEqualTo(dateAsString)

infix fun AbstractDateAssert<*>.isAfter(other: Date): AbstractDateAssert<*> = isAfter(other)

infix fun AbstractDateAssert<*>.isAfter(other: Instant): AbstractDateAssert<*> = isAfter(other)

infix fun AbstractDateAssert<*>.isAfter(dateAsString: String): AbstractDateAssert<*> = isAfter(dateAsString)

infix fun AbstractDateAssert<*>.isAfterOrEqualTo(other: Date): AbstractDateAssert<*> = isAfterOrEqualTo(other)

infix fun AbstractDateAssert<*>.isAfterOrEqualTo(other: Instant): AbstractDateAssert<*> = isAfterOrEqualTo(other)

infix fun AbstractDateAssert<*>.isAfterOrEqualTo(dateAsString: String): AbstractDateAssert<*> = isAfterOrEqualTo(dateAsString)

// @JvmName("abstractDateIsBetweenDate")
// infix fun AbstractDateAssert<*>.isBetween(block: () -> Pair<Date, Date>): AbstractDateAssert<*> {
//    val (start, end) = block()
//    return isBetween(start, end)
// }
//
// @JvmName("abstractDateIsBetweenString")
// infix fun AbstractDateAssert<*>.isBetween(block: () -> Pair<String, String>): AbstractDateAssert<*> {
//    val (start, end) = block()
//    return isBetween(start, end)
// }
//
// @JvmName("abstractDateIsBetweenInstant")
// infix fun AbstractDateAssert<*>.isBetween(block: () -> Pair<Instant, Instant>): AbstractDateAssert<*> {
//    val (start, end) = block()
//    return isBetween(start, end)
// }
//
// @JvmName("abstractDateIsNotBetweenDate")
// infix fun AbstractDateAssert<*>.isNotBetween(block: () -> Pair<Date, Date>): AbstractDateAssert<*> {
//    val (start, end) = block()
//    return isNotBetween(start, end)
// }
//
// @JvmName("abstractDateIsNotBetweenString")
// infix fun AbstractDateAssert<*>.isNotBetween(block: () -> Pair<String, String>): AbstractDateAssert<*> {
//    val (start, end) = block()
//    return isNotBetween(start, end)
// }
//
// @JvmName("abstractDateIsNotBetweenInstant")
// infix fun AbstractDateAssert<*>.isNotBetween(block: () -> Pair<Instant, Instant>): AbstractDateAssert<*> {
//    val (start, end) = block()
//    return isNotBetween(start, end)
// }

infix fun AbstractDateAssert<*>.isBeforeYear(year: Int): AbstractDateAssert<*> = isBeforeYear(year)

infix fun AbstractDateAssert<*>.isAfterYear(year: Int): AbstractDateAssert<*> = isAfterYear(year)

infix fun AbstractDateAssert<*>.hasYear(year: Int): AbstractDateAssert<*> = hasYear(year)

infix fun AbstractDateAssert<*>.hasMonth(month: Int): AbstractDateAssert<*> = hasMonth(month)

infix fun AbstractDateAssert<*>.hasDayOfMonth(dayOfMonth: Int): AbstractDateAssert<*> = hasDayOfMonth(dayOfMonth)

infix fun AbstractDateAssert<*>.hasDayOfWeek(dayOfWeek: Int): AbstractDateAssert<*> = hasDayOfWeek(dayOfWeek)

infix fun AbstractDateAssert<*>.hasHourOfDay(hourOfDay: Int): AbstractDateAssert<*> = hasHourOfDay(hourOfDay)

infix fun AbstractDateAssert<*>.hasMinute(minute: Int): AbstractDateAssert<*> = hasMinute(minute)

infix fun AbstractDateAssert<*>.hasSecond(second: Int): AbstractDateAssert<*> = hasSecond(second)

infix fun AbstractDateAssert<*>.hasMillisecond(millisecond: Int): AbstractDateAssert<*> = hasMillisecond(millisecond)

infix fun AbstractDateAssert<*>.isInSameYearAs(other: Date): AbstractDateAssert<*> = isInSameYearAs(other)

infix fun AbstractDateAssert<*>.isInSameYearAs(other: Instant): AbstractDateAssert<*> = isInSameYearAs(other)

infix fun AbstractDateAssert<*>.isInSameYearAs(dateAsString: String): AbstractDateAssert<*> = isInSameYearAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameMonthAs(other: Date): AbstractDateAssert<*> = isInSameMonthAs(other)

infix fun AbstractDateAssert<*>.isInSameMonthAs(other: Instant): AbstractDateAssert<*> = isInSameMonthAs(other)

infix fun AbstractDateAssert<*>.isInSameMonthAs(dateAsString: String): AbstractDateAssert<*> = isInSameMonthAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameDayAs(other: Date): AbstractDateAssert<*> = isInSameDayAs(other)

infix fun AbstractDateAssert<*>.isInSameDayAs(other: Instant): AbstractDateAssert<*> = isInSameDayAs(other)

infix fun AbstractDateAssert<*>.isInSameDayAs(dateAsString: String): AbstractDateAssert<*> = isInSameDayAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameHourWindowAs(other: Date): AbstractDateAssert<*> = isInSameHourWindowAs(other)

infix fun AbstractDateAssert<*>.isInSameHourWindowAs(other: Instant): AbstractDateAssert<*> = isInSameHourWindowAs(other)

infix fun AbstractDateAssert<*>.isInSameHourWindowAs(dateAsString: String): AbstractDateAssert<*> = isInSameHourWindowAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameHourAs(other: Date): AbstractDateAssert<*> = isInSameHourAs(other)

infix fun AbstractDateAssert<*>.isInSameHourAs(dateAsString: String): AbstractDateAssert<*> = isInSameHourAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameMinuteWindowAs(other: Date): AbstractDateAssert<*> = isInSameMinuteWindowAs(other)

infix fun AbstractDateAssert<*>.isInSameMinuteWindowAs(dateAsString: String): AbstractDateAssert<*> = isInSameMinuteWindowAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameMinuteWindowAs(other: Instant): AbstractDateAssert<*> = isInSameMinuteWindowAs(other)

infix fun AbstractDateAssert<*>.isInSameMinuteAs(other: Date): AbstractDateAssert<*> = isInSameMinuteAs(other)

infix fun AbstractDateAssert<*>.isInSameMinuteAs(dateAsString: String): AbstractDateAssert<*> = isInSameMinuteAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameSecondWindowAs(other: Date): AbstractDateAssert<*> = isInSameSecondWindowAs(other)

infix fun AbstractDateAssert<*>.isInSameSecondWindowAs(dateAsString: String): AbstractDateAssert<*> = isInSameSecondWindowAs(dateAsString)

infix fun AbstractDateAssert<*>.isInSameSecondWindowAs(other: Instant): AbstractDateAssert<*> = isInSameSecondWindowAs(other)

infix fun AbstractDateAssert<*>.isInSameSecondAs(other: Date): AbstractDateAssert<*> = isInSameSecondAs(other)

infix fun AbstractDateAssert<*>.isInSameSecondAs(dateAsString: String): AbstractDateAssert<*> = isInSameSecondAs(dateAsString)

// @JvmName("abstractDateIsCloseToDate")
// infix fun AbstractDateAssert<*>.isCloseTo(block: () -> Pair<Date, Long>): AbstractDateAssert<*> {
//    val (other, deltaInMilliseconds) = block()
//    return isCloseTo(other, deltaInMilliseconds)
// }
//
// @JvmName("abstractDateIsCloseToInstant")
// infix fun AbstractDateAssert<*>.isCloseTo(block: () -> Pair<Instant, Long>): AbstractDateAssert<*> {
//    val (other, deltaInMilliseconds) = block()
//    return isCloseTo(other, deltaInMilliseconds)
// }
//
// @JvmName("abstractDateIsCloseToString")
// infix fun AbstractDateAssert<*>.isCloseTo(block: () -> Pair<String, Long>): AbstractDateAssert<*> {
//    val (other, deltaInMilliseconds) = block()
//    return isCloseTo(other, deltaInMilliseconds)
// }
//
// fun main() {
//    assertThat(Date()) isCloseTo {
//        ("" to 1L) as Pair<String, Long>
//    }
// }

infix fun AbstractDateAssert<*>.hasTime(timestamp: Long): AbstractDateAssert<*> = hasTime(timestamp)

infix fun AbstractDateAssert<*>.hasSameTimeAs(date: Date): AbstractDateAssert<*> = hasSameTimeAs(date)

infix fun AbstractDateAssert<*>.hasSameTimeAs(dateAsString: String): AbstractDateAssert<*> = hasSameTimeAs(dateAsString)

infix fun AbstractDateAssert<*>.withDateFormat(format: DateFormat): AbstractDateAssert<*> = withDateFormat(format)

infix fun AbstractDateAssert<*>.withDateFormat(userCustomDateFormatPattern: String): AbstractDateAssert<*> = withDateFormat(userCustomDateFormatPattern)