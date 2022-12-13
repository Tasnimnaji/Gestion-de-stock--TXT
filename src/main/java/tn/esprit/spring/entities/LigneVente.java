package tn.esprit.spring.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LigneVente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLigneVente",nullable = false)
	int idLigneVente;
	int quantite;
	@OneToMany(mappedBy = "ligneventes")
    private List<Produit> produits;
	@OneToMany(mappedBy = "lignevente")
    private List<Vente> vente;
	public int getIdLigneVente() {
		return idLigneVente;
	}
	public void setIdLigneVente(int idLigneVente) {
		this.idLigneVente = idLigneVente;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public List<Vente> getVente() {
		return vente;
	}
	public void setVente(List<Vente> vente) {
		this.vente = vente;
	}
	public LigneVente(int idLigneVente, int quantite, List<Produit> produits, List<Vente> vente) {
		super();
		this.idLigneVente = idLigneVente;
		this.quantite = quantite;
		this.produits = produits;
		this.vente = vente;
	}
	
}
