package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.CommandeClient;
import com.example.gestionstock.Repository.CommandeClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceCommandeClient implements IServiceCommandeClient{
    @Autowired
    CommandeClientRepository commandeClientRepository;
    @Override
    public List<CommandeClient> retrieveAllCommandeClients() {
       List<CommandeClient> commandeClients=commandeClientRepository.findAll();
        return commandeClients;
    }

    @Override
    public CommandeClient updateCommandeClient(CommandeClient CC) {
        return commandeClientRepository.save(CC);
    }

    @Override
    public CommandeClient addCommandeClient(CommandeClient CC) {
        return commandeClientRepository.save(CC);
    }

    @Override
    public CommandeClient retrieveCommandeClient(Integer idCommandeClient) {
        return commandeClientRepository.findById(idCommandeClient).orElse(null);
    }

    @Override
    public void removeCommandeClient(Integer idCommandeClient) {
        commandeClientRepository.deleteById(idCommandeClient);

    }
}
