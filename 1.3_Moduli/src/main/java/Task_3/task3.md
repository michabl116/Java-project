# Miksi Singleton-oliota ei voi luoda new-operaatiolla?
- Singleton-luokassa konstruktori määritetään private, mikä estää muita luokkia luomasta uusia instansseja suoraan new-operaatiolla.
- Vain Singleton-luokka itse voi käyttää konstruktoriaan.
- Sen sijaan, että sallittaisiin useita instansseja, Singleton-luokka tarjoaa staattisen metodin (getInstance()), joka palauttaa ainoan olemassa olevan instanssin.
- Jos instanssia ei ole vielä luotu, metodi alustaa sen.
- Piilottamalla konstruktori ja hallitsemalla instanssin luontia luokan sisällä estetään useiden instanssien luominen vahingossa.
