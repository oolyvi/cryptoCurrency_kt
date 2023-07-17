package com.urahimli.cryptocurrencypl.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.urahimli.cryptocurrencypl.domain.model.Coin

//bunu api'den aliriq, diger Coin data class'ni ise ozumuz isledirik
// dto -> data transfer object
data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val is_active: Boolean,
    @SerializedName("is_new")
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

//dto'nu model'deki Coin data class'a beraberleyir kimi
//convert CoinDto to Coin
fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        is_active = is_active,
        name = name,
        rank = rank,
        symbol = symbol
    )
}