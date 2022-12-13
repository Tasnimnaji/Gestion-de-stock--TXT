package tn.esprit.spring.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entities.Vente;

import tn.esprit.spring.services.VenteService;

@RequestMapping("/Vente")
@RestController
public class VenteRestApi {
	@Autowired
	VenteService VenteService;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Vente> create(@RequestBody Vente a) {

		return new ResponseEntity<>(VenteService.addV(a), HttpStatus.OK);
	}
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Vente>> getArticles() {

		return new ResponseEntity<>(VenteService.getAllventes(), HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Vente> getById(@PathVariable(value = "id") int id) {

		return new ResponseEntity<>(VenteService.getById(id), HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Vente update(@PathVariable(value = "id") int id, @RequestBody Vente a) {

		return VenteService.update(id, a);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> delete(@PathVariable(value = "id") int id) {

		return new ResponseEntity<String>(VenteService.delete(id), HttpStatus.OK);
	}
}
