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
public class TechnicienRisque extends Technicien implements ZoneRisque {
    public TechnicienRisque(String prenom,String nom,String matricule,int age,String date_entré_entreprise,double nbre_produit){
        super(prenom,nom,matricule,age,date_entré_entreprise,nbre_produit);
        }
   
        public double calculersalaire(){
            return super.calculersalaire()+prime; 
    
    } 
}
    
