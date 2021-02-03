package com.company.edp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;

import javax.persistence.*;

@Table(name = "EDP_FIRST_MAIN")
@Entity(name = "edp$FirstMain")
public class FirstMain extends StandardEntity {
    private static final long serialVersionUID = -3594302041588248245L;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
            @AttributeOverride(name = "firstAttr", column = @Column(name = "EMBEDDED_ENTITY_FIRST_ATTR")),
            @AttributeOverride(name = "secondAttr", column = @Column(name = "EMBEDDED_ENTITY_SECOND_ATTR"))
    })
    private EmbeddedEntity embeddedEntity;

    public EmbeddedEntity getEmbeddedEntity() {
        return embeddedEntity;
    }

    public void setEmbeddedEntity(EmbeddedEntity embeddedEntity) {
        this.embeddedEntity = embeddedEntity;
    }
}