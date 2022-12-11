package tn.esprit.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.micro.Entity.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit,Integer> {
}
