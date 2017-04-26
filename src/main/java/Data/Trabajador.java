package Data;

import java.util.ArrayList;

/**
 * Created by Familia on 3/27/2017.
 */
public class Trabajador {
    private int id;
    private String nombre;
    private String cargo;
    private String nivel_C;
    private String genero;
    private String anios_Org;
    private String anios_Carg;
    private String titulos;
    private ArrayList<Preguntas> list_Preg = new ArrayList<Preguntas>();


    public Trabajador(int id, String cargo, String nivel_C, String genero, String anios_Org, String anios_Carg, String titulos, Preguntas list_Preg) {

        this.id = id;
        this.cargo = cargo;
        this.nivel_C = nivel_C;
        this.genero = genero;
        this.anios_Org = anios_Org;
        this.anios_Carg = anios_Carg;
        this.titulos = titulos;
        this.list_Preg.add(list_Preg);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel_C() {
        return nivel_C;
    }

    public void setNivel_C(String nivel_C) {
        this.nivel_C = nivel_C;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAnios_Org() {
        return anios_Org;
    }

    public void setAnios_Org(String anios_Org) {
        this.anios_Org = anios_Org;
    }

    public String getAnios_Carg() {
        return anios_Carg;
    }

    public void setAnios_Carg(String anios_Carg) {
        this.anios_Carg = anios_Carg;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public ArrayList<Preguntas> getList_Preg() {
        return list_Preg;
    }

    public void setList_Preg(ArrayList<Preguntas> list_Preg) {
        this.list_Preg = list_Preg;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", nivel_C='" + nivel_C + '\'' +
                ", genero='" + genero + '\'' +
                ", anios_Org='" + anios_Org + '\'' +
                ", anios_Carg='" + anios_Carg + '\'' +
                ", titulos='" + titulos + '\'' +
                ", list_Preg=" + list_Preg +
                '}';
    }
}
