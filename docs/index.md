---
layout: page-with-side-nav
title: Releasecandidate Regels bij activiteiten
---

# Regels bij activiteiten

![lint oas](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/lint-oas/badge.svg)
![generate sdks](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/generate-sdks/badge.svg)
![generate postman collection](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/generate-postman-collection/badge.svg)

Deze API is relevant bij uitvoering van de Omgevingswet, i.h.b. bij het opstellen en onderhouden van zgn. toepasbare regels. Het verschaft de toepasbare regelmaker actuele informatie over de juridische regels en bijbehorende werkingsgebieden en actviteiten waarvoor toepasbare regels opgesteld of aangepast gaan worden.  
De API maakt het mogelijk om gegevens op te vragen, bij een applicatie die invulling geeft aan de Omgevingswetbeleidcomponent, ook wel aangeduid als plansoftware, over (Omgevingswet-)activiteiten en/of (bijbehorende) juridische regels, regelteksten en locaties. Die gegevens maken deel uit van de vastlegging van omgevingsdocumenten, zoals een omgevingsplan, met genoemde applicatie. Het betreft regels en annotaties zoals die op het moment van opvragen vastgelegd (in de plansofware) zijn; er kan dus sprake zijn van nog niet vastgestelde of gepubliceerde gegevens. Het betreft dan bijvoorbeeld een beoogde wijziging van een omgevingsplan.  
Beoogd gebruik is vooral het inzicht krijgen in activiteiten en bijbehorende regels en locaties door een applicatie die invulling geeft aan de Toepasbare regelscomponent, ook wel aangeduid als toepasbare regelsoftware, t.b.v. het kunnen opstellen en aanpassen van toepasbare regels.  
Naast het **gebruik als API** is ook voorzien in het gebruik van de specificaties om **bestandsuitwisseling** van genoemde gegevens mogelijk te maken van plansoftware naar toepasbare regelsoftware.

## Voor wie is dit van belang?
Belanghebbenden ('stakeholders') zijn ten eerste de gebruikers van plansoftware en van toepasbare regelssoftware die in samenhang juridische en toepasbare regels opstellen en beheren. Dit betreft organisaties die bevoegd zijn om omgevingsdocumenten, zoals omgevingsplannen, op te stellen: de bevoegde gezagen i.c. gemeenten, waterschappen, provincies en rijksoverheidsdepartementen, en organisaties waaraan zij het opstellen en wijzigen van die regels hebben uitbesteed, zoals (ruimtelijk) adviesburo's en rijksoverheidsorganisaties (zoals Rijkswaterstaat).  
De tweede groep belanghebbenden zijn de leveranciers van plansoftware en van toepasbare regelssoftware aangezien deze software het gebruik van de API mogelijk moet maken.  
Daarnaast zijn belanghebbend de koepelorganisaties van genoemde bevoegde gezagen (VNG, UvW resp. IPO) teneinde te borgen dat hun leden kunnen beschikken over de nogelijkheden die deze API beoogd te bieden.  
Tot slot is de VNG tevens belanghebbende als beheerder van de API namens genoemde koepelorgaisaties.  

