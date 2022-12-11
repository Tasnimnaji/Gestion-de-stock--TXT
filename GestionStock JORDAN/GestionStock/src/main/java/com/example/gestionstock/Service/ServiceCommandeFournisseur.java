package com.example.gestionstock.Service;

import com.example.gestionstock.Entity.CommandeFournisseur;
import com.example.gestionstock.Repository.CommandeFournisseurRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ServiceCommandeFournisseur implements IServiceCommandeFournisseur {
    @Autowired
    CommandeFournisseurRepository commandeFournisseurRepository;
    @Override
    public List<CommandeFournisseur> retrieveAllCommandeFournisseurs() {
        List<CommandeFournisseur>   commandeFournisseurs=commandeFournisseurRepository.findAll();
        return commandeFournisseurs;
    }

    @Override
    public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur CF) {
        return commandeFournisseurRepository.save(CF);
    }

    @Override
    public CommandeFournisseur addCommandeFournisseur(CommandeFournisseur CF) {
        return commandeFournisseurRepository.save(CF);
    }

    @Override
    public CommandeFournisseur retrieveCommandeFournisseur(Integer idCommandeFournisseur) {
        return commandeFournisseurRepository.findById(idCommandeFournisseur).orElse(null);
    }

    @Override
    public void removeCommandeFournisseur(Integer idCommandeFournisseur) {
        commandeFournisseurRepository.deleteById(idCommandeFournisseur);

    }
}
