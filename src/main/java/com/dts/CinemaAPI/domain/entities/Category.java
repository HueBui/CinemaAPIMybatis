package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Category {
    private int idcategory;
    private String type;

    @Id
    @Column(name = "idcategory")
    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return idcategory == category.idcategory &&
                Objects.equals(type, category.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcategory, type);
    }
}
