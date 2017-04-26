package Data;

import java.util.ArrayList;

/**
 * Created by Familia on 3/27/2017.
 */
public class Empresa {

    private String nombre;
    private ArrayList<Trabajador> trabajadores;

    public Empresa() {
        this.trabajadores = new ArrayList<Trabajador>();
    }

    public Empresa(String nombre, Trabajador trabajadores) {
        this.nombre = nombre;
        this.trabajadores.add(trabajadores);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", trabajadores=" + trabajadores +
                '}';
    }
}
