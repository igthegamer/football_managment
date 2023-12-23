import Football.Competition;
import Football.Equipe;
import Football.Match;
import Personne.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Competition competition = new Competition("MaCompétition");
        Scanner scanner = new Scanner(System.in);
        boolean displayMenu = true;
        int choix;
        String nomEquipe;
        String nomEntraineur;
        int ageEntraineur;
        String nomEquipeJoueur;
        String nomArbitre;
        String nomEquipeJoueurs;
        Equipe nomEquipe1 = null;
        Equipe nomEquipe2= null;
        String nomEquipeStats;

        do {
            if (displayMenu) {
                System.out.println("Menu principal :");
                System.out.println("1. Ajouter une équipe");
                System.out.println("2. Ajouter un joueur");
                System.out.println("3. Ajouter un entraîneur");
                System.out.println("4. Ajouter un arbitre");
                System.out.println("5. Ajouter un match");
                System.out.println("6. Afficher la liste des joueurs d'une équipe");
                System.out.println("7. Afficher les résultats des matchs");
                System.out.println("8.Afficher les statistiques d'une équipe\"");
                System.out.println(("9.Afficher le classement de compétiton "));
                System.out.println("0. Quitter");
                System.out.print("Choix : ");
            }
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom de l'équipe : ");
                    nomEquipe = scanner.nextLine();

                    System.out.print("Nom de l'entraîneur : ");
                    nomEntraineur = scanner.nextLine();
                    System.out.print("Âge de l'entraîneur : ");
                    ageEntraineur = scanner.nextInt();
                    scanner.nextLine();

                    Entraineur entraineur = new Entraineur(nomEntraineur, ageEntraineur);
                    Equipe equipe = new Equipe(nomEquipe, entraineur);
                    competition.addEquipe(equipe);
                    break;

                case 2:
                    System.out.print("Nom du joueur : ");
                    String nomJoueur = scanner.nextLine();

                    System.out.print("Âge du joueur : ");
                    int ageJoueur = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Numéro de maillot : ");
                    int numMaillot = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Poste du joueur : ");
                    String posteJoueur = scanner.nextLine();


                    System.out.print("Nom de l'équipe : ");
                    nomEquipeJoueur = scanner.nextLine();
                    Equipe equipeJoueur = competition.getEquipeByName(nomEquipeJoueur);

                    Joueur joueur = new Joueur(nomJoueur, ageJoueur, numMaillot, posteJoueur, equipeJoueur);
                    equipeJoueur.addTitulaire(joueur);
                    break;

                case 3:
                    // Ajouter un entraîneur
                    System.out.print("Nom de l'entraîneur : ");
                    String nomEntraineur1 = scanner.nextLine();

                    System.out.print("Âge de l'entraîneur : ");
                    int ageEntraineur1 = scanner.nextInt();
                    scanner.nextLine();

                    // Sélectionner l'équipe à laquelle ajouter l'entraîneur
                    System.out.print("Nom de l'équipe : ");
                    String nomEquipeEntraineur = scanner.nextLine();
                    Equipe equipeEntraineur = competition.getEquipeByName(nomEquipeEntraineur);

                    Entraineur nouvelEntraineur = new Entraineur(nomEntraineur1, ageEntraineur1);
                    equipeEntraineur.setEntraineur(nouvelEntraineur);
                    break;

                case 4:
                    System.out.print("Nom de l'arbitre : ");
                    nomArbitre = scanner.nextLine();

                    System.out.print("Âge de l'arbitre : ");
                    int ageArbitre = scanner.nextInt();

                    System.out.println("nb match:");
                    int nbmatch = scanner.nextInt();
                    scanner.nextLine();



                    Arbitre referee = new Arbitre(nomArbitre, ageArbitre,nbmatch);
                    competition.addArbitre(referee);
                    displayMenu = false;
                    System.out.println("Appuyez sur Entrée pour revenir au menu...");
                    displayMenu = true;
                    scanner.nextLine();
                    break;

                case 5:
                    System.out.print("Nom de l'équipe 1 : ");
                    String equipehome = scanner.nextLine();
                    Equipe equipe1 = competition.getEquipeByName(equipehome);

                    System.out.print("Nom de l'équipe 2 : ");
                    String equipeadv = scanner.nextLine();
                    Equipe equipe2 = competition.getEquipeByName(equipeadv);

                    System.out.print("Nom de l'arbitre : ");
                    String nom_Arbitre_match = scanner.nextLine();
                    Arbitre arbitre = competition.getArbitreByName(nom_Arbitre_match);


                    System.out.print("Tour (Aller/Retour) : ");
                    String tour = scanner.nextLine();

                    System.out.print("Nombre de buts de " + equipe1.getNom() + " : ");
                    int butsEquipe1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre de buts de " + equipe2.getNom() + " : ");
                    int butsEquipe2 = scanner.nextInt();
                    scanner.nextLine();

                    Match match = new Match(equipe1, equipe2, arbitre, tour, butsEquipe1, butsEquipe2);
                    competition.addMatch(match);
                    displayMenu = false;
                    System.out.println("Appuyez sur Entrée pour revenir au menu...");
                    displayMenu = true;
                    scanner.nextLine();
                    break;




                case 6:
                    System.out.print("Nom de l'équipe : ");
                    nomEquipeJoueurs = scanner.nextLine();
                    Equipe equipeJoueurs = competition.getEquipeByName(nomEquipeJoueurs);
                    equipeJoueurs.Affiche();
                    displayMenu = false;
                    System.out.println("Appuyez sur Entrée pour revenir au menu...");
                    displayMenu = true;
                    scanner.nextLine();
                    break;

                case 7:
                    System.out.print("Nom de l'équipe 1 : ");
                    String nomEquipe_domicile = scanner.nextLine();
                    Equipe equipe11 = competition.getEquipeByName(nomEquipe_domicile);

                    System.out.print("Nom de l'équipe 2 : ");
                    String nomEquipe_exterieur = scanner.nextLine();
                    Equipe equipe22 = competition.getEquipeByName(nomEquipe_exterieur);
//


//

                    competition.rechercheRencontre(equipe11, equipe22);
                    displayMenu = false;
                    System.out.println("Appuyez sur Entrée pour revenir au menu...");
                    displayMenu = true;
                    scanner.nextLine();
                    break;

                case 8:
                    System.out.print("Nom de l'équipe : ");
                    nomEquipeStats = scanner.nextLine();
                    Equipe equipeStats = competition.getEquipeByName(nomEquipeStats);
                    equipeStats.afficherStatistiques();
                    displayMenu = false;
                    System.out.println("Appuyez sur Entrée pour revenir au menu...");
                    displayMenu = true;
                    scanner.nextLine();
                    break;
                case 9:
                    competition.classement();
                    displayMenu = false;
                    System.out.println("Appuyez sur Entrée pour revenir au menu...");
                    displayMenu = true;
                    scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    displayMenu = false;
            }

        } while (choix != 0);
    }
}

