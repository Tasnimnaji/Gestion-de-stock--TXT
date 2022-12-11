package tn.esprit.micro.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategorie",nullable = false)
    private Integer idCategorie;
    private String nomC;
    @ToString.Exclude
    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
}
