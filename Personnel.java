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
public class Personnel {
    private final Employe[] travailleur;
    private int num_Employe;
    private final static int MaxEmploye=10;
    public Personnel(){
        travailleur=new Employe[MaxEmploye];
        
        
            
    }
    public void ajouterEmploye(Employe E){
        num_Employe++;
        if(num_Employe<=MaxEmploye){
            travailleur[num_Employe-1]=E;
        }else{
            System.out.println("pas plus de"+MaxEmploye+"Employe");
        }
  
      }
 public  double salaireMoyen(){
            int som=0;
            for(int i=0;i<num_Employe;i++){
                som+=travailleur[i].calculersalaire();
            }
              return som/num_Employe;
 }
 public void affichersalaires(){
     for(int i=0;i<num_Employe;i++){
         System.out.println(travailleur[i].getNom()+" gagne "+travailleur[i].calculersalaire()+" FCfA ");
     }
        
 }
} 
           
            
    
    

