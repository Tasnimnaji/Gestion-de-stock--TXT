package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Vente;
import tn.esprit.spring.repositories.VenteRepository;

@Service
public class VenteService {
	@Autowired
	private VenteRepository venteRepository;
	
	public Vente addV(Vente vente) {
		return venteRepository.save(vente);
	}
	public List<Vente> getAllventes() {

		return venteRepository.findAll();
	}
	
	public Vente getById(int id) {
		Vente r = venteRepository.findById(id).get();

		return r;
	}
	public String delete(int id) {

		if (venteRepository.findById(id).isPresent()) {
			venteRepository.deleteById(id);
			return "Vente supprimé";
		}
		else
			return " Vente non supprimé";
	}

	public Vente update(int id, Vente a) {

		if (venteRepository.findById(id).isPresent()) {
			Vente existing = venteRepository.findById(id).get();
			existing.setCodeAbarre(a.getCodeAbarre());
			return venteRepository.save(existing);

		}
		else
			return null;

	}
}
