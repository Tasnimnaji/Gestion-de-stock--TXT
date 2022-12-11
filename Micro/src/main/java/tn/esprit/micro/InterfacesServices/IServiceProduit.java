package tn.esprit.micro.InterfacesServices;

import tn.esprit.micro.Entity.Produit;

import java.util.List;

public interface IServiceProduit {
    List<Produit> retrieveAllProduits();

    Produit updateProduit(Produit p);

    Produit addProduit(Produit p);

    Produit retrieveProduit(Integer idProduit);

    void removeProduit(Integer idProduit);
}
