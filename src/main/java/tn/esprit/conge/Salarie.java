package tn.esprit.conge;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Salarie {
	private String immatricule;
	private String nom;
	private String prenom;
	private long soldeCP=30;
	public Salarie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salarie(String immatricule, String nom, String prenom, long soldeCP) {
		super();
		this.immatricule = immatricule;
		this.nom = nom;
		this.prenom = prenom;
		this.soldeCP = soldeCP;
	}
	public String getImmatricule() {
		return immatricule;
	}
	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public long getSoldeCP() {
		return soldeCP;
	}
	public void setSoldeCP(long soldeCP) {
		this.soldeCP = soldeCP;
	}
	
}
