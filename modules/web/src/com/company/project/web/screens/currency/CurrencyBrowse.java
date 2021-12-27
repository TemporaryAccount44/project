package com.company.project.web.screens.currency;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.Currency;

@UiController("project_Currency.browse")
@UiDescriptor("currency-browse.xml")
@LookupComponent("currenciesTable")
@LoadDataBeforeShow
public class CurrencyBrowse extends StandardLookup<Currency> {
}