package org.segnities007.blog.data.model

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlinx.serialization.Serializable

data class Page(
    @Serializable
    val pageID: Int = 0,
    @Serializable
    val title: String = "",
    @Serializable
    val description: String = "",
    @Serializable
    val createAt: LocalDate =
        Clock.System
            .now()
            .toLocalDateTime(TimeZone.UTC)
            .date,
    @Serializable
    val updateAt: LocalDate =
        Clock.System
            .now()
            .toLocalDateTime(TimeZone.UTC)
            .date,
)

object FakePage {
    val fakePage =
        Page(
            pageID = 1,
            title = "ramen",
            description = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
        )
}
