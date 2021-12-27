package com.company.project.web.screens.currency;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.Currency;

@UiController("project_Currency.edit")
@UiDescriptor("currency-edit.xml")
@EditedEntityContainer("currencyDc")
@LoadDataBeforeShow
public class CurrencyEdit extends StandardEditor<Currency> {
}