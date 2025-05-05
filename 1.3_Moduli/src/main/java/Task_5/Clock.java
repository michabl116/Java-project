
package Task_5;
public class Clock {
    // Luokan ainoa instanssi
    private static Clock instanssi;

    // Muuttuja nykyisen ajan tallentamiseen (millisekunteina ohjelman alusta)
    private long nykyinenAika;

    // Yksityinen konstruktori estää ulkoisen instanssien luonnin
    private Clock() {
        this.nykyinenAika = System.currentTimeMillis(); // Alustetaan nykyisellä ajalla
    }

    // Julkinen metodi ainoan instanssin hakemiseen
    public static Clock getInstance() {
        if (instanssi == null) {
            instanssi = new Clock();
        }
        return instanssi;
    }

    // Metodi kellon ajan asettamiseen
    public void setAika(long uusiAika) {
        this.nykyinenAika = uusiAika;
    }

    // Metodi kellon nykyisen ajan hakemiseen
    public long getAika() {
        return nykyinenAika;
    }
}