package tn.esprit.micro.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.micro.Entity.Categorie;
import tn.esprit.micro.InterfacesServices.IServiceCategorie;
import tn.esprit.micro.Repository.CategorieRepository;

import java.util.List;

@Service
@Slf4j
public class CategorieService implements IServiceCategorie {
    @Autowired
    CategorieRepository categorieRepository;
    @Override
    public List<Categorie> retrieveAllCategories() {
        List<Categorie> categories=categorieRepository.findAll();
        return categories;
    }

    @Override
    public Categorie updateCategorie(Categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public Categorie addCategorie(Categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public Categorie retrieveCategorie(Integer idCategorie) {
        return categorieRepository.findById(idCategorie).orElse(null);
    }

    @Override
    public void removeCategorie(Integer idCategorie) {
        categorieRepository.deleteById(idCategorie);

    }
}
