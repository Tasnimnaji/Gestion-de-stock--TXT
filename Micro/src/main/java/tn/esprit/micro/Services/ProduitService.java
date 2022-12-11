package tn.esprit.micro.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.micro.Entity.Produit;
import tn.esprit.micro.InterfacesServices.IServiceProduit;
import tn.esprit.micro.Repository.ProduitRepository;

import java.util.List;

@Service
@Slf4j
public class ProduitService implements IServiceProduit {
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public List<Produit> retrieveAllProduits() {
        List<Produit> produits=produitRepository.findAll();
        return produits;
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit addProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Integer idProduit) {
        return produitRepository.findById(idProduit).orElse(null);
    }

    @Override
    public void removeProduit(Integer idProduit) {
        produitRepository.deleteById(idProduit);

    }
}
