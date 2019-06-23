package org.project.data.services;

import java.util.Set;

import org.project.data.model.Owner;
import org.project.data.model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();

}
