package Task_4;



public class Main {
    public static void main(String[] args) {
        Tapahtumalista tapahtumalista = new Tapahtumalista();

        // Lisää tapahtumia listaan
        tapahtumalista.lisaaTapahtuma(new Tapahtuma(5, Tapahtumatyyppi.SAAPUMINEN));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma(10, Tapahtumatyyppi.SAAPUMINEN));
        tapahtumalista.lisaaTapahtuma(new Tapahtuma(15, Tapahtumatyyppi.POISTUMINEN));

        // Käsitellään ensimmäinen tapahtuma
        System.out.println("Käsitellään tapahtuma: " + tapahtumalista.seuraavaTapahtuma());

        // Tulostetaan jäljellä olevat tapahtumat järjestyksessä
        System.out.println("Jäljellä olevat tapahtumat:");
        tapahtumalista.tulostaTapahtumat();
    }
}