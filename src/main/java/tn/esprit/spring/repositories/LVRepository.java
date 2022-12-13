package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.LigneVente;

public interface LVRepository extends JpaRepository<LigneVente, Integer>{

}
