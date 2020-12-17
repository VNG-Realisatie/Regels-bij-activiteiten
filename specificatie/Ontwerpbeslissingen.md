# Ontwerpbeslissingen

Het uitwisselingsgegevensmodel is ontworpen op basis van het onderstaande CIMOW:

![CIM](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/blob/main/specificatie/CIM%20Koppeling%20PlanSW%20en%20TRSW.jpg)


Bij het ontwerpen van de OAS specificatie op basis van het CIMOW hebben we de volgende besluiten t.o.v. dat CIMOW en de ons aangeleverde specificaties ('Notitie specificatie juridische regels-API 20200312.docx') genomen:

* Aan de entiteittypes 'activiteit', 'juridischeRegelVoorIedereen', 'locatie' en 'regeltekst' zijn de volgende attributes t.b.v. historie toegevoegd:
   - begindatum
   - einddatum
* Aan de entiteittypes 'activiteit' en 'regeltekst' is het volgende attribute eveneens t.b.v. historie toegevoegd:
   - laatsteWijzigingsdatum
* Aan de entiteittypes 'activiteit', 'juridischeRegelVoorIedereen', 'locatie' en 'regeltekst' en aan de groep 'ActiviteitLocatieaanduiding' zijn voor 
elke relatie die daaraan gekoppeld is een 'identificatie' attribute toegevoegd t.b.v. de templated url's in de OAS specificatie. De kardinaliteit van deze attributes is gelijk aan die van de gerelateerde relatie.
* De naam van alle attributes die meer dan 1 keer voor kunnen komen zijn meervoudig gemaakt.
* De objecttypen 'Juridische regel' en 'Regel voor iedereen' zijn samengetrokken in het entiteittype 'juridischeRegelVoorIedereen'. 
Dat betekent dat alle attributen en relaties van die objecttypen in het genoemde entiteittype terecht zijn gekomen.
* Binnen de resource ‘juridischeRegelsvooriedereen’ misten in de specs het attribute ‘identificatie’. 
Deze is toch opgenomen er vanuit gaande dat de resource opgevraagd moet kunnen worden.
* Omdat de resource 'juridischeRegelVoorIedereen' vanuit de resource 'activiteit' op te vragen moet zijn is de 'kent' relatie gelegd. 
Deze komt minimaal 1 keer voor maar mag vaker voorkomen.
* De subtypes 'Ambtsgebied', 'Punt', 'Gebied' en 'Lijn' van het objectType 'Locatie' zijn platgeslagen in het entiteittype 'locatie'. 
Concreet betekent dit dat de attributen 'Bron', 'Geometrie', 'Hoogte' nu opgenomen zijn in 'locatie', resp. als 'geometrie', 'geometrieBron' en 'hoogte'.
Allen zijn optioneel zodat ook een puntengroep, gebiedengroep en lijnengroep gedefinieerd kunnen worden.
* Aan het entiteittype 'locatie' is ook het verplichte attribuut 'type' opgenomen waarmee aangegeven kan worden om welk subtype het gaat.
* Aan het entiteittype 'locatie' is het attribuut 'geometrieType' opgenomen waarmee aangegeven kan worden welk gml type het betreft (bijv. 'GM_Surface').
* De relatie 'omvat' die in het CIMOW op de objecttypes 'Puntengroep', 'Gebiedengroep' en 'Lijnengroep' is gedefinieerd is in het uitwisselingsmodel op het entiteittype 'locatie' gedefinieerd. Deze is hier optioneel.
* De attributes 'identificatie' en 'type' van het objectType 'DocumentComponent', 'opschrift' van het objectType 'Omgevingsdocument' en 'code' van het objectType 'BevoegdGezag' 
zijn als resp. 'documentIdentificatie', 'documentType', 'documentOpschrift' en 'codebevoegdGezag' opgenomen in de groep 'DocumentComponent' welke d.m.v. het attribute 'documentComponent' is opgenomen in de entiteittype 'regeltekst'
* De groep 'Kop' is in het uitwisselingsmodel onder dezelfde naam en inhoud opgenomen en is via het attribute 'kop' opgenomen in de groep 'documentComponent'.

E.e.a. leidt tot het volgende uitwisselingsgegevensmodel:

![UGM](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/blob/main/specificatie/UGM%20Koppeling%20PlanSW%20en%20TRSW.jpg)

## Ter overweging

* In de resource 'locatie' is het attribuut ‘hoogte’ opgenomen. 
De hoogte is in een aantal coördinatensystemen echter al onderdeel van dat systeem (bijv. EPSG 7415). 
De vraag is dus of dit attribute echt opgenomen moet worden.

## Vragen

Tijdens het ontwerpproces riepen een aantal zaken de volgende vragen op:

* Er wordt aangegeven dat men het attribute ‘origineel coördinatensysteem’ in de resource ‘locatie’ opgenomen wil hebben. Op dit moment is dat 
nog niet opgenomen omdat het de praktijk is om dit als 'acceptCRS' en ‘contentCRS’ in de header van het berichten op te nemen. De vraag is echter of er 
redenen zijn waarom je dit juist in de content zou willen opnemen?
