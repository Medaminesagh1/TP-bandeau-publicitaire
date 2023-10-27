package MonTravaille;
import bandeau.Bandeau;
public class EffetApparitionGauche extends Effet{
    private String texte;

    public EffetApparitionGauche(String texte) {
        this.texte = texte;
    }
    public void appliquer(Bandeau bandeau) {
        int length = texte.length();
        for (int i = 0; i <= length; i++) {
            bandeau.setMessage(texte.substring(0, i));
            bandeau.sleep(100); // Délai de 100 millisecondes (ajustez selon votre préférence)
        }
    }


}
