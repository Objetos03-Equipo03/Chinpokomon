# Trabajo práctico N° 1 Chinpokomon


Los patrones de diseño utilizados fueron decorator y singleton.
Para *java* se utilizó el patrón *singleton*, el decorator no se pudo utilizar porque java no acepta herencia múltiple y para poder implementarlo teníamos que cambiar toda la arquitectura que ya estaba definida.Para esto nos dimos cuenta que la clase Ataque no hacia falta y redifinimos la arquitectura con una clase "Naturaleza".
Esta solo agregaba la funcionalidad de si habia ventaja o desventaja. Por otra parte, agregamos en la clase principal las diferentes naturalezas.
En *Python* utilizamos *singleton* y *decorator* ya que este admite herencia múltiple.

El patrón decorator fue utilizado en el punto 5 ya que había una necesidad de extender una funcionalidad de una clase, para esto hicimos una clase la cual heredaba de la superclase y hacíamos referencia por medio del constructor de esta misma. Luego extendemos la funcionalidad del objeto creado de la superclase.
El patrón singleton fue utilizado en el punto 2, ya que se pedía que sea un clase que se pueda llamar en cualquier parte del código. Se implementó creando en nuestra clase una instancia del objeto y se reguló el alcance del constructor para que no pueda ser instanciada nuevamente.

Hoy 23/09 a 10 minutos de entregarlo, decidi reformar(leandro) el codigo en python ya que el decorator estaba funcionando pero no de la forma que queria e hice un "git restore . path.... " y como consecuencia se restauro todo en ves de un unico path. Los import dejaron de funcionar y no se como arreglarlo.
