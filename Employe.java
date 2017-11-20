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
public abstract class Employe {
   private String matricule;
   private String nom;
   private String prenom;
   private int age;
   private String date_entré_entreprise;
    public Employe(){
    }
    public Employe(String prenom,String nom,String matricule,int age,String date_entré_entreprise){
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.date_entré_entreprise=date_entré_entreprise;
       
        
    }
    public abstract double calculersalaire();
    
    public String getNom(){
        String str;
        return  str = "Employer "+prenom+" "+nom+" "; 
    
    }
}
