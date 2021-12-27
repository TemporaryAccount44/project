package com.company.project.service;

import com.company.project.entity.spravochniki.CurrencyExchange;
import com.haulmont.cuba.core.global.DataManager;
import org.graalvm.compiler.hotspot.stubs.DivisionByZeroExceptionStub;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(CurrencyExchangeService.NAME)
public class CurrencyExchangeServiceBean implements CurrencyExchangeService {

    @Inject
    private DataManager dataManager;

    @Override
    public CurrencyExchange currencyExchangeCheck(CurrencyExchange firstCurrency, CurrencyExchange secondCurrency) {
        Long check = dataManager.loadValue("check if currency exchange ratio is repeated", Long.class).parameter("first currency", firstCurrency).parameter("second currency", secondCurrency).one();
        if (check > 1){
            throw new RuntimeException();//вызывает исключение если запись повторяется
        }
        return null;
    }
}