package poker.models;

import poker.models.interfaces.IPaire;

import java.util.List;

public class Paire extends Combinaison implements IPaire {
    public Paire(List<Carte> cartes) {
        super(cartes);
    }

    @Override
    public int getValeur() {
        return 0;
    }

    @Override
    public boolean estValide() {
        return false;
    }

    @Override
    public boolean aPaire() {
        return false;
    }
}
