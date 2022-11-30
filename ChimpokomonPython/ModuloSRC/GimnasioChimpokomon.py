from Chimpokomons.ChimpokomonFactory import ChimpokomonFactory
from Logger.Level import Nivel
from Logger.Logger import Logger
from Naturaleza.Naturaleza import Naturalezas

class GimnasioChimpokomon():

    def __init__(self, chimpokomonAtacante, chimpokomonEnemigo):
        self.chimpokomonAtacante = chimpokomonAtacante
        self.chimpokomonEnemigo = chimpokomonEnemigo


    Logger.instance(Nivel.INFO)

    def peleaChimpokomones(self):
        while not self.chimpokomonAtacante.estaDerrotado() and not self.chimpokomonEnemigo.estaDerrotado():
            self.chimpokomonAtacante.pelearContra(self.chimpokomonEnemigo)
            self.chimpokomonEnemigo.pelearContra(self.chimpokomonAtacante)
        if self.chimpokomonEnemigo.estaDerrotado():
            Logger.instance().info(str(self.chimpokomonAtacante) + ' Es el ganador')
        else:
            Logger.instance().info(str(self.chimpokomonEnemigo) + ' Es el ganador')

Logger.instance(Nivel.INFO)
batallar = GimnasioChimpokomon(ChimpokomonFactory.Zapato(Naturalezas.COSA), ChimpokomonFactory.ZapatoConDosAtaques(Naturalezas.COSA))
batallar.peleaChimpokomones()

        



# if __name__ == "__main__":
#         print("Bienvenido al gimnasio de Chimpokomon")
      

#         gimnasio = GimnasioChimpokomon(ChimpokomonFactory.Zapato(Naturalezas.COSA), ChimpokomonFactory.ZapatoConDosAtaques(Naturalezas.COSA))

#         gimnasio.peleaChimpokomones()

#         print(gimnasio.log1._info)
