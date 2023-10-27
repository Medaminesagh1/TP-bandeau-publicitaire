package MonTravaille;

import bandeau.Bandeau;

public class EffetApparitionTexte extends Effet{
    private String texte;

    public EffetApparitionTexte(String texte) {
        this.texte = texte;
    }

    public void appliquer(Bandeau bandeau) {
        bandeau.setMessage(texte);
    }
}

