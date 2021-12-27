package com.company.project.entity.spravochniki;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "PROJECT_CURRENCY_EXCHANGE")
@Entity(name = "project_CurrencyExchange")
public class CurrencyExchange extends StandardEntity {
    private static final long serialVersionUID = 1111451570533023056L;

    @JoinColumn(name = "FIRST_CURRENCY_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Currency firstCurrency;

    @Column(name = "COST_OF_FIRST_CURRENCY", nullable = false)
    @NotNull
    private Integer costOfFirstCurrency;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SECOND_CURRENCY_ID")
    @NotNull
    private Currency secondCurrency;

    @Column(name = "COST_OF_SECOND_CURRENCY", nullable = false)
    @NotNull
    private Integer costOfSecondCurrency;

    public void setFirstCurrency(Currency firstCurrency) {
        this.firstCurrency = firstCurrency;
    }

    public Currency getFirstCurrency() {
        return firstCurrency;
    }

    public Currency getSecondCurrency() {
        return secondCurrency;
    }

    public void setSecondCurrency(Currency secondCurrency) {
        this.secondCurrency = secondCurrency;
    }

    public void setCostOfFirstCurrency(Integer costOfFirstCurrency) {
        this.costOfFirstCurrency = costOfFirstCurrency;
    }

    public Integer getCostOfFirstCurrency() {
        return costOfFirstCurrency;
    }

    public void setCostOfSecondCurrency(Integer costOfSecondCurrency) {
        this.costOfSecondCurrency = costOfSecondCurrency;
    }

    public Integer getCostOfSecondCurrency() {
        return costOfSecondCurrency;
    }

}