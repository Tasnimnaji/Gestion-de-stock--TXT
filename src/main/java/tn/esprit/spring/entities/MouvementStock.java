package tn.esprit.spring.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class MouvementStock {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
	int id;
	Date datemvt;
	int quantite;
	String Periode;
	@OneToMany(mappedBy = "mouvementstock")
    private List<Produit> produits;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDatemvt() {
		return datemvt;
	}
	public void setDatemvt(Date datemvt) {
		this.datemvt = datemvt;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getPeriode() {
		return Periode;
	}
	public void setPeriode(String periode) {
		Periode = periode;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public MouvementStock(int id, Date datemvt, int quantite, String periode, List<Produit> produits) {
		super();
		this.id = id;
		this.datemvt = datemvt;
		this.quantite = quantite;
		Periode = periode;
		this.produits = produits;
	}
	
	
}
