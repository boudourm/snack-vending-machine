/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composantes;


import javax.swing.JFrame;

/**
 *
 * @author Moflawer
 */
public class TESTS_CLASS {
    public static void main(String[] args)	
	{	
            
            VendingMachine.produits.add(new Produit("Lays",150,1,30));
            VendingMachine.produits.add(new Produit("Sunchips",180,2,30));
            VendingMachine.produits.add(new Produit("Doritos",200,3,30));
            VendingMachine.produits.add(new Produit("Snikers",80,4,30));
            VendingMachine.produits.add(new Produit("Hershey's",80,5,30));
            VendingMachine.produits.add(new Produit("Twix",70,6,30));
            VendingMachine.produits.add(new Produit("Mnm's",325,7,30));
            VendingMachine.produits.add(new Produit("Oreo",100,8,30));
            VendingMachine.produits.add(new Produit("Reese's",120,9,30));
            VendingMachine.produits.add(new Produit("Pepsi",105,10,30));
            VendingMachine.produits.add(new Produit("Cocacola",85,11,30));
            VendingMachine.produits.add(new Produit("RedBull",220,12,30));
            
            
            VendingMachine.consomateurs.add(new ConsomateurAbonne("BOULEKRINAT","Samia",1112223,101 ,2659));
            VendingMachine.consomateurs.add(new ConsomateurAbonne("BELLEBCIR","Amina",4445556, 102,1985));
            VendingMachine.consomateurs.add(new ConsomateurAbonne("BOUDOUR","Mehdi",7778889,103 ,25));
            VendingMachine.consomateurs.add(new ConsomateurAbonne("BOUDOUR","Mehdi",7778889,103 ,25));
            
            
           WINDOW_0 w = new WINDOW_0();
           w.InitVitrine();
           w.setVisible(true);
           
           //Vitrine 
	}
}
