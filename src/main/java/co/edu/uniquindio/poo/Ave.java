package co.edu.uniquindio.poo;

public class Ave extends AnimalSalvaje {
    private String tipoAve; 
    private double envergaduraAlas;
    
    public Ave(String nombre, int edad, double peso, String habitat, String comportamientoInstintivo, String tipoAve,
            double envergaduraAlas) {
        super(nombre, edad, peso, habitat, comportamientoInstintivo);
        this.tipoAve = tipoAve;
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoAve() {
        return tipoAve;
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public String toString() {
        return "Ave [tipoAve=" + tipoAve + ", envergaduraAlas=" + envergaduraAlas + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso() + ", getHabitat()=" + getHabitat()
                + ", getTipoAve()=" + getTipoAve() + ", getComportamientoInstintivo()=" + getComportamientoInstintivo()
                + ", getEnvergaduraAlas()=" + getEnvergaduraAlas() + ", toString()=" + super.toString()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    } 
    
    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }
}
