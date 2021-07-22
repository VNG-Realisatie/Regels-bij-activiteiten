# Regels bij activiteiten

![lint oas](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/lint-oas/badge.svg)
![generate sdks](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/generate-sdks/badge.svg)
![generate postman collection](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/generate-postman-collection/badge.svg)

Deze API is relevant bij uitvoering van de Omgevingswet, i.h.b. bij het opstellen en onderhouden van zgn. toepasbare regels. Het verschaft de toepasbare regelmaker actuele informatie over de juridische regels en bijbehorende werkingsgebieden en activiteiten waarvoor toepasbare regels opgesteld of aangepast gaan worden.  
De API maakt het mogelijk om gegevens op te vragen, bij een applicatie die invulling geeft aan de Omgevingswetbeleidcomponent, ook wel aangeduid als plansoftware, over (Omgevingswet-)activiteiten en/of (bijbehorende) juridische regels, regelteksten en locaties. Die gegevens maken deel uit van de vastlegging van omgevingsdocumenten, zoals een omgevingsplan, met genoemde applicatie. Het betreft regels en annotaties zoals die op het moment van opvragen vastgelegd zijn (in de plansoftware); er kan dus sprake zijn van nog niet vastgestelde of gepubliceerde gegevens. Het betreft dan bijvoorbeeld een beoogde wijziging van een omgevingsplan.  
Beoogd gebruik is vooral het inzicht krijgen in activiteiten en bijbehorende regels en locaties door een applicatie die invulling geeft aan de Toepasbare regelscomponent, ook wel aangeduid als toepasbare regelsoftware, t.b.v. het kunnen opstellen en aanpassen van toepasbare regels.  
Naast het **gebruik als API** is ook voorzien in het gebruik van de specificaties om **bestandsuitwisseling** van genoemde gegevens mogelijk te maken van plansoftware naar toepasbare regelsoftware.

## Voor wie is dit van belang?
Belanghebbenden ('stakeholders') zijn ten eerste de gebruikers van plansoftware en van toepasbare regelssoftware die in samenhang juridische en toepasbare regels opstellen en beheren. Dit betreft organisaties die bevoegd zijn om omgevingsdocumenten, zoals omgevingsplannen, op te stellen: de bevoegde gezagen i.c. gemeenten, waterschappen, provincies en rijksoverheidsdepartementen, en organisaties waaraan zij het opstellen en wijzigen van die regels hebben uitbesteed, zoals (ruimtelijk) adviesburo's en rijksoverheidsorganisaties (zoals Rijkswaterstaat).  
De tweede groep belanghebbenden zijn de leveranciers van plansoftware en van toepasbare regelssoftware aangezien deze software het gebruik van de API mogelijk moet maken.  
Daarnaast zijn belanghebbend de koepelorganisaties van genoemde bevoegde gezagen (VNG, UvW resp. IPO) teneinde te borgen dat hun leden kunnen beschikken over de mogelijkheden die deze API beoogd te bieden.  
Tot slot is de VNG tevens belanghebbende als beheerder van de API namens genoemde koepelorganisaties.  

