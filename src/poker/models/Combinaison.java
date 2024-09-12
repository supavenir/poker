package poker.models;

import java.util.List;

public abstract class Combinaison {
    protected List<Carte> cartes;
    public Combinaison(List<Carte> cartes){
           this.cartes = cartes;
   }
   public abstract int getValeur();
   public abstract boolean estValide();
}
