import Veterinaria.*;

public class Main {
    public static void main(String[] args) {

        /* 
         * Se inicializa un arreglo sin lógica innecesaria
         * Evita el antipatrón "Lógica en main" (demasiado código aquí).
         */
        Animal[] animales = new Animal[2];

        animales[0] = new Perro("Firulais", "Café", "Croquetas");
        animales[1] = new Perro("Max", "Negro", "Pollo");

        Veterinaria veterinaria = new Veterinaria("El Perro Feliz", animales);

        veterinaria.mostrarAnimales();
        veterinaria.tratarAnimales();
        veterinaria.mostrarAnimales();
    }
}
