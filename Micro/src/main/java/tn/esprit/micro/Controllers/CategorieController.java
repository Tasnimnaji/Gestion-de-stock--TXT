package tn.esprit.micro.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro.Entity.Categorie;
import tn.esprit.micro.InterfacesServices.IServiceCategorie;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Categorie")
public class CategorieController {
    IServiceCategorie iServiceCategorie;
    // http://localhost:8099/Micro/Categorie/retrieve-all-Categorie
    @GetMapping("/retrieve-all-Categorie")
    public List<Categorie> getallCategorie()
    {
        List<Categorie> listCategories = iServiceCategorie.retrieveAllCategories();
        return listCategories;
    }
    // http://localhost:8099/Micro/Categorie/add-Categorie
    @PostMapping("/add-Categorie")
    public Categorie addCategorie(@RequestBody Categorie c)
    {
        return iServiceCategorie.addCategorie(c);
    }
    // http://localhost:8099/Micro/Categorie/retrieve-Categorie
    @GetMapping("/retrieve-Categorie/{id-categ}")
    public Categorie getCategorie(@PathVariable("id-categ") Integer idcateg)
    {
        return iServiceCategorie.retrieveCategorie(idcateg);
    }
    // http://localhost:8099/Micro/Categorie/update-Categorie
    @PutMapping("/update-Categorie")
    public Categorie updateCategorie(@RequestBody Categorie c)
    {
        return iServiceCategorie.updateCategorie(c);
    }

    // http://localhost:8099/Micro/Categorie/remove-Categorie
    @DeleteMapping("/remove-Categorie/{id-categ}")
    public void removeCategorie(@PathVariable("id-categ") Integer idcateg)
    {
        iServiceCategorie.removeCategorie(idcateg);
    }

}
