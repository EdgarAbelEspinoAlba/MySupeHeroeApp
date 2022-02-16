package com.abelespino.mysuperheroeapp.ui.Character

import com.abelespino.mysuperheroeapp.domain.model.CharacterModel

data class CharacterState(
    val isLoading : Boolean = false,
    val characterDetail : List<CharacterModel> = emptyList(),
    val error : String = ""
)