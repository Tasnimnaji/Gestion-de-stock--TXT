package com.example.gestionstock.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommandeFournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCommandeFournisseur")
    private Integer idCommandeFournisseur;
    private Integer numCommande;
    @Temporal(TemporalType.DATE)
    private Calendar dateCommande;

    @ManyToOne
    LigneCommandeFournisseur ligneCommandeFournisseur;


}
