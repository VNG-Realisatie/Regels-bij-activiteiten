# Ontwerpbeslissingen

Bij het ontwerpen van de OAS specificatie op basis van het CIMOW hebben we de volgende besluiten t.o.v. dat CIMOW genomen:

* De objecttypen 'Juridische regel' en 'Regel voor iedereen' zijn samengetrokken in de entiteittype 'juridischeRegelVoorIedereen'. 
Dat betekent dat alle attributen en relaties van die objecttypen in het genoemde entiteittype terecht zijn gekomen.
* Binnen de resource ‘juridischeRegelsvooriedereen’ misten in de specs het attribute ‘identificatie’. 
Deze is toch opgenomen er vanuit gaande dat de resource opgevraagd moet kunnen worden.
* De gegevensgroep 'normeertEenActiviteit' is platgeslagen in het entiteittype 'juridischeRegelVoorIedereen'. 
Concreet betekent dit dat het 'activiteitregelkwalificatie' als optioneel attribuut is opgenomen in 'juridischeRegelVoorIedereen'. 
Het mag wel meer dan 1 keer voor komen. Daarnaast loopt de relatie 'kwalificeert' ook vanuit 'juridischeRegelVoorIedereen'. 
De relatie 'betreft een activiteit' is omgedraaid, heet nu 'kent', en loopt nu vanuit 'activiteit' naar 'juridischeRegelVoorIedereen'.
* De subtypes 'Ambtsgebied', 'Punt', 'Gebied' en 'Lijn' van het objectType 'Locatie' zijn platgeslagen in het entiteittype 'locatie'. 
Concreet betekent dit dat de attributen 'Bron' en 'Geometrie' nu opgenomen zijn in 'locatie', resp. als 'geometrie' en 'geometrieBron'. 
Daarnaast is aan dit entiteittype het attribuut 'type' opgenomen waarmee aangegeven kan worden om welk subtype het gaat.
* Er was aangegeven dat men in de resource 'locatie' ook het attribuut ‘hoogte’ opgenomen wilde hebben. 
De hoogte is in een aantal coördinatensystemen echter al onderdeel van dat systeem (bijv. EPSG 7415). 
Het is dus vooralsnog nog niet opgenomen. Mocht er een reden zijn om dit toch op te nemen dan wordt dat alsnog gedaan.
* Aan 'locatie' is het attribuut 'geometrieType' opgenomen waarmee aangegeven kan worden welk gml type het betreft (bijv. 'GM_Surface').
* De attributen 'identificatie' en 'type' van het objectType 'DocumentComponent', 'opschrift' en 'nummer' van de gegevensgroepType 'Kop' 
en 'code' van het objectType 'Bevoegd gezag' zijn als resp. 'documentIdentificatie', 'documentType', 'documentComponentKopnummer' en 
'codeBevoegdGezag' platgeslagen in het entiteittype 'regeltekst'.

E.e.a. leidt tot het volgende uitwisselingsgegevensmodel:

![UGM](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/blob/main/specificatie/Koppeling%20PlanSW%20en%20TRSW.jpg)

## Ter overweging

* De attributes ‘documentIdentificatie’, ‘documentOpschrift’ en ‘documentType’ die nu direct in de resource ‘regeltekst’ zijn opgenomen 
kunnen zo gewenst natuurlijk ook opgenomen worden in een gegevensgroep binnen ‘regeltekst’.
* Je zou er voor kunnen kiezen de resource ‘regeltekst’ plat te slaan binnen de resource ‘juridischeregelsvooriedereen’. 
Er is dan geen resource ‘regeltekst’ meer. In dat geval zal het attribute ‘identificatie’ van regeltekst achterwege gelaten worden.

## Vragen

Tijdens het ontwerpproces riepen een aantal zaken de volgende vragen op:

* De attributes ‘begindatum’ en ‘einddatum’ zijn toegevoegd. Is historie inderdaad gewenst?
* Wat is het doel van het attribute ‘laatstewijzigingsdatum’?
* In het document 'Notitie specificatie juridische regels-API 20200312.docx' wordt aangegeven dat men in de resource ‘regeltekst’ ook wil 
kunnen beschikken over de attributes ‘soort’, ‘nummer’ en ‘opschrift’ van ‘het desbetrefende structuurelement’. 
Waar kan dit ‘structuurelement’ worden gevonden?
* Is het attribuut 'documentOpschrift' dat in 'regeltekst' is platgeslagen gerelateerd aan het attribuut 'opschrift' van het objectType 
'Omgevingsdocument' of juist van de gegevensgroepType 'Kop'?
* Moet het mogelijk zijn dat een regeltekst naar een andere regeltekst verwijst? Dat is nu vooralsnog wel zo geïmplementeerd.
* Binnen ‘juridischeRegelsvooriedereen’ komen 2 relaties naar ‘locatie’ voor. De relaties ‘definieert’ en ‘kwalificeert’. Zijn beide relaties 
nodig? Daar is voor nu vanuit gegaan.
* In het document 'Notitie specificatie juridische regels-API 20200312.docx' wordt aangegeven dat men het attribute ‘coördinaten’ (van de 
geometrie) in de resource ‘locatie’ opgenomen wil hebben. Wat is de functie van dit attribute? Wordt dat wat je hierin wil vastleggen niet al 
vastgelegd in het attribute ‘geometrie’?
* Er wordt aangegeven dat men het attribute ‘origineel coördinatensysteem’ in de resource ‘locatie’ opgenomen wil hebben. Op dit moment is dat 
nog niet opgenomen omdat het de praktijk is om dit als ‘contentCRS’ in de header van het bericht op te nemen. De vraag is echter of er 
redenen zijn waarom je dit juist in de content zou willen opnemen?
