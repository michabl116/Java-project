package Task_4;

import java.util.PriorityQueue;

public class Tapahtumalista {
    private PriorityQueue<Tapahtuma> tapahtumajono = new PriorityQueue<>();

    // Lisää tapahtuman listaan
    public void lisaaTapahtuma(Tapahtuma tapahtuma) {
        tapahtumajono.add(tapahtuma);
    }

    // Hakee ja poistaa seuraavan tapahtuman käsittelyä varten
    public Tapahtuma seuraavaTapahtuma() {
        return tapahtumajono.poll();
    }

    // Tulostaa tapahtumat aikajärjestyksessä
    public void tulostaTapahtumat() {
        tapahtumajono.stream()
                .sorted((t1, t2) -> Integer.compare(t1.getAika(), t2.getAika()))
                .forEach(System.out::println);
    }
}