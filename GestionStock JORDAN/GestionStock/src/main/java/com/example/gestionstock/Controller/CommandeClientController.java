package com.example.gestionstock.Controller;

import com.example.gestionstock.Entity.CommandeClient;
import com.example.gestionstock.Service.IServiceCommandeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CommandeClientController {
    @Autowired
    IServiceCommandeClient iServiceCommandeClient;
    // http://localhost:8099/Stock/CommandeClient/retrieveAllCommandeClient
    @GetMapping("/hello")
    public String hi(){
        return "hello world";
    }



    @GetMapping("/retrieveAllCommandeClient")
    public List<CommandeClient> getallCommandeClient()
    {
        List<CommandeClient> listCommandeClients = iServiceCommandeClient.retrieveAllCommandeClients();
        return listCommandeClients;
    }
    // http://localhost:8099/Stock/CommandeClient/addCommandeClient
    @PostMapping("/addCommandeClient")
    public CommandeClient addCommandeClient(@RequestBody CommandeClient CC)
    {
        System.out.println(CC);
        return iServiceCommandeClient.addCommandeClient(CC);
    }
    // http://localhost:8099/Stock/CommandeClient/retrieveCommandeClient
    @GetMapping("/retrieveEtudiant/{idCommandeClient}")
    public CommandeClient getCommandeClient(@PathVariable("idCommandeClient") Integer idCommandeClient)
    {
        return iServiceCommandeClient.retrieveCommandeClient(idCommandeClient);
    }
    // http://localhost:8099/Stock/CommandeClient/updateCommandeClient
    @PutMapping("/updateCommandeClient")
    public CommandeClient updateCommandeClient(@RequestBody CommandeClient CC)
    {
        return iServiceCommandeClient.updateCommandeClient(CC);
    }

    // http://localhost:8099/Micro/CommandeClient/removeCommandeClient
    @DeleteMapping("/remove-CommandeClient/{id-CommandeClient}")
    public void removeCommandeClient(@PathVariable("id-prod") Integer idCommandeClient)
    {
        iServiceCommandeClient.removeCommandeClient(idCommandeClient);
    }

}
