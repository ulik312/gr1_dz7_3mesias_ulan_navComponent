package com.example.gr1_dz7_3mesias_ulan_navcomponent

data class CharacterModel(
    val image: Int,
    val status: String,
    val name: String
) : java.io.Serializable
/*
имплементируем интерфейс Serializable чтобы передавать ее в safeargs
 */