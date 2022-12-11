package tn.esprit.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.micro.Entity.Categorie;
@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
