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
        ataques.append(CañonConico())
        ataques.append(RayoVeloz())
        return Chimpokomon("Carnotron", 20, naturaleza, ataques)

    @staticmethod
    def Gallotronix(naturaleza):
        ataques = []
        ataques.append(GarraMecanica())
        return Chimpokomon("Gallotronix", 25, naturaleza, ataques)

    @staticmethod
    def Zapato(naturaleza):
        print(naturaleza)
        ataques = []
        ataques.append(Zapatazo())
        return Chimpokomon("Zapato", 30, naturaleza, ataques)

    @staticmethod
    def ZapatoConDosAtaques(naturaleza):
        ataques = []
        ataques.append(Zapatazo())
        ataques.append(PomadaWassington())
        return Chimpokomon("ZapatoConDosAtaques", 30, naturaleza, ataques)