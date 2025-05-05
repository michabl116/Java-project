package Task_5;

public class ClockTest {
    public static void main(String[] args) {
        // Haetaan kellon ainoa instanssi
        Clock kello = Clock.getInstance();

        // Näytetään kellon alkuperäinen aika
        System.out.println("Kellon alkuperäinen aika: " + kello.getAika());

        // Muutetaan kellon aikaa
        kello.setAika(1678900000000L); // Asetetaan uusi satunnainen aika
        System.out.println("Uusi kellon aika: " + kello.getAika());

        // Haetaan toinen instanssi ja varmistetaan, että se on sama
        Clock toinenKello = Clock.getInstance();
        System.out.println("Aika toisesta instanssista: " + toinenKello.getAika());

        // Varmistetaan, että molemmat instanssit ovat samat
        System.out.println("Ovatko instanssit samat? " + (kello == toinenKello));
    }
}