## Positie in GEMMA
De API ontsluit het register dat beheerd wordt met de (referentiecomponent) [Omgevingswetbeleidcomponent](https://www.gemmaonline.nl/index.php/Omgevingswet/1.5/id-482b112b-dc5e-49b6-879c-a22f22cb6941) v.w.b. activiteiten en daarbij behorende regels. Ofschoon elke applicatie gebruik kan maken van deze API is het gebruik daarvan gericht op de (referentiecomponent) [Toepasbare regelscomponent](https://www.gemmaonline.nl/index.php/Omgevingswet/1.5/id-7f053bcc-9558-41ce-8a17-d3fa81fb7c17). Beide componenten zijn uitgewerkt in de GEMMA-deelarchitectuur '[Gemeenteljke applicatie-architectuur Omgevingswet](https://www.gemmaonline.nl/index.php/GAO_-_De_referentiecomponenten_voor_de_Omgevingswet)'.  

## Compliancy cq. conformiteit
Deze standaard is officieel gepubliceerd als versie 1.0 en is kaderstellend voor de bedoelde informatie-uitwisseling. Onderkend wordt dat er nog geen ervaring is met het gebruik van deze standaard en het uitvoeren van de Omgevingswet met deze en andere standaarden nog volop in ontwikkeling is. Voortschrijdend inzicht en praktijkervaringen worden in volgende versies verwerkt zoals dat bij het beheer van standaarden gebruikeljk is.  
Voor het voldoen van applicaties aan deze versie van de standaard betekent dit het volgende.  
Een applicatie ('plansoftware') die invulling geeft aan de Omgevingswetbeleidcomponent is in staat om als provider de API te ondersteunen en/of conform de API-specificaties een bestand te exporteren (t.b.v. bestandsuitwisseling) dan wel een daaraan gelijkwaardige leverancierseigen oplossing te bieden voor bestandsexport mits daarbij de software-keuzes van afnemers gerespecteerd worden.  
Een applicatie ('toepasbare regelsoftware') die invulling geeft aan de Toepasbare regelscomponent is in staat om als consumer de API te ondersteunen en/of een bestand te importeren dat conform de API-specificaties is ingericht (i.v.m. bestandsuitwisseling) dan wel een gelijkwaardige leverancierseigen oplossing te bieden voor bestandsimport mits daarbij de software-keuzes van afnemers gerespecteerd worden.  
Dus, als de leverancier de standaard als provider of consumer nog niet ondersteunt en nog geen leverancierseigen oplossing kan bieden voor de door de klant gebruikte te koppelen consumer- resp. provider-software, dan dient ze koppeling met die software mogelijk te maken door het alsnog gaan ondersteunen van de standaard als provider resp. consumer dan wel door het alsnog bieden van een leverancierseigen oplossing voor bestandsuitwisseling met die software.  
Deze compliancy-afspraken waarborgen dat een hierboven, als eerste, genoemde belanghebbende haar eigen keuzes kan maken voor plansoftware en voor toepasbare regelsoftware waarbij  interoperabiliteit daartussen gegarandeerd is. Het waarborgt verder dat software-leveranciers vooralsnog met technisch relatief eenvoudige oplossingen in interoperabiliteit kunnen voorzien wat onevenredige investeringen in software-ontwikkeling voorkomt gezien de beperkte mate van volwassenheid waarin het Omgevingswetdomein zich nog bevindt.   


## Toelichting op bestandsuitwisseling
De API kan gebruikt worden om de desbetreffende gegevens in json-formaat als bestand op te vragen. Zonder selectie resulteert dat in alle regeltektsten en bijbehorende annotaties (locaties, 'juridische regels voor iedereen', activiteiten e.d. zoals beheerd in de plansoftware) of bijvoorbeeld alle locaties. Selectie van de te verkrijgen gegevens is mogelijk:  
- de regelteksten en bijbehorende annotaties van een specifiek omgevingsdocument;  
- de regelteksten en bijbehorende annotaties van één of meer activiteiten;  
- de regelteksten en bijbehorende annotaties van een specifiek werkpakket (element van regeltekst).  

Default worden alle regelteksten, ook die vervallen zijn, in het bestand opgenomen. Geselecteerd kan worden dat alleen niet-vervallen regelteksten opgenomen worden.

Voor de inhoud van een dergelijk bestand gelden enkele aanvullende afspraken:  
- Van een activiteit die deel uitmaakt van de selectie (van gewenste gegevens) worden tevens de bovenliggende activiteit(en) met bijbehorende 'juridische regels (voor iedereen)' en regelteksten geleverd. Dit gaat tot aan de (bovenliggende landelijke) activiteit op het tweede niveau in de functionele structuur (zoals "nl.imow-mnre1034.activiteit.ActInOmgevingsplan").
- Van een activiteit worden wel de Id’s van gerelateerde activiteiten geleverd maar niet de gegevens daarvan (tenzij de gerelateerde activiteit tot de selectie behoort).  
- Indien één of meer activiteiten geselecteerd zijn, dan worden van de daarbij behorende 'juridische regels voor iedereen' alleen de activiteitlocatieaanduidingen bij die activiteiten (en de bovenliggende activteiten) geleverd, niet de activiteitlocatieaanduidingen naar andere activiteiten.   
- De als embedded gespecificeerde gegevens worden in de bestandsuitwisseling niet als embedded opgenomen. Gerelateerde gegevens worden opgenomen in de desbetreffende resources waarnaar m.b.v. de ID verwezen wordt.

Zie ter illustratie van één en ander hier onder per resource een voorbeeldbestand:
* [activiteiten](https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/voorbeelden/bestandsuitwisseling/activiteiten.json).  
* [juridischeRegelsVoorIedereen](https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/voorbeelden/bestandsuitwisseling/juridischeregelsvooriedereen.json).  
* [locaties](https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/voorbeelden/bestandsuitwisseling/locaties.json).  
* [regelteksten](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/blob/main/voorbeelden/bestandsuitwisseling/regelteksten.json).  

## Privacy en Security

De gegevens die middels deze API worden uitgewisseld zijn niet privacygevoelig. Geen van de gegevens die met deze API worden uitgewisseld hebben betrekking op personen of kunnen naar personen herleid worden.

Aangezien deze API binnengemeentelijk berichtenverkeer van niet privacygevoelige gegevens betreft worden er geen aanvullende security eisen gesteld.

## Documentatie
* [Technische specificaties van de **unresolved** versie](https://github.com/VNG-Realisatie/Regels-bij-Activiteiten/blob/master/specificatie/openapi.yaml){:target="_blank" rel="noopener"} (Open API versie)
* Specificaties van de actuele productie versie (resolved) in [Swagger-formaat](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/specificatie/genereervariant/openapi.yaml)
* Download de [JSON Schema versie van de technische specificatie t.b.v. bestandsuitwisseling](https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/specificatie/openapi.json){:target="_blank" rel="noopener"}
* Download de [JSON Schema draft 04 versie van de technische specificatie t.b.v. bestandsuitwisseling](https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/specificatie/openapi_draft04.json){:target="_blank" rel="noopener"}
* Download [client code](https://github.com/VNG-Realisatie/Regels-bij-Activiteiten/tree/master/code){:target="_blank" rel="noopener"}

* Ontwerpkeuzes staan in de [ontwerpbeslissingen](./ontwerpbeslissingen.md)
  Voor nu: opmerkingen, vragen, verbetervoorstellen e.d. graag als [issues](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues) in deze repository.
* [Conceptueel Informatiemodel Omgevingswet (CIMOW)](https://geonovum.github.io/TPOD/CIMOW/CIMOW_v2.0.0.pdf)
* [Informatiemodel Officiële Publicaties](https://koop.gitlab.io/STOP/standaard/1.1.0/EA_4D1D7FD517FE4d8dA9A2B905D202C92B.html)

## Bronnen
* [API strategie en URI strategie](https://aandeslagmetdeomgevingswet.nl/digitaal-stelsel/documenten/documenten/api-uri-strategie/)

## Contactpersonen:
* Product Owner a.i.: Arjan Kloosterboer arjan.kloosterboer@vng.nl
* Berichtontwerpers: Robert Melskens robert.melskens@vng.nl, Johan Boer johan.boer@vng.nl

## Licentie
Copyright &copy; VNG Realisatie 2018
Licensed under the [EUPL](../LICENCE.md)
