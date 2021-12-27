package com.company.project.web.screens.counteragents;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.Counteragents;

@UiController("project_Counteragents.edit")
@UiDescriptor("counteragents-edit.xml")
@EditedEntityContainer("counteragentsDc")
@LoadDataBeforeShow
public class CounteragentsEdit extends StandardEditor<Counteragents> {
}