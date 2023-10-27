package MonTravaille;

import bandeau.Bandeau;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scenario scenario = new Scenario();

        // Ajout des effets au scénario
        scenario.ajouterEffet(new EffetApparitionTexte("Hello world"), 1);
        scenario.ajouterEffet(new EffetApparitionTexte("on va apparître le texet char par char"), 1);
        scenario.ajouterEffet(new EffetApparitionGauche("Hello world"), 1);
        scenario.ajouterEffet(new EffetApparitionTexte("On va changer de couleur du texte"), 1);
        scenario.ajouterEffet(new EffetCouleurTexte(Color.RED), 1);
        scenario.ajouterEffet(new EffetApparitionTexte("On va changer de couleur de fond"), 1);
        scenario.ajouterEffet(new EffetCouleurFond(Color.black), 1);
        scenario.ajouterEffet(new EffetApparitionTexte("On tourne de 45°..."), 1);
        scenario.ajouterEffet(new EffetRotation(Math.PI / 2.0), 1);
        scenario.ajouterEffet(new EffetApparitionTexte("On va zommer 3 fois"), 1);
        scenario.ajouterEffet(new EffetZoom(5), 3); // Zoom de 5 unités
        scenario.ajouterEffet(new EffetApparitionTexte("Terminé"), 1);

        // Jouer le scénario
        scenario.jouerScenario(monBandeau);

        monBandeau.close();
    }
    }


