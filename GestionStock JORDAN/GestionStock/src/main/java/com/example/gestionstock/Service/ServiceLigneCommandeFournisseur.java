package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.LigneCommandeClient;
import com.example.gestionstock.Entity.LigneCommandeFournisseur;
import com.example.gestionstock.Repository.LigneCommandeFournisseurRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceLigneCommandeFournisseur implements IServiceLigneCommandeFournisseur{
    @Autowired
            LigneCommandeFournisseurRepository LF;
    LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository;
    @Override
    public List<LigneCommandeFournisseur> retrieveAllLigneCommandeFournisseurs() {
        List<LigneCommandeFournisseur> ligneCommandeFournisseurs=LF.findAll();

        return ligneCommandeFournisseurs;
    }

    @Override
    public LigneCommandeFournisseur updateLigneCommandeFournisseur(LigneCommandeFournisseur LCF) {
        return LF.save(LCF);
    }

    @Override
    public LigneCommandeFournisseur addLigneCommandeFournisseur(LigneCommandeFournisseur LCF) {
        return LF.save(LCF);
    }


    @Override
    public LigneCommandeFournisseur retrieveLigneCommandeFournisseur(Integer idLigneCommandeFournisseur) {
        return LF.findById(idLigneCommandeFournisseur).orElse(null);
    }

    @Override
    public void removeLigneCommandeFournisseur(Integer idLigneCommandeFournisseur) {
        LF.deleteById(idLigneCommandeFournisseur);

    }
}
