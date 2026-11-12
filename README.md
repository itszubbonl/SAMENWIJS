# SAMENWIJS voor Android

**Duidelijk wat komt. Ruimte om zelf te kiezen.**

SAMENWIJS is een Nederlandstalige Android-app voor mensen met een licht verstandelijke beperking (LVB), autisme, of allebei. De app helpt bij dagelijkse structuur, afspraken, praktische vaardigheden, rust, communicatie en steun van vertrouwde mensen. De gebruiker kiest zelf welke onderdelen handig zijn.

De app is gemaakt om volwassen en respectvol te voelen. De gebruiker houdt de regie: functies zijn optioneel, teksten en gegevens zijn aanpasbaar, en delen gebeurt pas na een duidelijke keuze.

## Wat zit erin?

- **Vandaag:** eerstvolgende activiteit, voortgang en snelle knoppen voor rust, vaardigheden of hulp.
- **Mijn dag:** planning per datum, activiteit toevoegen of aanpassen, locatie en persoon noteren, activiteiten afvinken en een vorige dag kopiëren.
- **Zelfgekozen seintjes:** een herinnering 5 of 15 minuten vooraf. Android vraagt toestemming voor meldingen wanneer iemand voor het eerst een seintje instelt.
- **Vaardigheden:** stap-voor-stapkaarten over zelfzorg, eten, thuis, afspraken, onderweg, contact, geld en veiligheid. De gebruiker kan eigen stappenplannen en kleine doelen maken.
- **Mijn geld:** een zelfgekozen maandbedrag en handmatige uitgaven. Dit is alleen een lokaal overzicht; er zijn geen bankkoppelingen of betalingen.
- **Rust:** gevoelens en prikkels bijhouden, een persoonlijk rustplan, een ademhalingsklok en een korte grondoefening.
- **Samen:** persoonlijke hulpkaart, contactpersonen, eenvoudige communicatiezinnen en uitleg voor ondersteuners.
- **Toegankelijkheid:** extra grote tekst, hoog contrast, donkere kleuren, een eenvoudige startpagina en optioneel voorlezen met Android.
- **Gegevensbeheer:** lokale gegevens exporteren, of alle gegevens wissen.

## Openen en bouwen

Open deze map in Android Studio en start de app op een emulator of aangesloten Android-telefoon.

Op Windows kun je de debug-app bouwen met:

    .\gradlew.bat assembleDebug

De APK komt dan in app/build/outputs/apk/debug/app-debug.apk.

De projectinstellingen gebruiken Android Gradle Plugin 9.4.0, Gradle 9.6.0, Android SDK 37 en minimaal Android 8.0 (API 26). Android Studio heeft een passende SDK en JDK nodig. De GitHub Actions-build maakt bij elke push en pull request een debug-APK.

## Privacy

SAMENWIJS heeft geen account, internettoegang, advertenties, analytics of cloudopslag. Planning, gevoelens, doelen, budget en contactgegevens blijven in de lokale app-opslag van dit toestel. Ze worden verwijderd wanneer de app-data wordt gewist of de app wordt verwijderd.

Een hulpkaart of gegevensoverzicht wordt pas gedeeld nadat de gebruiker eerst de inhoud bekijkt en daarna op de deelknop tikt. De gebruiker kiest zelf de Android-app of persoon. Een contactknop opent alleen de telefoonkiezer; de app belt niet zelf. Seintjes worden alleen ingesteld na een keuze per activiteit en de toestemming voor Android-meldingen. De app zet toekomstige seintjes na een herstart van de telefoon terug. Android kan meldingen uitstellen.

## Grenzen en volgende stap

SAMENWIJS geeft geen medisch of financieel advies, past geen medicatie aan en doet geen betalingen. De geldfunctie is een handmatig overzicht. De app deelt niets automatisch met familie of begeleiders en synchroniseert niet tussen apparaten.

Dit is een complete eerste Android-basis, maar nog geen gevalideerd zorgproduct of Play Store-release. De begrijpelijkheid, toegankelijkheid, stappenplannen en veiligheidszinnen moeten met mensen met LVB en autisme en hun ondersteuners worden besproken en aangepast voordat de app breder wordt gebruikt.
