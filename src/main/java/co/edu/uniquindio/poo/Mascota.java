package co.edu.uniquindio.poo;

public class Mascota extends Animal {
    private String dueño;
    private String tipo;
    
    public Mascota(String nombre, int edad, double peso, String dueño, String tipo) {
        super(nombre, edad, peso);
        this.dueño = dueño;
        this.tipo = tipo;
    }

    public String getDueño() {
        return dueño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascota [dueño=" + dueño + ", tipo=" + tipo + ", getNombre()=" + getNombre() + ", getDueño()="
                + getDueño() + ", getEdad()=" + getEdad() + ", getTipo()=" + getTipo() + ", getPeso()=" + getPeso()
                + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + "]";
    }
    public void recibirCuidados() {
        System.out.println("Se están brindando cuidados a " + getNombre());
    }
    
}
