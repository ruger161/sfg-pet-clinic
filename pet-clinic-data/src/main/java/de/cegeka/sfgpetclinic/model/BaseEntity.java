package de.cegeka.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    //TODO HINT #1: Recommendation of Hibernate to use Box Types
    // Because Box-Types can be null, where primites cannot
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
