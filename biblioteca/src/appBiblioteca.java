import java.util.Scanner;

import  com.biblioteca.mantener.*;

public class appBiblioteca {
    private Libro libro;
    public static void main(String[] args) throws Exception{
        appBiblioteca biblioteca = new appBiblioteca();
        biblioteca.cargar();
        biblioteca.imprimir();
    }
    public void cargar() {
        Scanner sc = new Scanner(System.in);
        libro = new Libro();
        System.out.println("Digite el codigo del libro: ");
        libro.setCodigo(sc.nextInt());
        System.out.println("Digite el nombre del libro: ");
        libro.setNombre(sc.nextLine());
        sc.nextLine();
        System.out.println("Digite el edicion del libro: ");
        libro.setEdicion(sc.nextInt());
        System.out.println("Digite el año de publicacion del libro: ");
        libro.setAñoPublicacion(sc.nextInt());

        Autor autor = new Autor();
        System.out.println("Digite el codigo del autor:");
        autor.setCodigo(sc.nextInt());
        System.out.println("Digite el nombre del libro");
        autor.setNombre(sc.nextLine());
        sc.nextLine();

        libro.setAutor(autor);
        }



    public void imprimir() {
        System.out.println(libro);
    }
}
