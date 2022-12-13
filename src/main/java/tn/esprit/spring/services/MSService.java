package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.MouvementStock;
import tn.esprit.spring.repositories.MSRepository;

@Service
public class MSService {
	@Autowired
	private MSRepository MSRepository;
	
	public MouvementStock add(MouvementStock vente) {
		return MSRepository.save(vente);
	}
	public List<MouvementStock> getAll() {

		return MSRepository.findAll();
	}
	
	public MouvementStock getById(int id) {
		MouvementStock r = MSRepository.findById(id).get();

		return r;
	}
	public String delete(int id) {

		if (MSRepository.findById(id).isPresent()) {
			MSRepository.deleteById(id);
			return "LV supprimé";
		}
		else
			return " LV non supprimé";
	}

	public MouvementStock update(int id, MouvementStock a) {

		if (MSRepository.findById(id).isPresent()) {
			MouvementStock existing = MSRepository.findById(id).get();
			existing.setPeriode(a.getPeriode());
			return MSRepository.save(existing);

		}
		else
			return null;

	}
}
