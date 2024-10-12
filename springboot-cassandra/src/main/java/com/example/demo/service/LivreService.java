package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import com.example.demo.model.Livre;

public interface LivreService {
	Livre saveLivre(Livre livre);

	List<Livre> getAllLivre();

	// Livre getLivreById(int id);
	Livre updateLivre(Livre livre);

	void deleteLivre(UUID id);

	List<Livre> RechercherLivre(String query);
}
