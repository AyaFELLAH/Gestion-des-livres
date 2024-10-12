package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Livre;
import com.example.demo.service.LivreService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/livres")
public class LivreControler {
	@Autowired
	private LivreService livreService;

	public LivreControler(LivreService livreService) {
		super();
		this.livreService = livreService;
	}

	@PostMapping
	public ResponseEntity<Livre> saveLivre(@RequestBody Livre livre) {
		return new ResponseEntity<Livre>(livreService.saveLivre(livre), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Livre> getAllLivres() {
		return livreService.getAllLivre();

	}

	@PutMapping("{id}")
	public Livre updateLivre(@PathVariable("id") UUID id, @RequestBody Livre livre) {
		livre.setId(id);
		return livreService.updateLivre(livre);

	}

	@DeleteMapping("{id}")
	public List<Livre> deleteLivre(@PathVariable("id") UUID id) {
		livreService.deleteLivre(id);
		return livreService.getAllLivre();

	}

//	// rechercher un livre
//	@GetMapping("/Rechercher")
//	// http://localhost:8080/api/v1/livres/Rechercher?query=Aya
//	public ResponseEntity<List<Livre>> searchClients(@RequestParam("query") String query) {
//		return new ResponseEnt
//}
}