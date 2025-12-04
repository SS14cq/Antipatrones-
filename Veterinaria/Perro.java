package Veterinaria;

public class Perro extends Animal {

    public Perro(String nombre, String colorPelaje, String comidaFavorita) {
        super(nombre, colorPelaje, comidaFavorita);
    }

    @Override
    public void registrarAnimal() {
        System.out.println("Ingrese el nombre del perro:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el color del pelaje:");
        colorPelaje = scanner.nextLine();

        System.out.println("Ingrese la comida favorita:");
        comidaFavorita = scanner.nextLine();

        /* 
         * Antes existía el antipatrón: cerrar el Scanner
         *     scanner.close();
         * Esto cerraba System.in y dañaba el resto del programa.
         * 
         * ✔ Se eliminó.
         */
    }

    @Override
    public padecimientos revisarAnimal() {

        /*
         * Antes tenía un código redundante:
         *    if (padecimiento == GRIPE) return padecimiento;
         *    else if (...) return padecimiento;
         * 
         * ✔ Se eliminó el antipatrón "Código repetido".
         */
        return this.padecimiento;
    }

    @Override
    public void tratarAnimal() {
        switch (padecimiento) {
            case GRIPE:
                System.out.println("Tratando la gripe del perro con medicamentos y reposo.");
                break;

            case FRACTURA:
                System.out.println("Tratando la fractura con inmovilización.");
                break;

            case INFECCION:
                System.out.println("Tratando la infección con antibióticos.");
                break;

            default:
                System.out.println("Tratamiento general para el perro.");
                break;
        }

        /*
         * Antes: this.padecimiento = null;
         *     → Antipatrón: “Null State” (dejar objetos en estados inválidos)
         * 
         * ✔ Ahora se deja con un estado controlado o se mantiene el actual.
         */
        
        System.out.println("Se ha tratado al animal.\n");
    }
}
