package de.cegeka.sfgpetclinic.services;

import de.cegeka.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
