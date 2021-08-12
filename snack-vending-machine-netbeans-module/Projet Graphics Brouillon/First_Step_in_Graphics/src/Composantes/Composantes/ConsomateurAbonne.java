package Composantes;

import java.util.Vector;

public class ConsomateurAbonne extends Consomateur {

  public String Nom;

  public String Prenom;

  public int Telephone;

  public int Code;

  public double Solde;


  

  public ConsomateurAbonne(String nom, String prenom, int telephone, int code, double solde) {
	super();
	Nom = nom;
	Prenom = prenom;
	Telephone = telephone;
	Code = code;
	Solde = solde;
}

  
public String getNom() {
	return Nom;
}


public void setNom(String nom) {
	Nom = nom;
}


public String getPrenom() {
	return Prenom;
}


public void setPrenom(String prenom) {
	Prenom = prenom;
}


public int getTelephone() {
	return Telephone;
}


public void setTelephone(int telephone) {
	Telephone = telephone;
}


public int getCode() {
	return Code;
}


public void setCode(int code) {
	Code = code;
}


public double getSolde() {
	return Solde;
}


public void setSolde(double solde) {
	Solde = solde;
}


public void AcheterProduit() {
  }

  public void Identification() {
  }

}