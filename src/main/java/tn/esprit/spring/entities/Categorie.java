package tn.esprit.spring.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorie {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idC",nullable = false)
	int idC;
	String nom;
	@OneToMany(mappedBy = "categorie")
    private List<Produit> produits;
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public Categorie(int idC, String nom, List<Produit> produits) {
		super();
		this.idC = idC;
		this.nom = nom;
		this.produits = produits;
	}
	
}
