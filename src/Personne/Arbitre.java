package Personne;

public class Arbitre extends personne{
    private int nbMatches;

    public Arbitre(String nom, int age, int nbMatches) {
        super(nom, age);
        this.nbMatches = nbMatches;
    }

    @Override
    public void Afficher() {
        System.out.println("Arbitre:"+ nom +",Age:"+ age+", Matches dirigés:" +nbMatches);

    }



    public void IncementNbMatches(){
        nbMatches++;
    }
    public String getNom(){
        return nom;
    }
    public int retrieveArbitreAgeByName(){
        return age;
    }

}
