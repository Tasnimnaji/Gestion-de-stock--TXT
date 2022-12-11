package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.CommandeClient;

import java.util.List;

public interface IServiceCommandeClient {
    List<CommandeClient> retrieveAllCommandeClients();

    CommandeClient updateCommandeClient(CommandeClient CC);

    CommandeClient addCommandeClient(CommandeClient CC);

    CommandeClient retrieveCommandeClient(Integer idCommandeClient);

    void removeCommandeClient(Integer idCommandeClient);
}
