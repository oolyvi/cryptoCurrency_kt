package com.urahimli.cryptocurrencypl.domain.use_case.get_coin

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import com.urahimli.cryptocurrencypl.common.Resource
import com.urahimli.cryptocurrencypl.data.remote.dto.toCoin
import com.urahimli.cryptocurrencypl.data.remote.dto.toCoinDetail
import com.urahimli.cryptocurrencypl.domain.model.Coin
import com.urahimli.cryptocurrencypl.domain.model.CoinDetail
import com.urahimli.cryptocurrencypl.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occured!"))
        } catch (e: IOException) {
            emit(Resource.Error<CoinDetail>("Couldn't reach server. Check your internet connection!"))
        }
    }
}