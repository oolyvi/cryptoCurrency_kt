package com.urahimli.cryptocurrencypl.domain.repository

import com.urahimli.cryptocurrencypl.data.remote.dto.CoinDetailDto
import com.urahimli.cryptocurrencypl.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}
