---
layout: page-with-side-nav
title: Releasenotes
---

# Release notes Regels bij Activiteiten API

## Versie 1.0.0 (20-07-2021)

  Naast de wijzigingen i.v.m. de issues in de volgende sectie zijn er ook nog enkele andere wijzigingen aangebracht.
  
  - Alle informatie m.b.t. bestandsuitwisseling is nu verzameld in de README op root niveau.
  - Alle identificatie attributes verwijzen nu naar het component 'Identificatie' of 'WId'.
  - De vorm van het 'geometrie' attribute zo aangepast dat het ook de omschrijving daarvan bevat. 
    Hetzelfde geldt voor de attributes 'groep', 'idealisatie', 'activiteitregelkwalificatie' en 'type' binnen resp. 
	'Activiteit', 'JuridischeRegelVoorIedereen', 'ActiviteitLocatieaanduiding' en 'Omgevingsdocument'.
  - Ook de query parameters 'inclusiefVervallen', 'omgevingsdocumentIdentificatie' en 'werkpakketCode' zijn nu
    lowerCamelCase waardoor parameternamen waar van toepassing gelijk zijn aan de gereleateerde attributes.
  

### Opgeloste issues
  Alle issues die in deze release zijn opgelost hebben in de issues-lijst het label "1.0" gekregen. Door op dit label te filteren in de (gesloten) issues is een gedetailleerd overzicht van wijzigingen en bug-fixes te krijgen.
  Hieronder is per issue beschreven welke wijzigingen daravoor zijn aangebracht.

  | Link Github	| Beschrijving |
  | --- | --- |
  | [36](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/36){:target="_blank"} | Fout in waarde van description van het property 'werkpakketCode' in 'regeltekst' is gefixed. |
  | [37](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/37){:target="_blank"} | Attribute 'werkpakketCode' is verwijderd uit 'Locatie'. |
  | [38](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/38){:target="_blank"} | Conflicterende karakters uit de description van relatie 'is' op 'activiteit' zijn verwijderd. |
  | [39](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/39){:target="_blank"} | De 'url' waarden van de server beschrijving bovenin de specificatie is gecorrigeerd. |
  | [40](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/40){:target="_blank"} | De 'title' property in het info deel van de specificatie is gecorrigeerd. |
  | [41](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/41){:target="_blank"} | De property 'documentType' in 'Omgevingsdocument' is verplicht gemaakt en hernoemd naar 'type'. |
  | [42](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/42){:target="_blank"} | De property 'documentType' in 'Omgevingsdocument' is verplicht gemaakt en hernoemd naar 'type'. |
  | [43](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/43){:target="_blank"} | De omschrijving van een groot aantal componenten is verbeterd. |
  | [44](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/44){:target="_blank"} | Conflicterend karakter uit de description van relatie 'gerelateerd' op 'activiteit' is verwijderd. |
  | [45](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/45){:target="_blank"} | De vreemde 'description' op component 'locatieType' is verwijderd. |
  | [46](https://github.com/VNG-Realisatie/Regels-bij-activiteiten/issues/46){:target="_blank"} | De omschrijving van een groot aantal componenten is verbeterd. |

## Versie 1.0.0-rc1 (30-04-2021)

  Hieronder staan de endpoints die in deze standaard gedefinieerd zijn. Verdere details staan in de specificatie.
  -	/activiteiten
  -	/activiteiten/{identificatie}
  -	/juridischeregelsvooriedereen
  -	/juridischeregelsvooriedereen/{identificatie}
  -	/locaties
  -	/locaties/{identificatie}
  -	/regelteksten
  -	/regelteksten/{identificatie}

### Known issues
  De volgende issues staan nog open, oplossing volgt in een latere versie:

  | Link Github	| Beschrijving |
  | --- | --- | --- |

