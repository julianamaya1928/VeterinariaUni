package co.edu.uniquindio.poo;

public class AnimalSalvaje extends Animal {
    private String habitat; 
    private String comportamientoInstintivo;
    
    public AnimalSalvaje(String nombre, int edad, double peso, String habitat, String comportamientoInstintivo) {
        super(nombre, edad, peso);
        this.habitat = habitat;
        this.comportamientoInstintivo = comportamientoInstintivo;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getComportamientoInstintivo() {
        return comportamientoInstintivo;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setComportamientoInstintivo(String comportamientoInstintivo) {
        this.comportamientoInstintivo = comportamientoInstintivo;
    }

    @Override
    public String toString() {
        return "AnimalSalvaje [habitat=" + habitat + ", comportamientoInstintivo=" + comportamientoInstintivo
                + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso()
                + ", getHabitat()=" + getHabitat() + ", getComportamientoInstintivo()=" + getComportamientoInstintivo()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + "]";
    }

    public void comportarse() {
        System.out.println(getNombre() + " está actuando por instinto.");
    }

}
