package com.example.gestionstock.Controller;
import com.example.gestionstock.Entity.LigneCommandeFournisseur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.gestionstock.Service.IServiceLigneCommandeFournisseur;
import java.util.List;

@RestController
public class LigneCommandeFournisseurController {
    @Autowired

    IServiceLigneCommandeFournisseur iServiceLigneCommandeFournisseur;
    // http://localhost:8099/Stock/LigneCommandeFournisseur/retrieveAllLigneCommandeFournisseur
    @GetMapping("/retrieveAllLigneCommandeFournisseur")
    public List<LigneCommandeFournisseur> getallLigneCommandeFournisseur()
    {
        List<LigneCommandeFournisseur> listLigneCommandeFournisseur = iServiceLigneCommandeFournisseur.retrieveAllLigneCommandeFournisseurs();
        return listLigneCommandeFournisseur;
    }
    // http://localhost:8099/Stock/LigneCommandeFournisseur/addLigneCommandeFournisseur
    @PostMapping("/addLigneCommandeFournisseur")
    public LigneCommandeFournisseur addLigneCommandeClient(@RequestBody LigneCommandeFournisseur LCF)
    {
        return iServiceLigneCommandeFournisseur.addLigneCommandeFournisseur(LCF);
    }
    // http://localhost:8099/Stock/LigneCommandeFournisseur/retrieveLigneCommandeFournisseur
    @GetMapping("/retrieveEtudiant/{idLigneCommandeFournisseur}")
    public LigneCommandeFournisseur getLigneCommandeFournisseur(@PathVariable("idLigneCommandeFournisseur") Integer idLigneCommandeFournisseur)
    {
        return iServiceLigneCommandeFournisseur.retrieveLigneCommandeFournisseur(idLigneCommandeFournisseur);
    }
    // http://localhost:8099/Stock/LigneCommandeFournisseur/updateLigneCommandeFournisseur
    @PutMapping("/updateLigneCommandeFournisseur")
    public LigneCommandeFournisseur updateLigneCommandeFournisseur(@RequestBody LigneCommandeFournisseur LCF)
    {
        return iServiceLigneCommandeFournisseur.updateLigneCommandeFournisseur(LCF);
    }

    // http://localhost:8099/Micro/LigneCommandeClient/removeLigneCommandeClient
    @DeleteMapping("/remove-LigneCommandeFournisseur/{id-LigneCommandeFournisseur}")
    public void removeLigneCommandeFournisseur(@PathVariable("id-prod") Integer idLigneCommandeFournisseur)
    {
        iServiceLigneCommandeFournisseur.removeLigneCommandeFournisseur(idLigneCommandeFournisseur);
    }

}
