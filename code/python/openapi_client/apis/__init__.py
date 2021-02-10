
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.activiteiten_api import ActiviteitenApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from openapi_client.api.activiteiten_api import ActiviteitenApi
from openapi_client.api.juridische_regels_voor_iedereen_api import JuridischeRegelsVoorIedereenApi
from openapi_client.api.locaties_api import LocatiesApi
from openapi_client.api.regelteksten_api import RegeltekstenApi
