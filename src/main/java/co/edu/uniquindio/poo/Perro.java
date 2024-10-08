package co.edu.uniquindio.poo;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, double peso, String dueño, String tipo, String raza) {
        super(nombre, edad, peso, dueño, tipo);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro [raza=" + raza + ", getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getDueño()="
                + getDueño() + ", getEdad()=" + getEdad() + ", getTipo()=" + getTipo() + ", getPeso()=" + getPeso()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + "]";
    } 

    
    
}
