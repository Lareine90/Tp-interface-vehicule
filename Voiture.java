public class Voiture implements Vehicule{

    @Override
    public void demarrer() {

        System.out.println("La voiture demarre");
    }

    @Override
    public void arreter() {
        System.out.println("la voiture s'est arreter");

    }

    @Override
    public int getVitesseMax() {
        return 200;

    }
    
}
