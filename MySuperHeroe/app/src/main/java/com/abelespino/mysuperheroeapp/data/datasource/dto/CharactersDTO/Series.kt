package com.abelespino.mysuperheroeapp.data.datasource.dto.CharactersDTO

data class Series(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemXX>,
    val returned: Int
)