from Chimpokomons.ChimpokomonFactory import ChimpokomonFactory
from Logger.Level import Level
from Logger.Logger import Logger
from Naturaleza.Naturaleza import Naturalezas

class GimnasioChimpokomon():

    def __init__(self, chimpokomonAtacante, chimpokomonEnemigo):
        self.chimpokomonAtacante = chimpokomonAtacante
        self.chimpokomonEnemigo = chimpokomonEnemigo


    Logger.instance(Level.INFO)

    def peleaChimpokomones(self):
        while not self.chimpokomonAtacante.estaDerrotado() and not self.chimpokomonEnemigo.estaDerrotado():
            self.chimpokomonAtacante.pelearContra(self.chimpokomonEnemigo)
            Logger.instance().info('La vida de ' + str(self.chimpokomonAtacante.nombre) + ' es ' + str(self.chimpokomonAtacante.nivelDeVida))
            self.chimpokomonEnemigo.pelearContra(self.chimpokomonAtacante)
            Logger.instance().info('La vida de ' + str(self.chimpokomonEnemigo.nombre) + ' es ' + str(self.chimpokomonEnemigo.nivelDeVida))
        if self.chimpokomonEnemigo.estaDerrotado():
            Logger.instance().info(str(self.chimpokomonAtacante.nombre) + ' Es el ganador')
        else:
            Logger.instance().info(str(self.chimpokomonEnemigo.nombre) + ' Es el ganador')

Logger.instance(Level.INFO)
batallar = GimnasioChimpokomon(ChimpokomonFactory.Zapato(Naturalezas.COSA), ChimpokomonFactory.ZapatoConDosAtaques(Naturalezas.COSA))
batallar.peleaChimpokomones()
        



# if __name__ == "__main__":
#         print("Bienvenido al gimnasio de Chimpokomon")
      

#         gimnasio = GimnasioChimpokomon(ChimpokomonFactory.Zapato(Naturalezas.COSA), ChimpokomonFactory.ZapatoConDosAtaques(Naturalezas.COSA))

#         gimnasio.peleaChimpokomones()

#         print(gimnasio.log1._info)
