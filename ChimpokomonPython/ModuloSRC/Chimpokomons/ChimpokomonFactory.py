from Ataque.CañonConico import CañonConico
from Ataque.GarraMecanica import GarraMecanica
from Ataque.PomadaWassington import PomadaWassington
from Ataque.Zapatazo import Zapatazo
from Ataque.RayoVeloz import RayoVeloz
from Chimpokomons.Chimpokomon import Chimpokomon

class ChimpokomonFactory():

    @staticmethod
    def Carnotron(naturaleza):
        ataques = []
        ataques.append(CañonConico( 4, "CañonConico"))
        ataques.append(RayoVeloz( 3, "RayoVeloz"))
        return Chimpokomon("Carnotron", 20, naturaleza, ataques)

    @staticmethod
    def Gallotronix(naturaleza):
        ataques = []
        ataques.append(GarraMecanica(2, "GarraMecanica"))
        return Chimpokomon("Gallotronix", 25, naturaleza, ataques)

    @staticmethod
    def Zapato(naturaleza):
        ataques = []
        ataques.append(Zapatazo( 1, "Zapatazo"))
        return Chimpokomon("Zapato", 30, naturaleza, ataques)

    @staticmethod
    def ZapatoConDosAtaques(naturaleza):
        ataques = []
        ataques.append(Zapatazo( 1, "Zapatazo"))
        ataques.append(PomadaWassington(0, "PomadaWassington"))
        return Chimpokomon("ZapatoConDosAtaques", 30, naturaleza, ataques)