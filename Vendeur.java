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
public class Vendeur extends Commercial {
    private  final static int bonus_vendeur=100;
    public Vendeur( String prenom,String nom,String matricule,int age,String date_entré_entreprise,double chiffreaffaire){
      super(prenom,nom,matricule,age,date_entré_entreprise,chiffreaffaire);
    }
    public double calculersalaire(){
        return (0.2*chiffreaffaire)+bonus_vendeur;
    }
}
   
    
