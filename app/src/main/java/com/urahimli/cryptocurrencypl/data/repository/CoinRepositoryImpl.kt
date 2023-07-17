package com.urahimli.cryptocurrencypl.data.repository

import com.urahimli.cryptocurrencypl.data.remote.CoinPaprikaApi
import com.urahimli.cryptocurrencypl.data.remote.dto.CoinDetailDto
import com.urahimli.cryptocurrencypl.data.remote.dto.CoinDto
import com.urahimli.cryptocurrencypl.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}