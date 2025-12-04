package Veterinaria;
import java.util.Random;
import java.util.Scanner;

public abstract class Animal {

    /* 
     * Enum correcto para evitar usar cadenas sueltas
     * Evita el antipatrón: "Magic Strings"
     */
    public enum padecimientos {
        GRIPE, FRACTURA, INFECCION, OTRO
    }

    protected String nombre, colorPelaje, comidaFavorita;
    protected padecimientos padecimiento;

    /*
     * Se evita cerrar este Scanner en clases hijas
     * Antes: antipatrón Resource Leak y cerrar System.in accidentalmente.
     */
    Scanner scanner = new Scanner(System.in);

    public abstract void registrarAnimal();
    public abstract padecimientos revisarAnimal();
    public abstract void tratarAnimal();

    public Animal(String nombre, String colorPelaje, String comidaFavorita) {
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.comidaFavorita = comidaFavorita;

        /* 
         * Se asigna un padecimiento automáticamente
         * Esto evita el antipatrón de dejar atributos sin inicializar.
         */
        asignarPadecimientoAleatorio();
    }

    public void mostrarInfoBasica() {

        System.out.println("\nNombre: " + nombre);
        System.out.println("Color de Pelaje: " + colorPelaje);
        System.out.println("Comida Favorita: " + comidaFavorita);
        System.out.println("El animal presenta el siguiente padecimiento: " + padecimiento + "\n" );
    }

    public void asignarPadecimientoAleatorio() {
        Random random = new Random();
        padecimientos[] valores = padecimientos.values();
        this.padecimiento = valores[random.nextInt(valores.length)];
    }
}
