package com.abelespino.mysuperheroeapp.ui.CharacterList

import com.abelespino.mysuperheroeapp.domain.model.CharacterModel

data class MarvelListState(
    val isLoading : Boolean = false,
    val charactersList : List<CharacterModel> = emptyList(),
    val error : String = ""
)