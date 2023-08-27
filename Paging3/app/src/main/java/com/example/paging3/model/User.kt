package com.example.paging3.model

import androidx.room.Embedded
import kotlinx.serialization.SerialName

@Serializable
data class User(
    @SerialName("links")
    @Embedded
    val userLinks: UserLinks,
    val username: String
)
