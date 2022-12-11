package com.example.gestionstock.Controller;


import com.example.gestionstock.Entity.CommandeFournisseur;
import com.example.gestionstock.Service.IServiceCommandeFournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CommandeFournisseurController {
    @Autowired
    IServiceCommandeFournisseur iServiceCommandeFournisseur;
    // http://localhost:8099/Stock/CommandeFournisseur/retrieveAllCommandeFournisseur
    @GetMapping("/retrieve-all-CommandeFournisseur")
    public List<CommandeFournisseur> getallCommandeFournisseur()
    {
        List<CommandeFournisseur> listCommandeFournisseur = iServiceCommandeFournisseur.retrieveAllCommandeFournisseurs();
        return listCommandeFournisseur;
    }
    // http://localhost:8099/Stock/CommandFournisseur/addCommandeFournisseur
    @PostMapping("/add-CommandeFournisseur")
    public CommandeFournisseur addCommandeFournisseur(@RequestBody CommandeFournisseur CF)
    {
        return iServiceCommandeFournisseur.addCommandeFournisseur(CF);
    }
    // http://localhost:8099/Stock/CommandeFournisseur/retrieveCommandeFournisseur
    @GetMapping("/retrieve-Etudiant/{id-CommandeFournisseur}")
    public CommandeFournisseur getCommandeClient(@PathVariable("id-CommandeFournisseur") Integer idCommandeFournisseur)
    {
        return iServiceCommandeFournisseur.retrieveCommandeFournisseur(idCommandeFournisseur);
    }
    // http://localhost:8099/Stock/CommandeFournisseur/updateCommandeFournisseur
    @PutMapping("/update-CommandeFournisseur")
    public CommandeFournisseur updateCommandeFournisseur(@RequestBody CommandeFournisseur CF)
    {
        return iServiceCommandeFournisseur.updateCommandeFournisseur(CF);
    }

    // http://localhost:8099/Micro/CommandeFournisseur/removeCommandeFournisseur
    @DeleteMapping("/remove-CommandeFournisseur/{id-CommandeFournisseur}")
    public void removeCommandeFournisseur(@PathVariable("id-prod") Integer idCommandeFournisseur)
    {
        iServiceCommandeFournisseur.removeCommandeFournisseur(idCommandeFournisseur);
    }

}
