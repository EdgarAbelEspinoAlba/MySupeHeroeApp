package com.abelespino.mysuperheroeapp.domain.repository

import com.abelespino.mysuperheroeapp.data.datasource.dto.CharacterDTO.CharacterDTO
import com.abelespino.mysuperheroeapp.data.datasource.dto.CharactersDTO.CharactersDTO

interface MarvelRepository {
    suspend fun getAllCharacters(offset:Int): CharactersDTO
    suspend fun getAllSearchedCharacters(search:String):CharactersDTO
    suspend fun getCharacterById(id:String): CharacterDTO
}