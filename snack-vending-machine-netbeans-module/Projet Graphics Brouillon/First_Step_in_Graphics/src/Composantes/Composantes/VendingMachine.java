package Composantes;


import java.util.ArrayList;
import java.util.Vector;

public class VendingMachine {

  public int IDVendingMachine;

   
  public static ArrayList<Produit> produits = new ArrayList();
public static ArrayList<ConsomateurAbonne> consomateurs = new ArrayList();

   


  public VendingMachine(int iDVendingMachine) {
	super();
	IDVendingMachine = iDVendingMachine;
}

  
  
public int getIDVendingMachine() {
	return IDVendingMachine;
}


public void setIDVendingMachine(int iDVendingMachine) {
	IDVendingMachine = iDVendingMachine;
}


public int getID() {
  return 0;
  }

  public void setID(int ID) {
  }

  public void CalculerMontant() {
  }

  public void AfficherMontant() {
  }

 
  public void DefinirBestConsomateur() {
  }

  public void AffichagePanne() {
  }

  public void VerifierIdentification() {
  }

  public void EnregistrerPhoto() {
  }

  public static Produit getProduit(int Numero)
  {
      for(Produit p : produits)
      {
          if(p.getNumero()==Numero)
              return p ;
      }
      return null ;
  }
}