package Veterinaria;

public class Veterinaria {
    String nombre;
    Animal[] animals;

    public Veterinaria (String nombre, Animal[] animals ){
        this.nombre = nombre;
        this.animals = animals;
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
