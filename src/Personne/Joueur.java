package Personne;

import Football.Equipe;

public class Joueur extends personne{
    private int numMaillot;
    private String poste;
    private Equipe equipe;


    public Joueur(String nom, int age, int numMaillot, String poste, Equipe equipe) {
        super(nom, age);
        this.numMaillot = numMaillot;
        this.poste = poste;
        this.equipe = equipe;
    }



    @Override
    public void Afficher() {
        System.out.println("Joueur : " + nom + ", Age : " + age + ", Numéro de maillot : " + numMaillot +
                ", Poste : " + poste + ", Équipe : " + equipe.getNom());
    }

    public void setNumMaillot(int x){
        this.numMaillot = x;
    }
    public void setPoste(String p){
        this.poste = p;
    }
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
        public int getNumMaillot(){
            return numMaillot;
        }
    public Equipe getEquipe(){
        return equipe;
    }
    public String getNom(){
        return nom;
    }
}
