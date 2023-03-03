package com.example.quote

import androidx.lifecycle.LiveData

class QuoteRepository(private  val quoteDao: QuoteDao) {
    fun  getQuote():LiveData<List<Quote>>{
        return quoteDao.getQuotes()
    }
    suspend fun insertQuote(quote: Quote){
        quoteDao.insertQuote(quote)
    }
}