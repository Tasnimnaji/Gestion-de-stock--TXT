package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.MouvementStock;

public interface MSRepository extends JpaRepository<MouvementStock, Integer>{

}
