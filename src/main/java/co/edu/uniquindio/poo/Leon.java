package co.edu.uniquindio.poo;

public class Leon extends AnimalSalvaje {
    private Boolean melena; 
    private String habilidadCazar;

    public Leon(String nombre, int edad, double peso, String habitat, String comportamientoInstintivo, Boolean melena,
            String habilidadCazar) {
        super(nombre, edad, peso, habitat, comportamientoInstintivo);
        this.melena = melena;
        this.habilidadCazar = habilidadCazar;
    }

    public Boolean getMelena() {
        return melena;
    }

    public String getHabilidadCazar() {
        return habilidadCazar;
    }

    public void setMelena(Boolean melena) {
        this.melena = melena;
    }

    public void setHabilidadCazar(String habilidadCazar) {
        this.habilidadCazar = habilidadCazar;
    }

    @Override
    public String toString() {
        return "Leon [melena=" + melena + ", habilidadCazar=" + habilidadCazar + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getHabitat()=" + getHabitat()
                + ", getMelena()=" + getMelena() + ", getComportamientoInstintivo()=" + getComportamientoInstintivo()
                + ", getHabilidadCazar()=" + getHabilidadCazar() + ", toString()=" + super.toString() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    

    
}
