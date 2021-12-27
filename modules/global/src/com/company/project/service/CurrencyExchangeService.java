package com.company.project.service;

import com.company.project.entity.spravochniki.CurrencyExchange;

public interface CurrencyExchangeService {
    String NAME = "project_CurrencyExchangeService";

    CurrencyExchange currencyExchangeCheck(CurrencyExchange firstCurrency, CurrencyExchange secondCurrency);
}