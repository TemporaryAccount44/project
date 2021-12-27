package com.company.project.entity.spravochniki;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "PROJECT_CURRENCY")
@Entity(name = "project_Currency")
@NamePattern("%s|name")
public class Currency extends StandardEntity {
    private static final long serialVersionUID = -1108698192280458671L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "SHORTNAME", unique = true)
    private String shortname;

    @NotNull
    @Column(name = "CODE", nullable = false, unique = true)
    private Integer code;

    @JoinColumn(name = "CURRENCY_EXCHANGE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CurrencyExchange currencyExchange;

    public CurrencyExchange getCurrencyExchange() {
        return currencyExchange;
    }

    public void setCurrencyExchange(CurrencyExchange currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}