package com.abelespino.mysuperheroeapp.data.datasource.dto.CharacterDTO

data class Events(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemX>,
    val returned: Int
)