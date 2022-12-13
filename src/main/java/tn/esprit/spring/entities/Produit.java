package tn.esprit.spring.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Produit {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idP",nullable = false)
	int idP;
	int prixP;
	String nomP;
	
	@ManyToOne
	MouvementStock mouvementstock;
	@ManyToOne
    private Categorie categorie;
	@ManyToOne
    LigneVente ligneventes;
	public int getIdP() {
		return idP;
	}
	public void setIdP(int idP) {
		this.idP = idP;
	}
	public int getPrixP() {
		return prixP;
	}
	public void setPrixP(int prixP) {
		this.prixP = prixP;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public MouvementStock getMouvementstock() {
		return mouvementstock;
	}
	public void setMouvementstock(MouvementStock mouvementstock) {
		this.mouvementstock = mouvementstock;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public LigneVente getLigneventes() {
		return ligneventes;
	}
	public void setLigneventes(LigneVente ligneventes) {
		this.ligneventes = ligneventes;
	}
	public Produit(int idP, int prixP, String nomP, MouvementStock mouvementstock, Categorie categorie,
			LigneVente ligneventes) {
		super();
		this.idP = idP;
		this.prixP = prixP;
		this.nomP = nomP;
		this.mouvementstock = mouvementstock;
		this.categorie = categorie;
		this.ligneventes = ligneventes;
	}
	
}
