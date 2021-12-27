package com.company.project.web.screens.counteragents;

import com.haulmont.cuba.gui.screen.*;
import com.company.project.entity.spravochniki.Counteragents;

@UiController("project_Counteragents.browse")
@UiDescriptor("counteragents-browse.xml")
@LookupComponent("counteragentsesTable")
@LoadDataBeforeShow
public class CounteragentsBrowse extends StandardLookup<Counteragents> {
}