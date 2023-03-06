# API specificaties Regels bij Activiteiten

In deze versie zijn nu handmatig enkele wijzigingen in het .yaml en .json bestanden doorgevoerd.
Hieronder een beschrijving van deze aanpassingen.

## Verwerking gegenereerde openapi.yaml
De openapi.yaml wordt gegenereerd als hal+json en moet vervolgens opgesplitst worden in een domain.yaml en een openapi.yaml deel.
De domain.yaml bevat alle componenten die niets met HAL en met de definitie van de endpoints of servers te maken hebben. 

### domain.yaml
Deze bestaat dus uit:

* De info sectie
* Een lege paths sectie ('paths: {}')
* In de components/schema sectie de volgende componenten:
  - Activiteit
  - JuridischeRegelVoorIedereen
  - Locatie
  - Regeltekst
  - ActiviteitLocatieaanduiding
  - Activiteitengroep
  - Activiteitregelkwalificatie
  - DocumentComponent
  - Idealisatie
  - Kop
  - Omgevingsdocument
  - Soortregeling
  - Thema
  - LocatieType
  - Identificatie
  - WId

Binnen Locatie moet, zolang de description die in het SIM bij het attribute 'geometrie' staat nog niet wordt meegenomen in de gegenereerde openapi.yaml, 
handmatig een description property aan de property 'geometrie' worden toegevoegd. Deze dient dan boven de $ref property geplaatst te worden met de volgende inhoud: 

```yaml
<body><p>De geometrische bepaling door middel van coördinaten.</p></body>
```

Dit laatste is overigens niet volgens de OAS 3.0 standaard. De OAS 3.1 standaard ondersteund het wel en daar lopen we hiermee op vooruit.

Hetzelfde geldt voor alle identificatie attributes (dus niet alleen die met de naam 'identificatie' maar ook bijv. 'bovenliggendeActiviteitIdentificatie'). Deze 'description' properties moeten zolang deze nog niet worden meegenomen in de gegenereerde openapi.yaml handmatig aangebracht te worden. Ook voor de 'title' properties geldt dat.

Tenslotte moeten alle 'allOf' constructs waarbinnen m.b.v. een '$ref' wordt verwezen naar een ander component worden aangepast aangezien deze bij code generatie problemen geven. Dat betekent dat constructs als:

```yaml
  allOf:
    - $ref: "..."
    - title: "..."
      description: "..."
```
worden omgezet naar:

```yaml
  title: "..."
  description: "..."
  $ref: "..."
```

### openapi.yaml
De openapi.yaml bestaat uit het volgende:

* de info sectie
* de servers sectie
* alle hal componenten die niet in domain.yaml voorkomen. 
* Een tags sectie die toegevoegd moet worden voor de paths sectie met de volgende inhoud:

```yaml
  tags:
  - name: Activiteiten
  - name: JuridischeRegelsVoorIedereen
  - name: Locaties
  - name: Regelteksten
  ```

Tenslotte dienen er aan de openapi.yaml nog de volgende wijzigingen te worden aangebracht:
* Wijzig in het bericht '/regelteksten' de namen van de query parameters 'inclusiefvervallen', 'omgevingsdocumentidentificatie' en 'werkpakketcode' in resp. 'inclusiefVervallen', 'omgevingsdocumentIdentificatie' en 'werkpakketCode'
* Doordat de openapi.yaml opgesplitst is moeten de referenties in de openapi.yaml naar componenten die nu in de domain.yaml zo aangepast worden dat er daar 
voor '#/components/schemas/' de string 'domain.yaml' wordt geplaatst.
* Aan de parameters sectie van alle berichten moet de parameter Accept-Crs worden toegevoegd d.m.v. de volgende string:

```yaml
- $ref: "https://raw.githubusercontent.com/VNG-Realisatie/Haal-Centraal-common/v1.3.0/api-specificatie/common.yaml#/components/parameters/acceptCrs"
```

* Aan de header sectie van de 200 response van alle berichten moet de header Content-Crs worden toegevoegd d.m.v. de volgende string:

```yaml
Content-Crs:
  $ref: "https://raw.githubusercontent.com/VNG-Realisatie/Haal-Centraal-common/v1.3.0/api-specificatie/common.yaml#/components/headers/contentCrs"'
```

## Verwerking gegenereerde openapi.json
De openapi.json moet gegenereerd worden als json.

* Binnen Locatie verwijst bij de property 'geometrie' de waarde van de $ref property naar een yaml schema. Dat is niet correct. Het component GeoJsonGeometrie 
dat gedefinieerd is op 'https://raw.githubusercontent.com/VNG-Realisatie/API-Kennisbank/master/common/Generieke-Datatypen-Gemeenten.yaml#/components/schemas' moet 
in de JSON variant binnen dit JSON schema gehaald worden als 'GeoJSONGeometrie' (waarover hieronder meer informatie volgt) en de waarde van de $ref property moet 
gewijzigd worfden in '#/components/schemas/GeoJSONGeometrie'.
* Binnen Locatie moet, zolang de description die in het SIM bij het attribute 'geometrie' staat nog niet wordt meegenomen in de gegenereerde openapi.json, handmatig 
een description property aan de property 'geometrie' worden toegevoegd. Deze dient dan boven de $ref property geplaatst te worden met de volgende inhoud: 

```json
<body><p>De geometrische bepaling door middel van coördinaten.</p></body>
```

