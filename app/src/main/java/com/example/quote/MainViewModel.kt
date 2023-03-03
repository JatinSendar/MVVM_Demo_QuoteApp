package com.example.quote

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private var quoteRepository: QuoteRepository): ViewModel() {

    fun  getQuotes() : LiveData<List<Quote>>{
        return quoteRepository.getQuote()
    }

    fun  insertQuote(quote: Quote){
        viewModelScope.launch(Dispatchers.IO){
            quoteRepository.insertQuote(quote)
        }
    }
}