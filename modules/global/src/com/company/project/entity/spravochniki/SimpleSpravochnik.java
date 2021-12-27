package com.company.project.entity.spravochniki;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PROJECT_SIMPLE_SPRAVOCHNIK")
@Entity(name = "project_SimpleSpravochnik")
@NamePattern("%s|name")
public class SimpleSpravochnik extends StandardEntity {
    private static final long serialVersionUID = 8696121503636027159L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CODE", unique = true)
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}