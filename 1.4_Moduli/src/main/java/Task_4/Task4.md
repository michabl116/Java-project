```pseudocode
while (tulevia tapahtumia on ja nykyinen aika < maksimi) {
    // VAIHE A: Päivitä järjestelmän tila
    käsitteleSaapumiset();  // uudet asiakkaat
    käsitteleLähdöt();      // asiakkaat, jotka poistuvat palvelusta

    // VAIHE B: Järjestelmän logiikka
    jaaAsiakkaitaPalvelimille();  // jos vapaita palvelimia on ja jono ei ole tyhjä

    // VAIHE C: Päivitä suorituskykymittarit
    päivitäSuorituskykytiedot(); // aika järjestelmässä, käyttöasteet, jne.

    siirrySeuraavaanTapahtumaan(); // etene seuraavaan tapahtumahetkeen
}
```

Jokainen vaihe tekee oman osansa:
- **Vaihe A**: Saapumis- ja lähtötapahtumat
- **Vaihe B**: Palvelinlogiikka
- **Vaihe C**: Mittareiden keruu ja tilastot
