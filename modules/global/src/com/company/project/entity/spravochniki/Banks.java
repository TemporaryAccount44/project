package com.company.project.entity.spravochniki;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PROJECT_BANKS")
@Entity(name = "project_Banks")
@NamePattern("%s|name")
public class Banks extends StandardEntity {
    private static final long serialVersionUID = -3576898089597466517L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "JURADDRESS")
    private String juraddress;

    @Column(name = "REQUISITES", unique = true)
    private Integer requisites;

    public Integer getRequisites() {
        return requisites;
    }

    public void setRequisites(Integer requisites) {
        this.requisites = requisites;
    }

    public String getJuraddress() {
        return juraddress;
    }

    public void setJuraddress(String juraddress) {
        this.juraddress = juraddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}