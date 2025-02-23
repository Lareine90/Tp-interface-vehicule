public class moto implements Vehicule {
    @Override
    public void demarrer() {

        System.out.println("La moto demarre");
    }

    @Override
    public void arreter() {
        System.out.println("La moto s'est arreter");

    }

    @Override
    public int getVitesseMax() {
        return 180;

    }
    
}
