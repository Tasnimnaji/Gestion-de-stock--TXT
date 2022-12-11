package com.example.gestionstock.Controller;
import com.example.gestionstock.Entity.LigneCommandeClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.gestionstock.Service.IServiceLigneCommandeClient;
import java.util.List;

@RestController
public class LigneCommandeClientController {
    @Autowired
    IServiceLigneCommandeClient iServiceLigneCommandeClient;
    // http://localhost:8099/Stock/LigneCommandeClient/retrieveAllLigneCommandeClient
    @GetMapping("/retrieveAllLigneCommandeClient")
    public List<LigneCommandeClient> getallLigneCommandeClient()
    {
        List<LigneCommandeClient> listLigneCommandeClients = iServiceLigneCommandeClient.retrieveAllLigneCommandeClients();
        return listLigneCommandeClients;
    }
    // http://localhost:8099/Stock/LigneCommandeClient/addLigneCommandeClient
    @PostMapping("/addLigneCommandeClient")
    public LigneCommandeClient addLigneCommandeClient(@RequestBody LigneCommandeClient LCC)
    {
        return iServiceLigneCommandeClient.addLigneCommandeClient(LCC);
    }
    // http://localhost:8099/Stock/LigneCommandeClient/retrieveLigneCommandeClient
    @GetMapping("/retrieveEtudiant/{idLigneCommandeClient}")
    public LigneCommandeClient getLigneCommandeClient(@PathVariable("idLigneCommandeClient") Integer idLigneCommandeClient)
    {
        return iServiceLigneCommandeClient.retrieveLigneCommandeClient(idLigneCommandeClient);
    }
    // http://localhost:8099/Stock/LigneCommandeClient/updateLigneCommandeClient
    @PutMapping("/updateLigneCommandeClient")
    public LigneCommandeClient updateLigneCommandeClient(@RequestBody LigneCommandeClient LCC)
    {
        return iServiceLigneCommandeClient.updateLigneCommandeClient(LCC);
    }

    // http://localhost:8099/Micro/LigneCommandeClient/removeLigneCommandeClient
    @DeleteMapping("/remove-LigneCommandeClient/{id-LigneCommandeClient}")
    public void removeLigneCommandeClient(@PathVariable("id-prod") Integer idLigneCommandeClient)
    {
        iServiceLigneCommandeClient.removeLigneCommandeClient(idLigneCommandeClient);
    }

}
