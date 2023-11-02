package openClosePrinciple.impls;

import openClosePrinciple.Employe;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author BarkouchMourad
 **/
public class Ingenieur extends Employe {
    private final double COEFFICIENT = 2.75;
    public Ingenieur(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public String calculerSalaire(){
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format((this.getSalaireBase() * COEFFICIENT));
    }
}
