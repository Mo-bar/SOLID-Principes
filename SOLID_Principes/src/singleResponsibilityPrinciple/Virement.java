package singleResponsibilityPrinciple;

/**
 * @author BarkouchMourad
 **/
public class Virement {
    public void effectuerVirement(CompteBancaire compte, CompteBancaire compte1,double montant){
        if(compte.getSolde() >= montant){
            compte.retirer(montant);
            compte1.desposer(montant);
            return;
        }
        System.err.println("Solde insuffisant pour effectuer le virement!");
    }

}
