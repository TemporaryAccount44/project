package com.company.project.web.screens.currencyexchange;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.CurrencyExchange;

@UiController("project_CurrencyExchange.edit")
@UiDescriptor("currency-exchange-edit.xml")
@EditedEntityContainer("currencyExchangeDc")
@LoadDataBeforeShow
public class CurrencyExchangeEdit extends StandardEditor<CurrencyExchange> {
}