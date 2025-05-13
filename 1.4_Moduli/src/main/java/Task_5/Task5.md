## Vaihe A – Saapumis- ja lähtötapahtumien käsittely

```pseudocode
if (tapahtuma on SaapumisTapahtuma) {
    simulaattori.kasitteleSaapuminen(tapahtuma);
}
if (tapahtuma on LahtoTapahtuma) {
    simulaattori.kasitteleLahto(tapahtuma);
}
```

## Vaihe B – Asiakkaiden jakaminen palvelimille

```pseudocode
for (palvelin jokaisessa palvelinListassa) {
    if (palvelin on vapaa JA jono ei ole tyhjä) {
        asiakas = jono.otaJonosta();
        palvelin.aloitaPalvelu(asiakas);
    }
}
```

## Vaihe C – Tilastojen päivitys

```pseudocode
tilastot.paivitaAsiakastiedot(asiakas);
tilastot.paivitaKayttoaste(palvelin);
```