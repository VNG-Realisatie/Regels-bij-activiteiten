# Regels bij activiteiten

![lint oas](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/lint-oas/badge.svg)
![generate sdks](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/generate-sdks/badge.svg)
![generate postman collection](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/workflows/generate-postman-collection/badge.svg)

Deze API maakt het mogelijk om gegevens op te vragen, bij een applicatie die invulling geeft aan de Omgevingswetbeleidcomponent, ook wel aangeduid als plansoftware, over (Omgevingswet-)activiteiten en/of (bijbehorende) juridische regels, regelteksten en locaties. Die gegevens maken deel uit van de vastlegging van omgevingsdocumenten, zoals een omgevingsplan, met genoemde applicatie. Het betreft regels en annotaties zoals die op het moment van opvragen opgesteld zijn; er kan dus sprake zijn van nog niet vastgestelde of gepubliceerde gegevens. Het betreft dan bijvoorbeeld een beoogde wijziging van een omgevingsplan.  
Beoogd gebruik is vooral het inzicht krijgen in activiteiten en bijbehorende regels en locaties door een applicatie die invulling geeft aan de Toepasbare regelscomponent, ook wel aangeduid als toepasbare regelssoftware, t.b.v. het kunnen opstellen en aanpassen van toepasbare regels.  
Naast het **gebruik als API** is ook voorzien in het gebruik van de specificaties om **bestandsuitwisseling** van genoemde gegevens mogelijk te maken tussen plansoftware en toepasbare regelssoftware. 

## Voor wie is dit van belang?
Belanghebbenden ('stakeholders') zijn ten eerste de gebruikers van plansoftware en van toepasbare regelssoftware die in samenhang juridische en toepasbare regels opstellen en beheren. Dit betreft organisaties die bevoegd zijn om omgevingsdocumenten, zoals omgevingsplannen, op te stellen: de bevoegde gezagen i.c. gemeenten, waterschappen, provincies en rijksoverheidsdepartementen, en organisaties waaraan zij het opstellen en wijzigen van die regels hebben uitbesteed, zoals (ruimtelijk) adviesburo's en rijksoverheidsorganisaties (zoals Rijkswaterstaat).  
De tweede groep belanghebbenden zijn de leveranciers van plansoftware en van toepasbare regelssoftware aangezien deze software het gebruik van de API mogelijk moet maken.  
Daarnaast zijn belanghebbend de koepelorganisaties van genoemde bevoegde gezagen (VNG, UvW resp. IPO) teneinde te borgen dat hun leden kunnen beschikken over de nogelijkheden die deze API beoogd te bieden.  
Tot slot is de VNG tevens belanghebbende als beheerder van de API namens genoemde koepelorgaisaties.  

## Positie in GEMMA
De API ontsluit het register dat beheerd wordt met de (referentiecomponent) [Omgevingswetbeleidcomponent](https://www.gemmaonline.nl/index.php/Omgevingswet/1.5/id-482b112b-dc5e-49b6-879c-a22f22cb6941) v.w.b. activiteiten en daarbij behorende regels. Ofschoon elke applicatie gebruik kan maken van deze API is het gebruik daarvan gericht op de (referentiecomponent) [Toepasbare regelscomponent](https://www.gemmaonline.nl/index.php/Omgevingswet/1.5/id-7f053bcc-9558-41ce-8a17-d3fa81fb7c17). Beide componenten zijn uitgewerkt in de GEMMA-deelarchitectuur '[Gemeenteljke applicatie-architectuur Omgevingswet](https://www.gemmaonline.nl/index.php/GAO_-_De_referentiecomponenten_voor_de_Omgevingswet)'.  

## Compliancy cq. conformiteit
De actuele versie van de standaard is 0.9. Hiervoor is gekozen aangezien er nog geen ervaring is met het gebruik van deze standaard en het uitvoeren van de Omgevingswet met deze en andere standaarden nog volop in ontwikkeling is. Voor het voldoen van applicaties aan deze versie van de standaard betekent dit het volgende.  
Een applicatie ('plansoftware') die invulling geeft aan de Omgevingswetbeleidcomponent is in staat om als provider de API te ondersteunen en/of conform de API-specificaties een bestand te exporteren (t.b.v. bestandsuitwisseling) dan wel het bieden van een daaraan gelijkwaardige leverancierseigen oplossing voor bestandsexport mits daarbij de software-keuzes van afnemers gerespecteerd worden.  
Een applicatie ('toepasbare regelsoftware') die invulling geeft aan de Toepasbare regelscomponent is in staat om als consumer de API te ondersteunen en/of een bestand te importeren dat conform de API-specificaties is ingericht (i.v.m. bestandsuitwisseling) dan wel het bieden van een gelijkwaardige leverancierseigen oplossing voor bestandsimport mits daarbij de software-keuzes van afnemers gerespecteerd worden.  
Dus, als de leverancier de standaard als provider of consumer nog niet ondersteunt en nog geen leverancierseigen oplossing kan bieden voor de door de kant gebruikte te koppelen consumer- resp. provider-software, dan dient ze koppeling met die software mogelijk te maken door het alsnog gaan ondersteunen van de standaard als provider resp. consumer dan wel door het alsnog bieden van een leverancierseigen oplossing voor bestandsuitwisseling met die software.  
Deze compliancy-afspraken waarborgen dat een hierboven als eerstgenoemde belanghebbende haar eigen keuzes kan maken voor plansoftware en voor toepasbare regelsoftware waarbij  interoperabiliteit daartussen gegarandeerd is. Het waarborgt verder dat software-leveranciers vooralsnog met technisch relatief eenvoudige oplossingen in interoperabiliteit kunnen voorzien wat onevenredige investeringen in software-ontwikkeling voorkomt gezien de beperkte mate van volwassenheid waarin het Omgevingswetdomein zich nog bevindt.   

## Getting started
...

## Documentatie
* [Technische specificaties van de **unresolved** versie](./specificatie/openapi.yaml) (Open API versie)
* Specificaties van de actuele productie versie in [Swagger-formaat](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/VNG-Realisatie/Regels-bij-activiteiten/main/specificatie/genereervariant/openapi.yaml)
* [Technische specificaties](./specificatie/openapi.json) (JSON Schema versie)
* [Technische specificaties](./specificatie/openapi_draft04.json) (JSON Schema draft 04 versie)
* Download [client code](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/tree/master/code)

* Ontwerpkeuzes staan in de [ontwerpbeslissingen](./docs/ontwerpbeslissingen.md)
* Productvisie (nog in te voorzien)
* Definition of Ready (nog in te voorzien)
* Definition of Done (nog in te voorzien)
* Hoe u kunt bijdragen (nog in te voorzien)  
  Voor nu: opmerkingen, vragen, verbetervoorstellen e.d. graag als [issues](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues) in deze repository.
* Omgangsvormen (nog in te voorzien)

## Bronnen
* [API strategie en URI strategie](https://aandeslagmetdeomgevingswet.nl/digitaal-stelsel/documenten/documenten/api-uri-strategie/)

## Contactpersonen:
* Product Owner a.i.: Arjan Kloosterboer arjan.kloosterboer@vng.nl
* Berichtontwerpers: Robert Melskens robert.melskens@vng.nl, Johan Boer johan.boer@vng.nl

## Licentie
Copyright &copy; VNG Realisatie 2018
Licensed under the [EUPL](../LICENCE.md)
