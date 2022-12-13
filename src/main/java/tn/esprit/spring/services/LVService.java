package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.LigneVente;

import tn.esprit.spring.repositories.LVRepository;


@Service
public class LVService {
	@Autowired
	private LVRepository LVRepository;
	
	public LigneVente add(LigneVente vente) {
		return LVRepository.save(vente);
	}
	public List<LigneVente> getAll() {

		return LVRepository.findAll();
	}
	
	public LigneVente getById(int id) {
		LigneVente r = LVRepository.findById(id).get();

		return r;
	}
	public String delete(int id) {

		if (LVRepository.findById(id).isPresent()) {
			LVRepository.deleteById(id);
			return "LV supprimé";
		}
		else
			return " LV non supprimé";
	}

	public LigneVente update(int id, LigneVente a) {

		if (LVRepository.findById(id).isPresent()) {
			LigneVente existing = LVRepository.findById(id).get();
			existing.setQuantite(a.getQuantite());
			return LVRepository.save(existing);

		}
		else
			return null;

	}
}
