package openClosePrinciple.impls;

import openClosePrinciple.Employe;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author BarkouchMourad
 **/
public class Technicien extends Employe {
    private final double COEFFICIENT = 1.25;
    public Technicien(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public String calculerSalaire(){
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format((this.getSalaireBase()*COEFFICIENT));
    }
}
