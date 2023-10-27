package MonTravaille;

import java.util.ArrayList;
import java.util.List;
import bandeau.Bandeau;

public class Scenario {
    private List<Effet> effets = new ArrayList<>();

    public void ajouterEffet(Effet effet, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            effets.add(effet);
        }
    }

    public void jouerScenario(Bandeau bandeau) {
        for (Effet effet : effets) {
            effet.appliquer(bandeau);
            bandeau.sleep(1000);
        }
    }

}
