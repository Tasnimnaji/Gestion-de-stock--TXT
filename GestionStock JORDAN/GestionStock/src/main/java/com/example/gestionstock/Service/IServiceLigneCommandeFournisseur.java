package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.LigneCommandeClient;
import com.example.gestionstock.Entity.LigneCommandeFournisseur;

import java.util.List;

public interface IServiceLigneCommandeFournisseur {
    List<LigneCommandeFournisseur> retrieveAllLigneCommandeFournisseurs();

    LigneCommandeFournisseur updateLigneCommandeFournisseur(LigneCommandeFournisseur LCF);

    LigneCommandeFournisseur addLigneCommandeFournisseur(LigneCommandeFournisseur LCF);

    LigneCommandeFournisseur retrieveLigneCommandeFournisseur(Integer idLigneCommandeFournisseur);

    void removeLigneCommandeFournisseur(Integer idLigneCommandeFournisseur);

}
