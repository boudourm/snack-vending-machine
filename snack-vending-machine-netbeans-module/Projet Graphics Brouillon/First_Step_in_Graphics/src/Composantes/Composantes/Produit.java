package Composantes;

import java.util.Vector;

public class Produit {

  public String Nom;

  public int Prix;

  public int Numero;

  public Integer quantite;

public Produit(String nom, int prix, int numero, Integer quantite) {
	super();
	Nom = nom;
	Prix = prix;
	Numero = numero;
	this.quantite = quantite;
}

    Produit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public int getPrix() {
	return Prix;
}

public void setPrix(int prix) {
	Prix = prix;
}

public int getNumero() {
	return Numero;
}

public void setNumero(int numero) {
	Numero = numero;
}

public Integer getQuantite() {
	return quantite;
}

public void setQuantite(Integer quantite) {
	this.quantite = quantite;
}



}