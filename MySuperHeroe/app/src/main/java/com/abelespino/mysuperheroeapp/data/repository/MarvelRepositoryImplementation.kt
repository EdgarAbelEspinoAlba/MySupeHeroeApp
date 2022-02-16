package com.abelespino.mysuperheroeapp.data.repository

import com.abelespino.mysuperheroeapp.data.datasource.dto.CharacterDTO.CharacterDTO
import com.abelespino.mysuperheroeapp.data.datasource.dto.CharactersDTO.CharactersDTO
import com.abelespino.mysuperheroeapp.data.datasource.MarvelApi
import com.abelespino.mysuperheroeapp.domain.repository.MarvelRepository
import javax.inject.Inject

class MarvelRepositoryImplementation @Inject constructor(
    private val api : MarvelApi
) : MarvelRepository {
    override suspend fun getAllCharacters(offset:Int): CharactersDTO {
        return api.getAllCharacters(offset=offset.toString())
    }

    override suspend fun getAllSearchedCharacters(search: String): CharactersDTO {
        return api.getAllSearchedCharacters(search=search)
    }

    override suspend fun getCharacterById(id: String): CharacterDTO {
        return api.getCharacterById(id)
    }
}