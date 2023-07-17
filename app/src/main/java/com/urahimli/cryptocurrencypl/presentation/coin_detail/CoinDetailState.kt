package com.urahimli.cryptocurrencypl.presentation.coin_detail

import com.urahimli.cryptocurrencypl.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
