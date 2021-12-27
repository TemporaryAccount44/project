package com.company.project.web.screens.banks;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.Banks;

@UiController("project_Banks.browse")
@UiDescriptor("banks-browse.xml")
@LookupComponent("banksesTable")
@LoadDataBeforeShow
public class BanksBrowse extends StandardLookup<Banks> {
}