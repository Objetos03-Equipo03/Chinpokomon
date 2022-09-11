package com.codewithmosh;

import java.util.List;

import chimpokomon.Carnotron;
import chimpokomon.CañonConico;
import chimpokomon.Gallotronix;
import chimpokomon.GarraMecanica;
import chimpokomon.GimnasioChimpokomon;
import chimpokomon.RayoVeloz;
import chimpokomon.Zapatazo;
import chimpokomon.Zapato;

public class Main {

    public static void main(String[] args) {
        // Notas: Podes crear ataques y asignarle a cualquier pokemon, quizas deberiamos
        // de hacer una clase que se encargue de eso o implementarle de forma private.

        // Primer Chinpokomon
        RayoVeloz RayoVeloz = new RayoVeloz();
        CañonConico cañonConico = new CañonConico();

        Carnotron carnotron = new Carnotron(List.of(RayoVeloz, cañonConico));

        // Segundo Chinpokomon
        GarraMecanica garraMecanica = new GarraMecanica();
        Gallotronix gallotronix = new Gallotronix(List.of(garraMecanica));
       
        //Tercer chinpokomon
        Zapato zapato = new Zapato(List.of(new Zapatazo()));

        // No dejaba asignarle la pelea, le agregue el public static y anda.
        //Si los pones a pelear te queda el ultimo resultado, quizas podriamos realizar
        //Una excepcion porque termina con "Gallotronix le queda -3 de vida.
        //Carnotron le queda 5 de vida."
        
        // GimnasioChimpokomon.peleaChinpokomonDe_Con_(carnotron, gallotronix);
        GimnasioChimpokomon.peleaChinpokomonDe_Con_(gallotronix,carnotron );
    }
}
