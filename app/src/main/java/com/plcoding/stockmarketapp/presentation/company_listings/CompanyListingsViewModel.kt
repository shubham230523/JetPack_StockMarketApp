package com.plcoding.stockmarketapp.presentation.company_listings

import androidx.lifecycle.ViewModel
import com.plcoding.stockmarketapp.domain.repository.StockRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CompanyListingsViewModel @Inject constructor(
    private val repository : StockRepository
) : ViewModel(){

}