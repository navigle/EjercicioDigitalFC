package DigitalFC;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> listaDeJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        listaDeJugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        listaDeJugadores.add(jugador);
    }

    public void mostrarJugadorTitular() {
        System.out.println("Jugadores Titulares:");
        listaDeJugadores.stream()
                .filter(Jugador::getEsTitular)
                .sorted(Comparator.comparingInt(Jugador::getNroCamiseta))
                .forEach(jugador -> System.out.println(jugador.getNombre() + " - " + jugador.getNroCamiseta()));

    }

    public int getCantidadJugadoresLesionados() {
        return (int) listaDeJugadores.stream()
                .filter(Jugador::getEstaLesionado)
                .filter(Jugador::getEsTitular)
                .count();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getListaDeJugadores() {
        return listaDeJugadores;
    }
}
