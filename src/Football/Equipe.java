package Football;

import Personne.Entraineur;
import Personne.Joueur;

import java.util.ArrayList;

public class Equipe {
    public String nom;
    private ArrayList<Joueur> titulaires;
    private ArrayList<Joueur> remplacants;
    private Entraineur entraineur;
    private int victoires;
    private int defaites;
    private int nulles;
    private int points;

    public Equipe(String nom, Entraineur entraineur) {
        this.nom = nom;
        this.entraineur = entraineur;
        this.titulaires = new ArrayList<>();
        this.remplacants = new ArrayList<>();
        this.victoires = 0;
        this.defaites = 0;
        this.nulles = 0;
        this.points = 0;
    }
    public void addTitulaire(Joueur joueur){
        titulaires.add(joueur);
    }
    public void addRemplacant(Joueur joueur) {
        remplacants.add(joueur);
    }
    public void setEntraineur(Entraineur entraineur) {
        this.entraineur = entraineur;
    }
    void setPoints() {
        points = 3 * victoires + nulles;
    }

    public void deleteJoueur(Joueur joueur) {
        titulaires.remove(joueur);
        remplacants.remove(joueur);
    }
    public void Affiche() {
        System.out.println("Liste des Joueurs Titulaires de l'équipe " + nom + ":");
        for (Joueur titulaire : titulaires) {
            titulaire.Afficher();
        }

        System.out.println("\nListe des Joueurs Remplaçants de l'équipe " + nom + ":");
        for (Joueur remplacant : remplacants) {
            remplacant.Afficher();
        }
    }
    public void afficherStatistiques() {
        System.out.println("Statistiques de l'équipe " + nom + ":");
        System.out.println("Nombre de matchs gagnés: " + victoires);
        System.out.println("Nombre de matchs nuls: " + nulles);
        System.out.println("Nombre de matchs perdus: " + defaites);
        System.out.println("Nombre de points: " + points);
    }
    public void incrementVictoires() {
        victoires++;
        setPoints();
    }
    public void incrementDefaites() {
        defaites++;
    }
    public void incrementNulles() {
        nulles++;
        setPoints();
    }
    public boolean existeJoueur(String nomJoueur) {
        for (Joueur titulaire : titulaires) {
            if (titulaire.getNom().equals(nomJoueur)) {
                return true;
            }
        }

        for (Joueur remplacant : remplacants) {
            if (remplacant.getNom().equals(nomJoueur)) {
                return true;
            }
        }

        return false;
    }
    public boolean existeNumMaillot(int numMaillot) {
        for (Joueur titulaire : titulaires) {
            if (titulaire.getNumMaillot() == numMaillot) {
                return true;
            }
        }

        for (Joueur remplacant : remplacants) {
            if (remplacant.getNumMaillot() == numMaillot) {
                return true;
            }
        }

        return false;
    }
    public Joueur getJoueurByName(String nomJoueur) {
        for (Joueur titulaire : titulaires) {
            if (titulaire.getNom().equals(nomJoueur)) {
                return titulaire;
            }
        }

        for (Joueur remplacant : remplacants) {
            if (remplacant.getNom().equals(nomJoueur)) {
                return remplacant;
            }
        }

        return null;
    }
    public ArrayList<Joueur> getTitulaires() {
        return titulaires;
    }

    public ArrayList<Joueur> getRemplacants() {
        return remplacants;
    }

    public Entraineur getEntraineur() {
        return entraineur;
    }

    public int getPoints() {
        return points;
    }
    public String getNom() {
        return nom;
    }
}
