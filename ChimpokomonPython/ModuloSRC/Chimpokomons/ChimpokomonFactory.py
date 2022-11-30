from Ataque.CañonConico import CañonConico
from Ataque.GarraMecanica import GarraMecanica
from Ataque.PomadaWassington import PomadaWassington
from Ataque.RayoVeloz import RayoVeloz
from Ataque.Zapatazo import Zapatazo
from Chimpokomons.Chimpokomon import Chimpokomon


class ChimpokomonFactory():

    @staticmethod
    def Carnotron(self, naturaleza):
        ataques = []
        ataques.append(CañonConico( 4, "CañonConico"))
        ataques.append(RayoVeloz(self, 3, "RayoVeloz"))
        return Chimpokomon("Carnotron", 20, naturaleza, ataques)

    @staticmethod
    def Gallotronix(self, naturaleza):
        ataques = []
        ataques.append(GarraMecanica(self, 2, "GarraMecanica"))
        return Chimpokomon("Gallotronix", 25, naturaleza, ataques)

    @staticmethod
    def Zapato(self, naturaleza):
        ataques = []
        ataques.append(Zapatazo(self, 1, "Zapatazo"))
        return Chimpokomon("Zapato", 30, naturaleza, ataques)

    @staticmethod
    def ZapatoConDosAtaques(self, naturaleza):
        ataques = []
        ataques.append(Zapatazo(self, 1, "Zapatazo"))
        ataques.append(PomadaWassington(self, 0, "PomadaWassington"))
        return Chimpokomon("ZapatoConDosAtaques", 30, naturaleza, ataques)