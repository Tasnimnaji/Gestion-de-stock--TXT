package tn.esprit.micro.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro.Entity.Produit;
import tn.esprit.micro.InterfacesServices.IServiceProduit;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Categorie")
public class ProduitController {
    IServiceProduit iServiceProduit;
    // http://localhost:8099/Micro/Produit/retrieve-all-Produit
    @GetMapping("/retrieve-all-Produit")
    public List<Produit> getallProduit()
    {
        List<Produit> listProduits = iServiceProduit.retrieveAllProduits();
        return listProduits;
    }
    // http://localhost:8099/Micro/Produit/add-Produit
    @PostMapping("/add-Produit")
    public Produit addProduit(@RequestBody Produit p)
    {
        return iServiceProduit.addProduit(p);
    }
    // http://localhost:8099/Micro/Produit/retrieve-Produit
    @GetMapping("/retrieve-Etudiant/{id-prod}")
    public Produit getProduit(@PathVariable("id-prod") Integer idprod)
    {
        return iServiceProduit.retrieveProduit(idprod);
    }
    // http://localhost:8099/Micro/Produit/update-Produit
    @PutMapping("/update-Produit")
    public Produit updateProduit(@RequestBody Produit p)
    {
        return iServiceProduit.updateProduit(p);
    }

    // http://localhost:8099/Micro/Produit/remove-Produit
    @DeleteMapping("/remove-Produit/{id-prod}")
    public void removeProduit(@PathVariable("id-prod") Integer idprod)
    {
        iServiceProduit.removeProduit(idprod);
    }

}
