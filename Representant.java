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
public class Representant extends Commercial{
    private final int bonus_rep=200;
    public Representant(String prenom,String nom,String matricule,int age,String date_entré_entreprise ,int bonus,double chiffreaffaire){
    super(prenom,nom,matricule,age,date_entré_entreprise,chiffreaffaire);
    
            }
     public double calculersalaire(){
        return (0.2*chiffreaffaire)+bonus_rep;
    }
    
}
