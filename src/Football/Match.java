package Football;

import Personne.Arbitre;

import java.util.concurrent.ThreadLocalRandom;

public class Match {
    private Equipe equipe1;
    private Equipe equipe2;
    private int nombreButEquipe1;
    private int nombreButEquipe2;
    private Arbitre arbitre;
    private String tour;

    public Match(Equipe equipe1, Equipe equipe2, Arbitre arbitre, String tour) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.arbitre = arbitre;
        this.tour = tour;

        this.nombreButEquipe1 = ThreadLocalRandom.current().nextInt(0, 11);
        this.nombreButEquipe2 = ThreadLocalRandom.current().nextInt(0, 11);

        if (nombreButEquipe1 > nombreButEquipe2) {
            equipe1.incrementVictoires();
            equipe2.incrementDefaites();
        } else if (nombreButEquipe1 < nombreButEquipe2) {
            equipe1.incrementDefaites();
            equipe2.incrementVictoires();
        } else {
            equipe1.incrementNulles();
            equipe2.incrementNulles();
        }

        equipe1.setPoints();
        equipe2.setPoints();
    }

    public Match(Equipe equipe1, Equipe equipe2, Arbitre arbitre, String tour, int nombreButEquipe1, int nombreButEquipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.arbitre = arbitre;
        this.tour = tour;
        this.nombreButEquipe1 = nombreButEquipe1;
        this.nombreButEquipe2 = nombreButEquipe2;

        if (nombreButEquipe1 > nombreButEquipe2) {
            equipe1.incrementVictoires();
            equipe2.incrementDefaites();
        } else if (nombreButEquipe1 < nombreButEquipe2) {
            equipe1.incrementDefaites();
            equipe2.incrementVictoires();
        } else {
            equipe1.incrementNulles();
            equipe2.incrementNulles();
        }

        equipe1.setPoints();
        equipe2.setPoints();
    }

    public void afficheMatch() {
        System.out.println(tour + ": " + equipe1.getNom() + " " + nombreButEquipe1 + "-" + nombreButEquipe2 + " " + equipe2.getNom());
        System.out.println("Arbitre: " + arbitre.getNom());
    }

    public void afficheResultat() {
        System.out.println(tour + ": " + equipe1.getNom() + " " + nombreButEquipe1 + "-" + nombreButEquipe2 + " " + equipe2.getNom());
    }


    public Equipe getEquipe1() {
        return equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public String getTour() {
        return tour;
    }
}
