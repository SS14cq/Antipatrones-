import Veterinaria.*;
public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];
        
        animales[0] = new Perro("Firulais", "Café", "Croquetas");
        animales[1] = new Perro("Max", "Negro", "Pollo");
        
        Veterinaria veterinaria = new Veterinaria("El perro Feliz", animales);

        veterinaria.mostrarAnimales();
        veterinaria.tratarAnimales();
        veterinaria.mostrarAnimales();
    }
}