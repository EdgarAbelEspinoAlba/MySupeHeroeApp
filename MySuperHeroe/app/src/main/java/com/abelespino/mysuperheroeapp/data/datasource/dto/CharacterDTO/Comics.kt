package com.abelespino.mysuperheroeapp.data.datasource.dto.CharacterDTO

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)