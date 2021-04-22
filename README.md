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
