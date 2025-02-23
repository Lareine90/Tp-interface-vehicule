public class Velo implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("Le velo demarre");

    }

    @Override
    public void arreter() {
        System.out.println("Le velo s'est arreter");

    }

    @Override
    public int getVitesseMax() {
        return 30;

    }

    
}
