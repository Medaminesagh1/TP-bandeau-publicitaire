package MonTravaille;
import java.awt.Color;
import bandeau.Bandeau;

public class EffetCouleurFond extends Effet{
    private Color couleurFond;

    public EffetCouleurFond(Color couleurFond) {
        this.couleurFond = couleurFond;
    }
    public void appliquer(Bandeau bandeau) {
        bandeau.setBackground(couleurFond);
    }
}
