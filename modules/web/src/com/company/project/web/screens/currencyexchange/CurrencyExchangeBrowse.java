package com.company.project.web.screens.currencyexchange;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.CurrencyExchange;

@UiController("project_CurrencyExchange.browse")
@UiDescriptor("currency-exchange-browse.xml")
@LookupComponent("currencyExchangesTable")
@LoadDataBeforeShow
public class CurrencyExchangeBrowse extends StandardLookup<CurrencyExchange> {
    @Install(to = "currencyExchangesTable.create", subject = "afterCommitHandler")
    private void currencyExchangesTableCreateAfterCommitHandler(CurrencyExchange currencyExchange) {
        
    }
}