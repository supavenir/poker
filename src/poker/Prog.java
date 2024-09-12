package poker;

import poker.models.Carte;
import poker.models.Couleur;

import java.util.stream.IntStream;

public class Prog {
    public static void main(String[] args) {
        IntStream.range(0,Carte.names.length).forEach(
                n->{
                    Carte c=new Carte(Couleur.Carreau,n);
                    System.out.println(c);
                }
        );

    }
}
