package com.example.gestionstock.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CommandeClient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCommandeClient")
    private Integer idCommandeClient;
    private Integer numCommande;
    @Temporal(TemporalType.DATE)
    private Calendar dateCommande;
    @Temporal(TemporalType.DATE)
    private Calendar dateBesoinCommande;

    @ManyToOne
    LigneCommandeClient ligneCommandeClient;
}
