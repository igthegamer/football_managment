package Football;

import Personne.Arbitre;
import Personne.Entraineur;

import java.util.ArrayList;

public class Competition {
    private String nom;
    private ArrayList<Equipe> equipes;
    private ArrayList<Match> matchs;
    private ArrayList<Arbitre> arbitres;
    private ArrayList<Entraineur> entraineurs;

    public Competition(String nom) {
        this.nom = nom;
        this.equipes = new ArrayList<>();
        this.matchs = new ArrayList<>();
        this.arbitres = new ArrayList<>();
        this.entraineurs = new ArrayList<>();
    }

    public void addEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void addMatch(Match match) {
        matchs.add(match);
    }

    public void addArbitre(Arbitre referee) {
        arbitres.add(referee);
    }

    public void addEntraineur(Entraineur entraineur) {
        entraineurs.add(entraineur);
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public ArrayList<Arbitre> getArbitres() {
        return arbitres;
    }

    public ArrayList<Match> getMatchs() {
        return matchs;
    }

    public ArrayList<Entraineur> getEntraineurs() {
        return entraineurs;
    }

    public void rechercheRencontre(Equipe equipe1, Equipe equipe2) {
        for (Match match : matchs) {
            if ((match.getEquipe1() == equipe1 && match.getEquipe2() == equipe2) ||
                    (match.getEquipe1() == equipe2 && match.getEquipe2() == equipe1)) {
                match.afficheMatch();
            }
        }
    }

    public Arbitre getArbitreByName(String nom) {
        for (Arbitre arbitre : arbitres) {
            if (arbitre.getNom().equals(nom)) {
                return arbitre;
            }
        }
        return null;
    }

    public Equipe getEquipeByName(String nom) {
        for (Equipe equipe : equipes) {
            if (equipe.getNom().equals(nom)) {
                return equipe;
            }
        }
        return null;
    }

    public Entraineur getEntraineurByName(String nom) {
        for (Entraineur entraineur : entraineurs) {
            if (entraineur.getNom().equals(nom)) {
                return entraineur;
            }
        }
        return null;
    }

    private boolean verif(String nom, ArrayList<Equipe> aux) {
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).getNom().equals(nom))
                return true;
        }
        return false;
    }

    public void classement() {
        ArrayList<Equipe> aux = new ArrayList<>();
        int min = 0;
        Equipe temp = null;
        for (int j = 0; j < equipes.size(); j++) {
            min = 0;
            temp = null;
            for (int i = 0; i < equipes.size(); i++) {
                if ((equipes.get(i).getPoints() >= min) && (!verif(equipes.get(i).getNom(), aux))) {
                    temp = equipes.get(i);
                    min = equipes.get(i).getPoints();
                }
            }
            aux.add(temp);
        }
        for (int i = 0; i < aux.size(); i++) {
            System.out.println((i + 1) + "   " + aux.get(i).getNom() + "   " + aux.get(i).getPoints());
        }
        aux = null;
    }
}
