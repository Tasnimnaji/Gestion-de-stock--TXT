package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.CommandeFournisseur;
import com.example.gestionstock.Entity.LigneCommandeClient;

import java.util.List;

public interface IServiceLigneCommandeClient {
    List<LigneCommandeClient> retrieveAllLigneCommandeClients();

    LigneCommandeClient updateLigneCommandeClient(LigneCommandeClient LCC);

    LigneCommandeClient addLigneCommandeClient(LigneCommandeClient LCC);

    LigneCommandeClient retrieveLigneCommandeClient(Integer idLigneCommandeClient);

    void removeLigneCommandeClient(Integer idLigneCommandeClient);
}
