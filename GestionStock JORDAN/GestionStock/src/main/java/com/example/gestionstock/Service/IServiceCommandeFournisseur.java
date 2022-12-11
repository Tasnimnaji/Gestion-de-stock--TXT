package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.CommandeClient;
import com.example.gestionstock.Entity.CommandeFournisseur;

import java.util.List;

public interface IServiceCommandeFournisseur {
    List<CommandeFournisseur> retrieveAllCommandeFournisseurs();

    CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur CF);

    CommandeFournisseur addCommandeFournisseur(CommandeFournisseur CF);

    CommandeFournisseur retrieveCommandeFournisseur(Integer idCommandeFournisseur);

    void removeCommandeFournisseur(Integer idCommandeFournisseur);
}
