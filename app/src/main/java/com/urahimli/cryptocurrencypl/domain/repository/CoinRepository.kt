package com.urahimli.cryptocurrencypl.domain.repository

import com.urahimli.cryptocurrencypl.data.remote.dto.CoinDetailDto
import com.urahimli.cryptocurrencypl.data.remote.dto.CoinDto

//test sohbetlerinde istifade ucun diger repository'den istifade olunur
//bu fake kimidir, cox da onem dasimir
interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}