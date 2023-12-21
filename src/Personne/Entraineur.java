package Personne;

import Football.Equipe;

public class Entraineur extends personne {
    private Equipe equipe;

    public Entraineur(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void Afficher() {
        System.out.println("Entraîneur : " + nom + ", Age : " + age + ", Équipe : " + equipe.getNom());

    }

    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }
    public String getNom(){
        return nom;
    }
}
