package openClosePrinciple.impls;

import openClosePrinciple.Employe;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author BarkouchMourad
 **/
public class Manager extends Employe {
    private final double COEFFICIENT = 2.5;
    public Manager(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public String calculerSalaire(){
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format((this.getSalaireBase()*COEFFICIENT));
    }
}
