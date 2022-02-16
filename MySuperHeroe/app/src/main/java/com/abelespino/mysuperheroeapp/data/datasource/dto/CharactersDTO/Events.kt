package com.abelespino.mysuperheroeapp.data.datasource.dto.CharactersDTO

data class Events(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemX>,
    val returned: Int
)