package poker.models;

public class Carte implements Comparable<Carte>{
    public static final String[] names=new String[]{"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"};
    private Couleur couleur;
    private int valeur;

    public Carte (Couleur couleur, int valeur){
        this.couleur = couleur;
        this.valeur = valeur;
    }
    public Couleur getCouleur(){
        return couleur;
    }
    public int getValeur(){
        return valeur;
    }
    public String getNom(){
        return names[valeur];
    }
    @Override
    public String  toString(){
        return getNom()+" de "+couleur;
    }

    @Override
    public int compareTo(Carte o) {
        return Integer.valueOf(valeur).compareTo(o.valeur);
    }
}
