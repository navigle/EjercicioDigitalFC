package DigitalFC;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Equipo equipo = new Equipo("Digital Futbol Club");
        equipo.agregarJugador(new Jugador(10, "Juanito", true,true));
        equipo.agregarJugador(new Jugador(5, "Pepe", true,true));
        equipo.agregarJugador(new Jugador(12, "Eric", false, false));
        equipo.agregarJugador( new Jugador(3,"Claudio",true, false));
        equipo.agregarJugador(new Jugador(1, "tito", true, true));
        equipo.agregarJugador(new Jugador(7, "Kike", false, true));

        equipo.mostrarJugadorTitular();
        int lesionados = equipo.getCantidadJugadoresLesionados();

        System.out.println("Jugadores lesionados" + lesionados);
    }
}
