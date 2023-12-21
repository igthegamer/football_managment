package Personne;

public abstract class personne {
    protected String nom;
    protected int age;

    public personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
public abstract void Afficher();

}
