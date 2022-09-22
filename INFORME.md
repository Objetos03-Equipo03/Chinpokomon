# Trabajo práctico N° 1 Chinpokomon

Los patrones de diseño utilizados fueron decorator y singleton.
Para *java* se utilizó el patrón *singleton*, el decorator no se pudo utilizar porque java no acepta herencia múltiple y para poder implementarlo teníamos que cambiar toda la arquitectura que ya estaba definida.
En *Python* utilizamos *singleton* y *decorator* ya que este admite herencia múltiple.

El patrón decorator fue utilizado en el punto 5 ya que había una necesidad de extender una funcionalidad de una clase, para esto hicimos una clase la cual heredaba de la superclase y hacíamos referencia por medio del constructor de esta misma. Luego extendemos la funcionalidad del objeto creado de la superclase.
El patrón singleton fue utilizado en el punto 2, ya que se pedía que sea un clase que se pueda llamar en cualquier parte del código. Se implementó creando en nuestra clase una instancia del objeto y se reguló el alcance del constructor para que no pueda ser instanciada nuevamente.

