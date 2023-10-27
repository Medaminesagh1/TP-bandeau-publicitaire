package MonTravaille;
import bandeau.Bandeau;

import java.awt.Color;


public class EffetCouleurTexte extends Effet{
    private Color couleurTexte;

    public EffetCouleurTexte(Color couleurTexte) {
        this.couleurTexte = couleurTexte;
    }
    public void appliquer(Bandeau bandeau) {
        bandeau.setForeground(couleurTexte);
    }
}
