package DigitalFC;

public class Jugador implements Comparable<Jugador>{
    private int nroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(int nroCamiseta, String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return Integer.compare(nroCamiseta, otroJugador.nroCamiseta);
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }
}
