package com.urahimli.cryptocurrencypl.presentation.coin_list

import com.urahimli.cryptocurrencypl.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
