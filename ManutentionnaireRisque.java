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
public class ManutentionnaireRisque extends Manutentionnaire implements ZoneRisque {
    public ManutentionnaireRisque(String prenom,String nom,String matricule,int age,String date_entré_entreprise,int nbre_heure){
       super(prenom,nom,matricule,age,date_entré_entreprise,nbre_heure);
}
     public double calculersalaire(){
            return super. calculersalaire()+prime; 
    
    
}
}