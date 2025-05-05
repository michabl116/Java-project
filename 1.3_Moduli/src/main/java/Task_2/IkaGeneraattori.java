package Task_2;
import java.util.*;

public class IkaGeneraattori {
    public static void main(String[] args) {
        // Määritetään useita testijakaumia
        Map<Integer, Integer>[] testijakaumat = new HashMap[3];

        // Ensimmäinen testijakauma
        testijakaumat[0] = new HashMap<>();
        testijakaumat[0].put(18, 50);
        testijakaumat[0].put(19, 120);
        testijakaumat[0].put(20, 200);
        testijakaumat[0].put(21, 180);
        testijakaumat[0].put(22, 150);
        testijakaumat[0].put(23, 100);
        testijakaumat[0].put(24, 80);
        testijakaumat[0].put(25, 50);
        testijakaumat[0].put(26, 30);
        testijakaumat[0].put(27, 20);
        testijakaumat[0].put(28, 10);
        testijakaumat[0].put(29, 10);

        // Toinen testijakauma (enemmän nuoria)
        testijakaumat[1] = new HashMap<>();
        testijakaumat[1].put(18, 200);
        testijakaumat[1].put(19, 180);
        testijakaumat[1].put(20, 150);
        testijakaumat[1].put(21, 100);
        testijakaumat[1].put(22, 80);
        testijakaumat[1].put(23, 50);
        testijakaumat[1].put(24, 30);
        testijakaumat[1].put(25, 20);
        testijakaumat[1].put(26, 10);
        testijakaumat[1].put(27, 5);
        testijakaumat[1].put(28, 3);
        testijakaumat[1].put(29, 2);

        // Kolmas testijakauma (enemmän vanhempia)
        testijakaumat[2] = new HashMap<>();
        testijakaumat[2].put(18, 10);
        testijakaumat[2].put(19, 20);
        testijakaumat[2].put(20, 30);
        testijakaumat[2].put(21, 50);
        testijakaumat[2].put(22, 80);
        testijakaumat[2].put(23, 100);
        testijakaumat[2].put(24, 150);
        testijakaumat[2].put(25, 180);
        testijakaumat[2].put(26, 200);
        testijakaumat[2].put(27, 120);
        testijakaumat[2].put(28, 50);
        testijakaumat[2].put(29, 30);

        // Suoritetaan testit eri jakaumilla
        for (int i = 0; i < testijakaumat.length; i++) {
            System.out.println("\nTesti jakaumalla " + (i + 1) + ":");
            List<Integer> generoidutIat = generoiIat(testijakaumat[i], 1000);
            naytaTulokset(generoidutIat);
        }
    }

    /**
     * Generoi ikälistan annetun jakauman perusteella.
     */
    public static List<Integer> generoiIat(Map<Integer, Integer> ikaJakauma, int maara) {
        // Luodaan painotettu lista iästä
        List<Integer> painotetutIat = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : ikaJakauma.entrySet()) {
            int ika = entry.getKey();
            int esiintymiset = entry.getValue();
            for (int i = 0; i < esiintymiset; i++) {
                painotetutIat.add(ika);
            }
        }

        // Generoidaan satunnaiset arvot jakauman mukaisesti
        Random random = new Random();
        List<Integer> generoidutIat = new ArrayList<>();
        for (int i = 0; i < maara; i++) {
            int satunnainenIndeksi = random.nextInt(painotetutIat.size());
            generoidutIat.add(painotetutIat.get(satunnainenIndeksi));
        }

        return generoidutIat;
    }

    /**
     * Näyttää generoituja ikätuloksia.
     */
    public static void naytaTulokset(List<Integer> generoidutIat) {
        // Lasketaan esiintymiskerrat kullekin iälle
        Map<Integer, Integer> ikaLaskuri = new HashMap<>();
        for (int ika : generoidutIat) {
            ikaLaskuri.put(ika, ikaLaskuri.getOrDefault(ika, 0) + 1);
        }

        // Näytetään generoitu jakauma
        System.out.println("Generoitu jakauma:");
        for (Map.Entry<Integer, Integer> entry : ikaLaskuri.entrySet()) {
            System.out.println("Ikä " + entry.getKey() + ": " + entry.getValue() + " kertaa");
        }

        // Näytetään ensimmäiset 20 generoituja ikää
        System.out.println("Ensimmäiset 20 generoituja ikää: " + generoidutIat.subList(0, 20));
    }
}