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
public class Salary {

    public static void main(String[] arg) {
        Commercial cr = new Commercial("nadar", "Mahamat", "10g023p", 30, "2013", 100);
        System.out.println(cr.getNom() + " a une salaire de:");
        System.out.println(cr.calculersalaire());
        Vendeur ven = new Vendeur("kaya", "lolo", "10g073p", 37, "2013", 100);
        System.out.println(ven.getNom() + " a une salaire ++++:");
        System.out.println(ven.calculersalaire());
        Representant rep = new Representant("mila", "Mbai", "10g203p", 21, "2013", 100, 200);
        System.out.println(rep.getNom() + "a une salaire de:");
        System.out.println(rep.calculersalaire());
        Technicien Tech = new Technicien("jack", "koula", "10g032p", 23, "2013", 10);
        System.out.println(Tech.getNom() + "a une salaire de:");
        System.out.println(Tech.calculersalaire());
        Manutentionnaire Manu = new Manutentionnaire("buno", "Mbai", "10g109n", 41, "1992", 7);
        System.out.println(Manu.getNom() + "a une salaire de:");
        System.out.println(Manu.calculersalaire());
        ManutentionnaireRisque ManuRis = new ManutentionnaireRisque("brice", "Mbainare", "10g013p", 30, "2013", 8);
        System.out.println(ManuRis.getNom() + "a une salaire de:");
        System.out.println(ManuRis.calculersalaire());
        Technicien TechRis = new TechnicienRisque("jean", "Mbailao", "10g115p", 29, "2013", 12);
        System.out.println(TechRis.getNom() + "a une salaire de:");
        System.out.println(TechRis.calculersalaire());
        //test personnel
        Personnel prs = new Personnel();
        prs.ajouterEmploye(new Commercial("jame", "kulu", "11g105p", 25, "1998", 120));
        prs.ajouterEmploye(new Manutentionnaire("lodjim", "ndji", "10g001t", 23, "1994", 11));
        prs.ajouterEmploye(new Technicien("brahim", "Moude", "12g103p", 12, "2013", 10));
        prs.ajouterEmploye(new Vendeur("mbol", "kil", "10g106p", 21, "2013", 100));
        prs.ajouterEmploye(new Representant("jean", "kolo", "10g107l", 36, "2014", 300, 120));
        prs.ajouterEmploye(new TechnicienRisque("chris", "kily", "10g114k", 27, "2014", 8));
        prs.ajouterEmploye(new ManutentionnaireRisque("black", "soul", "10g107p", 25, "2012", 4));
        prs.affichersalaires();

        System.out.println("le salaire Moyen de la societé est " + prs.salaireMoyen() + "FCFA");

    }

}
