public class App {
    public static void main(String[] args) throws Exception {
        Voiture V1 = new Voiture();
        moto m1 = new moto();
        Velo vel1 = new Velo();

        V1.demarrer();
        V1.arreter();
        System.out.println("vitesse voitute : "+ V1.getVitesseMax());
        System.out.println("****************");

        m1.demarrer();
        m1.arreter();
        System.out.println("vitesse moto  : "+ m1.getVitesseMax());
        System.out.println("****************");

        vel1.demarrer();
        vel1.arreter();
        System.out.println("vitesse velo : "+ vel1.getVitesseMax());
        System.out.println("****************");


    }
}
