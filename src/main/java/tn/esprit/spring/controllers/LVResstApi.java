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

import tn.esprit.spring.entities.LigneVente;
import tn.esprit.spring.entities.Vente;
import tn.esprit.spring.services.LVService;
import tn.esprit.spring.services.VenteService;

@RequestMapping("/LV")
@RestController
public class LVResstApi {
	@Autowired
	LVService LVService;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<LigneVente> create(@RequestBody LigneVente a) {

		return new ResponseEntity<>(LVService.add(a), HttpStatus.OK);
	}
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<LigneVente>> getArticles() {

		return new ResponseEntity<>(LVService.getAll(), HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<LigneVente> getById(@PathVariable(value = "id") int id) {

		return new ResponseEntity<>(LVService.getById(id), HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	@ResponseStatus(HttpStatus.OK)
	public LigneVente update(@PathVariable(value = "id") int id, @RequestBody LigneVente a) {

		return LVService.update(id, a);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> delete(@PathVariable(value = "id") int id) {

		return new ResponseEntity<String>(LVService.delete(id), HttpStatus.OK);
	}
}
