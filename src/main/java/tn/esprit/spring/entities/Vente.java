package tn.esprit.spring.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Vente {
	@Id
	@GeneratedValue
	public int idV ;
	Date datevente;
	String CodeAbarre;
	@ManyToOne
    LigneVente lignevente;
	public int getIdV() {
		return idV;
	}
	public void setIdV(int idV) {
		this.idV = idV;
	}
	public Date getDatevente() {
		return datevente;
	}
	public void setDatevente(Date datevente) {
		this.datevente = datevente;
	}
	public String getCodeAbarre() {
		return CodeAbarre;
	}
	public void setCodeAbarre(String codeAbarre) {
		CodeAbarre = codeAbarre;
	}
	public LigneVente getLignevente() {
		return lignevente;
	}
	public void setLignevente(LigneVente lignevente) {
		this.lignevente = lignevente;
	}
	public Vente(int idV, Date datevente, String codeAbarre, LigneVente lignevente) {
		super();
		this.idV = idV;
		this.datevente = datevente;
		CodeAbarre = codeAbarre;
		this.lignevente = lignevente;
	}
	

}
