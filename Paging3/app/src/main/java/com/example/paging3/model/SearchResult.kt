package com.example.paging3.model

import kotlinx.serialization.SerialName

@Serializable
data class SearchResult(
    @SerialName("results")
    val images: List<UnsplashImage>,
)