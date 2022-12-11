package tn.esprit.micro.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduit",nullable = false)
    private Integer idProduit;
    private String nomP;
    private Integer prixP;


    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    private Categorie categorie;
}
