package openClosePrinciple;

import openClosePrinciple.impls.Ingenieur;
import openClosePrinciple.impls.Technicien;

import static openClosePrinciple.Afficher.infos;


/**
 * @author BarkouchMourad
 **/
public class Main {
    static private Employe employe;

    public static void main(String[] args) {
        employe = new Ingenieur("Mourad", 10500);
        System.out.println("*".repeat(40));
        employe.calculerSalaire();
        infos(employe);
        System.out.println(employe.calculerSalaire());

        System.out.println("*".repeat(40));

        employe = new Technicien("Sara" ,9000);
        infos(employe);
        System.out.println(employe.calculerSalaire());

        System.out.println("*".repeat(40));

        employe = new Technicien("Ali" ,6000);
        infos(employe);
        System.out.println(employe.calculerSalaire());
        System.out.println("*".repeat(40));

    }
}
