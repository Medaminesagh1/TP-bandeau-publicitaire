package MonTravaille;

import bandeau.Bandeau;

public class EffetRotation extends Effet {
    private double angle;

    public EffetRotation(double angle) {
        this.angle = angle;
    }

    public void appliquer(Bandeau bandeau) {
        bandeau.setRotation(angle);
    }
}
