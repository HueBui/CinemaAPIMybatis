package com.dts.CinemaAPI.domain.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Director {
    private int iddirector;
    private String namedirector;

    @Id
    @Column(name = "iddirector")
    public int getIddirector() {
        return iddirector;
    }

    public void setIddirector(int iddirector) {
        this.iddirector = iddirector;
    }

    @Basic
    @Column(name = "namedirector")
    public String getNamedirector() {
        return namedirector;
    }

    public void setNamedirector(String namedirector) {
        this.namedirector = namedirector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return iddirector == director.iddirector &&
                Objects.equals(namedirector, director.namedirector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iddirector, namedirector);
    }
}
