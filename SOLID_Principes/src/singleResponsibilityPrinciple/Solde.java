package singleResponsibilityPrinciple;

/**
 * @author BarkouchMourad
 **/
public class Solde {
    public String Afficher(CompteBancaire compteBancaire){
        return "Titulaire : "+compteBancaire.getTitulaire()
                .concat("\n")
                .concat("Solde : ")+compteBancaire.getSolde();
    }
}
