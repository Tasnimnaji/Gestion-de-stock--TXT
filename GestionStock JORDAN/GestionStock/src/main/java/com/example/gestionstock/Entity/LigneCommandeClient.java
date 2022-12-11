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
public class LigneCommandeClient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLigneCommandeClient")
    private Integer idLigneCommandeClient;
    private Integer quantite;
    private String Description;

   @OneToMany(mappedBy = "ligneCommandeClient")
    private List<CommandeClient> commandeClients;
}
