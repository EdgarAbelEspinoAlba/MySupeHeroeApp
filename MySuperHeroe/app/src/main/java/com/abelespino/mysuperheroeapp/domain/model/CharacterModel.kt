package com.abelespino.mysuperheroeapp.domain.model

data class CharacterModel(
    val id : Int,
    val name : String,
    val description : String,
    val thumbnail : String,
    val thumbnailExt: String,
    val urlImage: String,
    val comics : List<String>,
)