package org.project.data.services;

import java.util.Set;

import org.project.data.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastname);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();

}
