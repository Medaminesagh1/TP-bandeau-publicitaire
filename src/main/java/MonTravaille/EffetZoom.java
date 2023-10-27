package MonTravaille;
import java.awt.Font;
import bandeau.Bandeau;
public class EffetZoom extends Effet {
    private int zoomAmount;

    public EffetZoom(int zoomAmount) {
        this.zoomAmount = zoomAmount;
    }
    public void appliquer(Bandeau bandeau) {
        int fontSize = bandeau.getFont().getSize();
        bandeau.setFont(new Font(bandeau.getFont().getName(), bandeau.getFont().getStyle(), fontSize + zoomAmount));
    }
}
