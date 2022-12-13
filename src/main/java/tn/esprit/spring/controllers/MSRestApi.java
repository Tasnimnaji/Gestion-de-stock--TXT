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

import tn.esprit.spring.entities.MouvementStock;
import tn.esprit.spring.services.MSService;

@RequestMapping("/MS")
@RestController
public class MSRestApi {
	@Autowired
	MSService MSService;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<MouvementStock> create(@RequestBody MouvementStock a) {

		return new ResponseEntity<>(MSService.add(a), HttpStatus.OK);
	}
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<MouvementStock>> getArticles() {

		return new ResponseEntity<>(MSService.getAll(), HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MouvementStock> getById(@PathVariable(value = "id") int id) {

		return new ResponseEntity<>(MSService.getById(id), HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	@ResponseStatus(HttpStatus.OK)
	public MouvementStock update(@PathVariable(value = "id") int id, @RequestBody MouvementStock a) {

		return MSService.update(id, a);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> delete(@PathVariable(value = "id") int id) {

		return new ResponseEntity<String>(MSService.delete(id), HttpStatus.OK);
	}
}