## Positie in GEMMA
De API ontsluit het register dat beheerd wordt met de (referentiecomponent) [Omgevingswetbeleidcomponent](https://www.gemmaonline.nl/index.php/Omgevingswet/1.5/id-482b112b-dc5e-49b6-879c-a22f22cb6941) v.w.b. activiteiten en daarbij behorende regels. Ofschoon elke applicatie gebruik kan maken van deze API is het gebruik daarvan gericht op de (referentiecomponent) [Toepasbare regelscomponent](https://www.gemmaonline.nl/index.php/Omgevingswet/1.5/id-7f053bcc-9558-41ce-8a17-d3fa81fb7c17). Beide componenten zijn uitgewerkt in de GEMMA-deelarchitectuur '[Gemeentelijke applicatie-architectuur Omgevingswet](https://www.gemmaonline.nl/index.php/GAO_-_De_referentiecomponenten_voor_de_Omgevingswet)'.  

## Compliancy cq. conformiteit
Deze standaard is officieel gepubliceerd als versie 1.0 en is kaderstellend voor de bedoelde informatie-uitwisseling. Onderkend wordt dat er nog geen ervaring is met het gebruik van deze standaard en het uitvoeren van de Omgevingswet met deze en andere standaarden nog volop in ontwikkeling is. Voortschrijdend inzicht en praktijkervaringen worden in volgende versies verwerkt zoals dat bij het beheer van standaarden gebruikelijk is.  
Voor het voldoen van applicaties aan deze versie van de standaard betekent dit het volgende.  
Een applicatie ('plansoftware') die invulling geeft aan de Omgevingswetbeleidcomponent is in staat om als provider de API te ondersteunen en/of conform de API-specificaties een bestand te exporteren (t.b.v. bestandsuitwisseling) dan wel een daaraan gelijkwaardige leverancierseigen oplossing te bieden voor bestandsexport mits daarbij de software-keuzes van afnemers gerespecteerd worden.  
Een applicatie ('toepasbare regelsoftware') die invulling geeft aan de Toepasbare regelscomponent is in staat om als consumer de API te ondersteunen en/of een bestand te importeren dat conform de API-specificaties is ingericht (i.v.m. bestandsuitwisseling) dan wel een gelijkwaardige leverancierseigen oplossing te bieden voor bestandsimport mits daarbij de software-keuzes van afnemers gerespecteerd worden.  
Dus, als de leverancier de standaard als provider of consumer nog niet ondersteunt en nog geen leverancierseigen oplossing kan bieden voor de door de klant gebruikte te koppelen consumer- resp. provider-software, dan dient ze koppeling met die software mogelijk te maken door het alsnog gaan ondersteunen van de standaard als provider resp. consumer dan wel door het alsnog bieden van een leverancierseigen oplossing voor bestandsuitwisseling met die software.  
Deze compliancy-afspraken waarborgen dat een hierboven, als eerste, genoemde belanghebbende haar eigen keuzes kan maken voor plansoftware en voor toepasbare regelsoftware waarbij  interoperabiliteit daartussen gegarandeerd is. Het waarborgt verder dat software-leveranciers vooralsnog met technisch relatief eenvoudige oplossingen in interoperabiliteit kunnen voorzien wat onevenredige investeringen in software-ontwikkeling voorkomt gezien de beperkte mate van volwassenheid waarin het Omgevingswetdomein zich nog bevindt.   


## Toelichting op bestandsuitwisseling
In de bestanden openapi.json en openapi_draft4.json zijn twee (functioneel gelijke) varianten van het json-schema te vinden. Dit kan toegepast worden bij bestandsuitwisseling. In deze bestanden komen de hal-specifieke componenten uit openapi.yaml niet voor. Bij bestandsuitwisseling maken we in tegenstelling tot berichtuitwisseling dus geen gebruik van de hal standaard.

Zonder selectie resulteert het opvragen als bestand in het opnemen van alle regelteksten en bijbehorende annotaties (locaties, 'juridische regels voor iedereen', activiteiten e.d. zoals beheerd in de plansoftware) of bijvoorbeeld alle locaties. Selectie van de te verkrijgen gegevens is echter wel mogelijk:  
- de regelteksten en bijbehorende annotaties van een specifiek omgevingsdocument;  
- de regelteksten en bijbehorende annotaties van één of meer activiteiten;  
- de regelteksten en bijbehorende annotaties van een specifiek werkpakket (element van regeltekst).  

Default worden alle regelteksten, ook die vervallen zijn, in het bestand opgenomen. Geselecteerd kan worden dat alleen niet-vervallen regelteksten opgenomen worden. 
  
Voor de inhoud van een dergelijk bestand gelden enkele aanvullende afspraken:  
- Van een activiteit die deel uitmaakt van de selectie (van gewenste gegevens) worden tevens de bovenliggende activiteit(en) met bijbehorende 'juridische regels (voor iedereen)' en regelteksten geleverd. Dit gaat tot aan de (bovenliggende landelijke) activiteit op het tweede niveau in de functionele structuur (zoals "nl.imow-mnre1034.activiteit.ActInOmgevingsplan").
- Van een activiteit worden wel de Id’s van gerelateerde activiteiten geleverd maar niet de gegevens daarvan (tenzij de gerelateerde activiteit tot de selectie behoort).  
- Indien één of meer activiteiten geselecteerd zijn, dan worden van de daarbij behorende 'juridische regels voor iedereen' alleen de activiteitlocatieaanduidingen bij die activiteiten (en de bovenliggende activiteiten) geleverd, niet de activiteitlocatieaanduidingen naar andere activiteiten.   
- De als embedded gespecificeerde gegevens worden in de bestandsuitwisseling niet als embedded opgenomen. Gerelateerde gegevens worden opgenomen in de desbetreffende resources waarnaar m.b.v. de ID verwezen wordt. 

Bij bestandsuitwisseling wordt het RD/Amersfoort(EPSG:28992) coördinatenstelsel gebruikt. 
  
Zie ter illustratie van één en ander het [voorbeeldbestand](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/tree/main/voorbeelden/bestandsuitwisseling).  

## Privacy en Security

De gegevens die middels deze API worden uitgewisseld zijn niet privacygevoelig. Geen van de gegevens die met deze API worden uitgewisseld hebben betrekking op personen of kunnen naar personen herleid worden.

Aangezien deze API binnengemeentelijk berichtenverkeer van niet privacygevoelige gegevens betreft worden er geen aanvullende security eisen gesteld.

## Documentatie
* [Technische specificaties van de **unresolved** versie](./specificatie/openapi.yaml) (Open API versie)
* Specificaties van de actuele productie versie (resolved) in [Swagger-formaat](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/specificatie/genereervariant/openapi.yaml)
* Download de [JSON Schema versie van de technische specificatie t.b.v. bestandsuitwisseling](./specificatie/openapi.json) (JSON Schema versie t.b.v. bestandsuitwisseling)
* Download de [JSON Schema draft 04 versie van de technische specificatie t.b.v. bestandsuitwisseling](./specificatie/openapi_draft04.json) (JSON Schema draft 04 versie t.b.v. bestandsuitwisseling)
* Download [client code](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/tree/master/code)

* Ontwerpkeuzes staan in de [ontwerpbeslissingen](./docs/ontwerpbeslissingen.md)
  Voor nu: opmerkingen, vragen, verbetervoorstellen e.d. graag als [issues](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues) in deze repository.

## Bronnen
* [API strategie en URI strategie](https://aandeslagmetdeomgevingswet.nl/digitaal-stelsel/documenten/documenten/api-uri-strategie/)

## Contactpersonen:
* Product Owner a.i.: Arjan Kloosterboer arjan.kloosterboer@vng.nl
* Berichtontwerpers: Robert Melskens robert.melskens@vng.nl, Johan Boer johan.boer@vng.nl

## Licentie
Copyright &copy; VNG Realisatie 2018
Licensed under the [EUPL](../LICENCE.md)
