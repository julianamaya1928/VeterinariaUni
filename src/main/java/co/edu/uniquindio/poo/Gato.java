package co.edu.uniquindio.poo;

public class Gato extends Mascota {
    private String colorPelaje;

    public Gato(String nombre, int edad, double peso, String dueño, String tipo, String colorPelaje) {
        super(nombre, edad, peso, dueño, tipo);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String toString() {
        return "Gato [colorPelaje=" + colorPelaje + ", getNombre()=" + getNombre() + ", getColorPelaje()="
                + getColorPelaje() + ", getDueño()=" + getDueño() + ", getEdad()=" + getEdad() + ", getTipo()="
                + getTipo() + ", getPeso()=" + getPeso() + ", toString()=" + super.toString() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + "]";
    }


}
