package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.Vente;

public interface VenteRepository extends JpaRepository<Vente, Integer> {

}
