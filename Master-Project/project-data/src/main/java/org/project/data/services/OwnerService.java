package org.project.data.services;

import java.util.Set;

import org.project.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastname);
	

}
