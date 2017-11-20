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
public class Manutentionnaire extends Employe {
    private static final double prix_heure=65;
    public int nbre_heure;
    public Manutentionnaire(String prenom,String nom,String matricule,int age,String date_entré_entreprise,int nbre_heure){
       super(prenom,nom,matricule,age,date_entré_entreprise); 
    }
    public double calculersalaire(){
        return(65*nbre_heure);
    }
}
    
