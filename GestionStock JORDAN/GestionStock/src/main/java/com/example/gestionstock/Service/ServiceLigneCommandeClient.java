package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.LigneCommandeClient;
import com.example.gestionstock.Repository.LigneCommandeClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceLigneCommandeClient implements IServiceLigneCommandeClient{
    @Autowired
    LigneCommandeClientRepository ligneCommandeClientRepository;
    @Override
    public List<LigneCommandeClient> retrieveAllLigneCommandeClients() {
        List<LigneCommandeClient> ligneCommandeClients=ligneCommandeClientRepository.findAll();
        return ligneCommandeClients;
    }

    @Override
    public LigneCommandeClient updateLigneCommandeClient(LigneCommandeClient LCC) {
        return ligneCommandeClientRepository.save(LCC);
    }

    @Override
    public LigneCommandeClient addLigneCommandeClient(LigneCommandeClient LCC) {
        return ligneCommandeClientRepository.save(LCC);
    }

    @Override
    public LigneCommandeClient retrieveLigneCommandeClient(Integer idLigneCommandeClient) {
        return ligneCommandeClientRepository.findById(idLigneCommandeClient).orElse(null);
    }

    @Override
    public void removeLigneCommandeClient(Integer idLigneCommandeClient) {
        ligneCommandeClientRepository.deleteById(idLigneCommandeClient);

    }
}
