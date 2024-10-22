package com.biblioteca.mantener;

public class Libro extends General{
    private int edicion;
    private int anioPublicacion;
    private Autor autor;

    public Libro() {

    }

    public Libro(int edicion, int anioPublicacion, Autor autor){
    this.anioPublicacion = anioPublicacion;
    this.edicion = edicion;
    this.autor = autor;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public String toString() {
        return "Libro {" + super.toString() + "Edicion =" + edicion + ", Año Publicacion = " + anioPublicacion + ", Autor= " + autor + '}';
    }
}
