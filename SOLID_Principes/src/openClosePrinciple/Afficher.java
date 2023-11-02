package openClosePrinciple;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author BarkouchMourad
 **/
public class Afficher {
    public static void infos(Employe employe){
        final Locale fr = Locale.FRANCE;
        System.out.println(
                "Nom : " + employe.getNom()
                        .concat("\n")
                        .concat("Salaire de base : ") + NumberFormat.getCurrencyInstance(fr).format(employe.getSalaireBase())
        );
    }
}
