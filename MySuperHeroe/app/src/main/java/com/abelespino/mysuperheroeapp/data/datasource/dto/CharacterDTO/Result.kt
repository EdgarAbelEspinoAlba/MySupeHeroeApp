package com.abelespino.mysuperheroeapp.data.datasource.dto.CharacterDTO

import com.abelespino.mysuperheroeapp.domain.model.CharacterModel

data class Result(
    val comics: Comics,
    val description: String,
    val events: Events,
    val id: Int,
    val modified: String,
    val name: String,
    val resourceURI: String,
    val series: Series,
    val stories: Stories,
    val thumbnail: Thumbnail,
    val urls: List<Url>
){
    fun toCharacter():CharacterModel{
        return CharacterModel(
            id=id,
            name=name,
            description=description,
            thumbnail = thumbnail.path,
            thumbnailExt=thumbnail.extension,
            urlImage= "${thumbnail.path}.${thumbnail.extension}",
            comics = comics.items.map {
                it.name
            }
        )
    }
}