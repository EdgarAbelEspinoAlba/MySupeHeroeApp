package com.abelespino.mysuperheroeapp.data.datasource.dto.CharactersDTO

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)