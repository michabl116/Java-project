package Task_4;
public class Tapahtuma implements Comparable<Tapahtuma> {
    private int aika; // Tapahtuman ajankohta
    private Tapahtumatyyppi tyyppi;

    public Tapahtuma(int aika, Tapahtumatyyppi tyyppi) {
        this.aika = aika;
        this.tyyppi = tyyppi;
    }

    public int getAika() { // Palauttaa tapahtuman ajan
        return aika;
    }

    public Tapahtumatyyppi getTyyppi() { // Palauttaa tapahtuman tyypin
        return tyyppi;
    }

    @Override
    public int compareTo(Tapahtuma toinen) {
        return Integer.compare(this.aika, toinen.aika);
    }

    @Override
    public String toString() {
        return "Tapahtuma: " + tyyppi + " ajankohtana " + aika;
    }
}