package org.project.data.services;

import java.util.Set;

import org.project.data.model.Pet;
import org.project.data.model.Vet;

public interface VetService {

	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
