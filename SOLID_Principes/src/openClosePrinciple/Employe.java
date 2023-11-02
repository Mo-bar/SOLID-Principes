package openClosePrinciple;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author BarkouchMourad
 **/
public abstract class Employe {
    private String nom;
    private double salaireBase;

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public String calculerSalaire(){
        return NumberFormat.getCurrencyInstance(Locale.FRANCE).format((this.getSalaireBase()));
    }

}
