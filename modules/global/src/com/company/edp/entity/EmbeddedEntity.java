package com.company.edp.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@MetaClass(name = "edp$EmbeddedEntity")
@Embeddable
public class EmbeddedEntity extends EmbeddableEntity {
    private static final long serialVersionUID = 8731727196508058626L;

    @Column(name = "FIRST_ATTR")
    private String firstAttr;

    @Column(name = "SECOND_ATTR")
    private String secondAttr;

    public String getSecondAttr() {
        return secondAttr;
    }

    public void setSecondAttr(String secondAttr) {
        this.secondAttr = secondAttr;
    }

    public String getFirstAttr() {
        return firstAttr;
    }

    public void setFirstAttr(String firstAttr) {
        this.firstAttr = firstAttr;
    }
}