package Task_6;

public class Clock {
    private static Clock instanssi; // Singleton-instanssi
    private long nykyinenAika; // Nykyinen kellonaika

    private Clock() {
        this.nykyinenAika = System.currentTimeMillis(); // Alustetaan nykyisellä ajalla
    }

    public static Clock getInstance() {
        if (instanssi == null) {
            instanssi = new Clock();
        }
        return instanssi;
    }

    public void setAika(long uusiAika) { // Metodi ajan muuttamiseen
        this.nykyinenAika = uusiAika;
    }

    public long getAika() { // Metodi nykyisen ajan hakemiseen
        return nykyinenAika;
    }
}