from ChimpokomonPython.ModuloSRC.Chimpokomon import Chimpokomon
from ChimpokomonPython.ModuloSRC.Gallotronix import Gallotronix
from ChimpokomonPython.ModuloSRC.GarraMecanica import *
import Zapatazo as Zapatazo
import PomadaWassington as PomadaWassington
import Zapato as Zapato
import LoggerAux as LOGGER
import Ataque as Ataque


class GimnasioChimpokomon():

    def __init__(self, chimpokomonA, chimpokomonB):
        self.chimpokomonA = chimpokomonA
        self.chimpokomonB = chimpokomonB

    log1 = LOGGER.LoggerAux()

    def peleaChimpokomones(self, chimpokomonA, chimpokomonB):
        while not chimpokomonA.estaDerrotado() and not chimpokomonB.estaDerrotado():
            chimpokomonA.pelearContra(chimpokomonB)
            chimpokomonB.pelearContra(chimpokomonA)
        if chimpokomonB.estaDerrotado():
            LOGGER.LoggerAux.setInfo(
                "El chimpokomon " + chimpokomonA.getNombre() + " ha ganado")
        else:
            LOGGER.LoggerAux.setInfo(
                "El chimpokomon " + chimpokomonB.getNombre() + " ha ganado")


class main():
    def main(self):
        print("Bienvenido al gimnasio de Chimpokomon")
        ataque1 = [Ataque()]
        ataque2 = [Ataque()]

        ataque1.insert(Zapatazo())
        ataque2.insert(Zapatazo())
        ataque2.insert(PomadaWassington())

        gimnasio = GimnasioChimpokomon(Zapato(3, ataque1), Zapato(1, ataque2))

        gimnasio.peleaChimpokomones()

        print(gimnasio.log1._info)



if __name__ == "__main__":
        print("Bienvenido al gimnasio de Chimpokomon")
      
        chimpokomon = Zapato(3, Zapatazo())
        chimpokomon2 = Gallotronix(3, GarraMecanica())

        gimnasio = GimnasioChimpokomon(chimpokomon,chimpokomon2)

        gimnasio.peleaChimpokomones()

        print(gimnasio.log1._info)