* Hetzelfde geldt voor alle identificatie attributes (dus niet alleen die met de naam 'identificatie' maar ook bijv. 'bovenliggendeActiviteitIdentificatie'). Deze 'description' properties moeten zolang deze nog niet worden meegenomen in de gegenereerde openapi.yaml handmatig aangebracht te worden. Ook voor de 'title' properties geldt dat.

* Alle 'allOf' constructs waarbinnen m.b.v. een '$ref' wordt verwezen naar een ander component worden aangepast. Dat betekent dat constructs als:

```json
  "allOf": [
    {
      "$ref": "..."
    },
    {
      "title": "...",
      "description": "..."
    }
  ]
```
worden omgezet naar:

```json
  "title": "...",
  "description": "..."
  "$ref": "..."
```

* Voeg onder het component 'LocatieType' het volgende fragment toe:

```yaml
"GeoJSONGeometrie": {
  "type": "object",
  "description": "Geometrie in GeoJSON formaat (RFC 7946). Een property die dit datatype heeft mag slechts 1 van de opgenomen properties bevatten. Deze constructie vervangt de oneOf vanwege codegeneratie-issues.",
  "title": "GeoJSON Geometrie",
  "properties": {
    "point": {
      "$ref": "#/components/schemas/pointGeoJSON"
    },
    "lineString": {
      "$ref": "#/components/schemas/linestringGeoJSON"
    },
    "polygon": {
      "$ref": "#/components/schemas/polygonGeoJSON"
    },
    "multiPoint": {
      "$ref": "#/components/schemas/multipointGeoJSON"
    },
    "multiLineString": {
      "$ref": "#/components/schemas/multilinestringGeoJSON"
    },
    "multiPolygon": {
      "$ref": "#/components/schemas/multipolygonGeoJSON"
    }
  },
  "externalDocs": {
    "description": "RFC 7946 - The GeoJSON Format",
    "url": "https://tools.ietf.org/html/rfc7946"
  }
},
"pointGeoJSON": {
  "required": [
    "coordinates",
    "type"
  ],
  "type": "object",
  "properties": {
    "type": {
      "type": "string",
      "enum": [
        "Point"
      ]
    },
    "coordinates": {
      "minItems": 2,
      "type": "array",
      "items": {
        "type": "number"
      }
    }
  }
},
"linestringGeoJSON": {
  "required": [
    "coordinates",
    "type"
  ],
  "type": "object",
  "properties": {
    "type": {
      "type": "string",
      "enum": [
        "LineString"
      ]
    },
    "coordinates": {
      "minItems": 2,
      "type": "array",
      "items": {
        "minItems": 2,
        "type": "array",
        "items": {
          "type": "number"
        }
      }
    }
  }
},
"polygonGeoJSON": {
  "required": [
    "coordinates",
    "type"
  ],
  "type": "object",
  "properties": {
    "type": {
      "type": "string",
      "enum": [
        "Polygon"
      ]
    },
    "coordinates": {
      "type": "array",
      "items": {
        "minItems": 4,
        "type": "array",
        "items": {
          "minItems": 2,
          "type": "array",
          "items": {
      "type": "number"
          }
        }
      }
    }
  }
},
"multipointGeoJSON": {
  "required": [
    "coordinates",
    "type"
  ],
  "type": "object",
  "properties": {
    "type": {
      "type": "string",
      "enum": [
        "MultiPoint"
      ]
    },
    "coordinates": {
      "type": "array",
      "items": {
        "minItems": 2,
        "type": "array",
        "items": {
          "type": "number"
        }
      }
    }
  }
},
"multilinestringGeoJSON": {
  "required": [
    "coordinates",
    "type"
  ],
  "type": "object",
  "properties": {
    "type": {
      "type": "string",
      "enum": [
        "MultiLineString"
      ]
    },
    "coordinates": {
      "type": "array",
      "items": {
        "minItems": 2,
        "type": "array",
        "items": {
          "minItems": 2,
          "type": "array",
          "items": {
      "type": "number"
          }
        }
      }
    }
  }
},
"multipolygonGeoJSON": {
  "required": [
    "coordinates",
    "type"
  ],
  "type": "object",
  "properties": {
    "type": {
      "type": "string",
      "enum": [
        "MultiPolygon"
      ]
    },
    "coordinates": {
      "type": "array",
      "items": {
        "type": "array",
        "items": {
          "minItems": 4,
          "type": "array",
          "items": {
      "minItems": 2,
      "type": "array",
      "items": {
        "type": "number"
      }
          }
        }
      }
    }
  }
},

```

* Verwijder onderin het bestand de dubbel gedefinieerde componenten:
  - ActiviteitLocatieaanduiding
  - Activiteitengroep
  - Activiteitregelkwalificatie
  - DocumentComponent
  - Idealisatie
  - Kop
  - Omgevingsdocument
  - Soortregeling
  - Thema
  - LocatieType

## Verwerking gegenereerde openapi_draft04.json
De openapi_draft04.json moet gegenereerd worden als json.

Voer dezelfde wijzigingen uit op dit bestand als op openapi.json echter daar waar in de wijzigingsaanwijzingen (dus ook in het GeoJSON fragment) '#/components/schemas' moet hier '#/definitions' staan.


De beide OAS3 bestanden zijn hier te vinden [openapi.yaml](./openapi.yaml),  [domain.yaml](./domain.yaml)
Het JSON bestand is hier te vinden [openapi.json](./openapi.json)
Het OAS3 bestand is hier te vinden [openapi_draft04.json](./openapi_draft04.json)
