package poker.models;

public enum Couleur {
    Pique("Pique"),Coeur("Cœur"),Carreau("Carreau"),Trefle("Trèfle");
    private String name;

    Couleur(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
