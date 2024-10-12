package com.example.demo.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Livre;
import com.example.demo.repository.LivreRepository;
import com.example.demo.service.LivreService;

@Service
public class LivreServiceImlp implements LivreService {

	@Autowired // permet d'injecter LivreRepository
	private LivreRepository livreRepository;

	public LivreServiceImlp(LivreRepository livreRepository) {
		super();
		this.livreRepository = livreRepository;
	}

	public Livre saveLivre(Livre livre) {
		// TODO Auto-generated method stub
		return livreRepository.save(livre);
	}

	public List<Livre> getAllLivre() {
		// TODO Auto-generated method stub
		return livreRepository.findAll();
	}

	@Override
	public Livre updateLivre(Livre livre) {
		// TODO Auto-generated method stub
		return livreRepository.save(livre); // contient l id
	}

	public void deleteLivre(UUID id) {
		// TODO Auto-generated method stub
		livreRepository.deleteById(id);
	}

	@Override
	public List<Livre> RechercherLivre(String query) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Livre> RechercherLivre(String query) {
//		List<Livre> clients = livreRepository.RechercherLivre(query);
//		return clients;
//	}

}
