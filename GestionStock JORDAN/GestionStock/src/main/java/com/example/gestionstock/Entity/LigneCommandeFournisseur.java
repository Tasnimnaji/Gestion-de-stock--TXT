package com.example.gestionstock.Entity;

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
public class LigneCommandeFournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLigneCommandeFournisseur")
    private Integer idLigneCommandeFournisseur;
    private Integer idProduit;
    private Integer quantité;
    private String description;

    @OneToMany(mappedBy = "ligneCommandeFournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;


}
