package com.dts.CinemaAPI.domain.entities;

import org.apache.ibatis.annotations.Mapper;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Actor {
    private int idactor;
    private String nameactor;

    @Id
    @Column(name = "idactor")
    public int getIdactor() {
        return idactor;
    }

    public void setIdactor(int idactor) {
        this.idactor = idactor;
    }

    @Basic
    @Column(name = "nameactor")
    public String getNameactor() {
        return nameactor;
    }

    public void setNameactor(String nameactor) {
        this.nameactor = nameactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return idactor == actor.idactor &&
                Objects.equals(nameactor, actor.nameactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idactor, nameactor);
    }
}
