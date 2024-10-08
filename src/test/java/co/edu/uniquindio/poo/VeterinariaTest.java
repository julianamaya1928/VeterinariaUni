package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VeterinariaTest {

    private Veterinaria veterinaria;

    @BeforeEach
    public void setUp() {
        veterinaria = new Veterinaria();
    }
    @Test
    public void testAgregarPerro() {
        List<Animal> animales = new ArrayList<>();
        String nombre = "Juan";
        int edad = 5;
        double peso = 5.0;
        String raza = "Chanda";
        String dueño = "Amaya";
        String tipo="Perro";
        Perro perro = new Perro(nombre, edad, peso, raza, dueño,tipo);
        animales.add(perro);
        
        // Comprueba si el perro fue agregado correctamente
        assertFalse(veterinaria.existeAnimal(nombre));
        
    }
    @Test
    public void testAgregarGato() {
        List<Animal> animales = new ArrayList<>();
        String nombre = "Juan";
        int edad = 5;
        double peso = 5.0;
        String colorPelaje = "azul";
        String dueño = "Amaya";
        String tipo="Perro";
        Gato gato = new Gato(nombre, edad, peso, colorPelaje, dueño,tipo);
        animales.add(gato);
        
        // Comprueba si el gato fue agregado correctamente
        assertFalse(veterinaria.existeAnimal(nombre));
        
    }
    @Test
    public void testAgregarLeon() {
        List<Animal> animales = new ArrayList<>();
        String nombre = "Juan";
        int edad = 5;
        double peso = 5.0;
        String comportamientoInstintivo = "cazar";
        String habitat = "bosque";
        String melena = "si";
        String habilidadCazar ="yes";

        Leon leon = new Leon(nombre, edad, peso, comportamientoInstintivo,habitat,melena.equalsIgnoreCase("si"),habilidadCazar);
        animales.add(leon);
        
        // Comprueba si el leon fue agregado correctamente
        assertFalse(veterinaria.existeAnimal(nombre));
        
    }

    @Test
    public void testAgregarAve() {
        List<Animal> animales = new ArrayList<>();
        String nombre = "Juan";
        int edad = 5;
        double peso = 5.0;
        String comportamientoInstintivo = "cazar";
        String habitat = "bosque";
        String tipoAve = "Canario";
        double envergaduraAlas = 15.0;

        Ave ave = new Ave(nombre, edad, peso, tipoAve,habitat,comportamientoInstintivo,envergaduraAlas);
        
        animales.add(ave);
        
        // Comprueba si el ave fue agregado correctamente
        assertFalse(veterinaria.existeAnimal(nombre));
        
    }
}
