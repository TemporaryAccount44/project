package com.company.project.web.screens.banks;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.Banks;

@UiController("project_Banks.edit")
@UiDescriptor("banks-edit.xml")
@EditedEntityContainer("banksDc")
@LoadDataBeforeShow
public class BanksEdit extends StandardEditor<Banks> {
}