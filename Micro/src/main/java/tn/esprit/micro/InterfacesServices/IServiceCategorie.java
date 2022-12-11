package tn.esprit.micro.InterfacesServices;

import tn.esprit.micro.Entity.Categorie;

import java.util.List;

public interface IServiceCategorie {

    List<Categorie> retrieveAllCategories();

    Categorie updateCategorie(Categorie c);

    Categorie addCategorie(Categorie c);

    Categorie retrieveCategorie(Integer idCategorie);

    void removeCategorie(Integer idCategorie);
}
