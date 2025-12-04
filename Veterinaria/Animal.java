package Veterinaria;
import java.util.Random;

public abstract class Animal {

    public enum Padecimiento {
        GRIPE, FRACTURA, INFECCION, OTRO
    }

    protected String nombre, colorPelaje, comidaFavorita;
    protected Padecimiento padecimiento;

    public Animal(String nombre, String colorPelaje, String comidaFavorita) {
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.comidaFavorita = comidaFavorita;
        asignarPadecimientoAleatorio();
    }

    public abstract void tratarAnimal();

    public void mostrarInfoBasica() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Color de Pelaje: " + colorPelaje);
        System.out.println("Comida Favorita: " + comidaFavorita);
        System.out.println("Padecimiento: " + padecimiento + "\n");
    }

    private void asignarPadecimientoAleatorio() {
        Random random = new Random();
        Padecimiento[] valores = Padecimiento.values();
        this.padecimiento = valores[random.nextInt(valores.length)];
    }

    public Padecimiento getPadecimiento() {
        return padecimiento;
    }
}
