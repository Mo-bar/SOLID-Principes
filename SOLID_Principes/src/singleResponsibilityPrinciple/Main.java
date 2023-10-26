package singleResponsibilityPrinciple;

/**
 * @author BarkouchMourad
 **/
public class Main {
    public static void main(String[] args) {
        CompteBancaire distinateur = new CompteBancaire("Ahmed", 2000);
        CompteBancaire recepteur = new CompteBancaire("Ali", 1000);
        Solde solde = new Solde();
        Virement virement = new Virement();

        System.out.println(solde.Afficher(recepteur));
        System.out.println(solde.Afficher(distinateur));

        virement.effectuerVirement(distinateur, recepteur, 1000);

        System.out.println(solde.Afficher(recepteur));
        System.out.println(solde.Afficher(distinateur));

    }
}
