from Chimpokomons.ChimpokomonFactory import ChimpokomonFactory
from Logger.Level import Nivel
from Logger.Logger import Logger
from Naturaleza.Naturaleza import Naturalezas


class GimnasioChimpokomon():

    def __init__(self, chimpokomonA, chimpokomonB):
        self._chimpokomonA = chimpokomonA
        self._chimpokomonB = chimpokomonB

    Logger.instance(Nivel.INFO)

    def peleaChimpokomones(self, chimpokomonAtacante, chimpokomonEnemigo):
        while not chimpokomonAtacante.estaDerrotado() and not chimpokomonEnemigo.estaDerrotado():
            chimpokomonAtacante.pelearContra(chimpokomonEnemigo)
            chimpokomonEnemigo.pelearContra(chimpokomonAtacante)
        if chimpokomonEnemigo.estaDerrotado():
            Logger.instance().info(str(chimpokomonAtacante) + ' Es el ganador')
        else:
            Logger.instance().info(str(chimpokomonEnemigo) + ' Es el ganador')


class main():
    def main(self):
        Logger.instance().info("Bienvenido al gimnasio de Chimpokomon")

        gimnasio = GimnasioChimpokomon(ChimpokomonFactory.Zapato(Naturalezas.COSA), ChimpokomonFactory.ZapatoConDosAtaques(Naturalezas.COSA))

        gimnasio.peleaChimpokomones()

        



# if __name__ == "__main__":
#         print("Bienvenido al gimnasio de Chimpokomon")
      

#         gimnasio = GimnasioChimpokomon(ChimpokomonFactory.Zapato(Naturalezas.COSA), ChimpokomonFactory.ZapatoConDosAtaques(Naturalezas.COSA))

#         gimnasio.peleaChimpokomones()

#         print(gimnasio.log1._info)
