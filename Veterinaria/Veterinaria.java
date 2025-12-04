package Veterinaria;

public class Veterinaria {
    String nombre;
    Animal[] animals;

    public Veterinaria(String nombre, Animal[] animals){
        this.nombre = nombre;
        this.animals = animals;

        /*
         * Aquí se evita el antipatrón "God Object"
         * La veterinaria SOLO coordina, no hace lógica médica.
         */
    }

    public void ingresarAnimales(){
        for(Animal animal : animals){
            animal.registrarAnimal();
        }
    }

    public void mostrarAnimales(){
        for(Animal animal : animals){
            animal.mostrarInfoBasica();
        }
    }

    public void tratarAnimales(){
        for(Animal animal : animals){
            animal.tratarAnimal();
        }
    }
}
