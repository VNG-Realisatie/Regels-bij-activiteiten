# Ontwerpbeslissingen

Het uitwisselingsgegevensmodel is ontworpen op basis van het onderstaande gedeelte van het CIMOW (versie 1.0.4):

![CIM](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/blob/main/docs/CIM%20Koppeling%20PlanSW%20en%20TRSW.jpg)


Bij het ontwerpen van de OAS specificatie op basis van het CIMOW hebben we de volgende besluiten t.o.v. dat CIMOW en de ons aangeleverde specificaties (meerdere notities, zie [deze compilatie](./Voorstel%20JR-TR-koppelvlak%20-%20compilatie%2020201002.pdf)) genomen:

* Aan de entiteittypes 'activiteit', 'juridischeRegelVoorIedereen', 'locatie' en 'regeltekst' zijn de volgende attributes t.b.v. historie toegevoegd:
   - begindatum
   - einddatum
* Aan de entiteittypes 'activiteit' en 'regeltekst' is het volgende attribute eveneens t.b.v. historie toegevoegd:
   - laatsteWijzigingsdatum
* Aan de entiteittypes 'activiteit', 'juridischeRegelVoorIedereen', 'locatie' en 'regeltekst' en aan de groep 'ActiviteitLocatieaanduiding' zijn voor
elke relatie die daaraan gekoppeld is een 'identificatie' attribute toegevoegd t.b.v. de templated url's in de OAS specificatie. De kardinaliteit van deze attributes is gelijk aan die van de gerelateerde relatie.
* De naam van alle attributen die meer dan 1 keer voor kunnen komen zijn meervoudig gemaakt.
* De objecttypen 'Juridische regel' en 'Regel voor iedereen' zijn samengetrokken in het entiteittype 'juridischeRegelVoorIedereen'.
Dat betekent dat alle attributen en relaties van die objecttypen in het genoemde entiteittype terecht zijn gekomen.
* Omdat de resource 'juridischeRegelVoorIedereen' vanuit de resource 'activiteit' op te vragen moet zijn is de 'kent' relatie gelegd.
Deze komt minimaal 1 keer voor maar mag vaker voorkomen.
* De subtypes 'Ambtsgebied', 'Punt', 'Puntengroep', 'Gebied', 'Gebiedengroep', 'Lijn' en 'Lijnengroep' van het objectType 'Locatie' zijn platgeslagen in het entiteittype 'locatie'.
Concreet betekent dit dat de attributen 'Bron', 'Geometrie' nu opgenomen zijn in 'locatie', resp. als 'geometrie' en 'geometrieBron'.
Beiden zijn optioneel zodat ook een puntengroep, gebiedengroep en lijnengroep gedefinieerd kunnen worden.
* Aangezien de hoogte niet van belang is voor het onderwerp van deze API is de property 'hoogte' niet opgenomen in het entiteittype 'locatie'.
* De property 'geometrie' heeft het datatype GeoJSONGeometrie wat de objecten 'Point', 'LineString', 'Polygon', 'MultiPoint', 'MultiLineString' en 'MultiPolygon' bevat. Vanwege codegeneratie problemen is in yaml geen gebruik gemaakt van de 'oneOf' constructie maar van de 'allOf' constructie. Desondanks blijft gelden dat slechts een van deze objecten gebruikt mag worden binnen 'geometrie'.
* Aan het entiteittype 'locatie' is ook het verplichte attribuut 'type' opgenomen waarmee aangegeven kan worden om welk subtype het gaat.
* De relatie 'omvat' die in het CIMOW op de objecttypes 'Puntengroep', 'Gebiedengroep' en 'Lijnengroep' is gedefinieerd is in het uitwisselingsmodel op het entiteittype 'locatie' gedefinieerd. Deze is hier optioneel.
* De relatie 'is regelstructuurannotatie bij' die loopt van het objecttype 'Regeltekst' naar 'DocumentComponent' is vertaalt naar de gegevensgroep constructie 'documentComponent' welke is opgenomen in het entiteittype 'regeltekst'.
* Het objecttype 'DocumentComponent' is omgezet in de groep 'documentComponent'.
* De relatie 'is onderdeel van' die loopt van het objecttype 'DocumentComponent' naar 'Omgevingsdocument' is vertaalt naar de gegevensgroep constructie 'omgevingsdocument' welke is opgenomen in de groep 'documentComponent'.
* Het objecttype 'Omgevingsdocument' is omgezet in de groep 'omgevingsdocument'.
* Het attribute 'code' uit het objecttype 'BevoegdGezag' is onder naam 'codeBevoegdGezag' platgeslagen in de groep 'omgevingsdocument'.
* De groep 'Kop' is in het uitwisselingsmodel onder de naam 'kop' en dezelfde inhoud opgenomen en is via het attribute 'kop' opgenomen in de groep 'documentComponent'.
*	De meervoudige naam van de relatie 'omvat' op het entiteittype 'locatie' heeft de waarde 'omvattendeLocaties' omdat daarmee de rol van de relatie naar een subresource van hetzelfde type duidelijker wordt. Daarnaast voorkomt dit dat we binnen het entiteittype 'locatie' zowel een attribute 'identificatie' als 'locatieIdentificaties' krijgen wat verwarrend kan werken omdat onbekend is welke van de twee gerelateerd is met de relatie 'omvat' en dus fouten in de hand kan werken.
*	In het entiteitype 'regeltekst' heeft om eenzelfde reden de meervoudige naam van de relatie 'gerelateerd' de waarde 'gerelateerdeRegelteksten' gekregen.
*	In het entiteitype 'activiteit' heeft om eenzelfde reden de meervoudige naam van de relatie 'gerelateerd' de waarde 'gerelateerdeActiviteiten' en de meervoudige naam van de relatie 'is' de waarde 'bovenliggendeActiviteit' gekregen. Daarnaast was verbijzondering natuurlijk ook noodzakelijk omdat er 2 relaties naar hetzelfde entiteittype verwezen.
*	In het entiteitype 'juridischeregelsvooriedereen' heeft om eenzelfde reden de meervoudige naam van de relatie 'definieert' de waarde 'gedefinieerdeLocaties' en de meervoudige naam van de relatie 'kwalificeert' de waarde 'gekwalificeerdeLocaties' gekregen. Ook hier geldt dat verbijzondering ook noodzakelijk was omdat er 2 relaties naar hetzelfde entiteittype verwezen.

E.e.a. leidt tot het volgende uitwisselingsgegevensmodel:

![UGM](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/blob/main/docs/UGM%20Koppeling%20PlanSW%20en%20TRSW.jpg)

## Vragen

Tijdens het ontwerpproces riepen een aantal zaken de volgende vragen op:

* Er wordt aangegeven dat men het attribute ‘origineel coördinatensysteem’ in de resource ‘locatie’ opgenomen wil hebben. Op dit moment is dat
nog niet opgenomen omdat het de praktijk is om dit als 'acceptCRS' en ‘contentCRS’ in de header van het berichten op te nemen. De vraag is echter of er
redenen zijn waarom je dit juist in de content zou willen opnemen?
* Hier en daar zijn door platslaan attributen elders terecht gekomen waardoor er een noodzaak was de namen te wijzigen. Ook is in de OAS3 specificatie
bij relaties tussen resources niet de namen van die relaties gebruikt maar van de daaraan gekoppelde resources, echter bij meerdere relaties naar dezelfde andere
resource zijn de namen gedifferentieerd. Verzoek is om de gekozen naamgeving kritisch tegen het daglicht te houden.
