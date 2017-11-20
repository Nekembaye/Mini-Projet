/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProjet;

/**
 *
 * @author hp
 */
public class Technicien extends Employe {
    private  static double nbre_produit;
    private final static double prix_unités=5;
    public Technicien(String prenom,String nom,String matricule,int age,String date_entré_entreprise,double nbre_produit){
        super(prenom,nom,matricule,age,date_entré_entreprise);
        this.nbre_produit=nbre_produit;
        
    }
    public double calculersalaire(){
        return(5*nbre_produit);
    }
}
    

