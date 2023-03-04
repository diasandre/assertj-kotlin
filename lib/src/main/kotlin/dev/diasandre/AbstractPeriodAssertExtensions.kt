package dev.diasandre

import org.assertj.core.api.AbstractPeriodAssert

infix fun AbstractPeriodAssert<*>.hasYears(expectedYears: Int): AbstractPeriodAssert<*> = hasYears(expectedYears)
infix fun AbstractPeriodAssert<*>.hasMonths(expectedMonths: Int): AbstractPeriodAssert<*> = hasMonths(expectedMonths)
infix fun AbstractPeriodAssert<*>.hasDays(expectedDays: Int): AbstractPeriodAssert<*> = hasDays(expectedDays)