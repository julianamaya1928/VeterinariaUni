package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    private List<Animal> animales;
    private List<Mascota> mascotas;
    private List<AnimalSalvaje> animalesSalvajes;

    // Constructor
    public Veterinaria() {
        animales = new ArrayList<>();
        mascotas = new ArrayList<>();
        animalesSalvajes = new ArrayList<>();
    }

    public boolean existeAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void agregarPerro() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del perro:");
        if (existeAnimal(nombre)) {
            JOptionPane.showMessageDialog(null, "El perro ya existe.");
            return;
        }

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del perro:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del perro:"));
        String raza = JOptionPane.showInputDialog("Ingrese la raza del perro:");
        String dueño = JOptionPane.showInputDialog("Ingrese el nombre del dueño:");
        String tipo="Perro";

        Perro perro = new Perro(nombre, edad, peso, raza, dueño,tipo);
        animales.add(perro);
        mascotas.add(perro);
        JOptionPane.showMessageDialog(null, "Se ha agregado el perro: " + nombre);
    }

    public void agregarGato() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del gato:");
        if (existeAnimal(nombre)) {
            JOptionPane.showMessageDialog(null, "El gato ya existe.");
            return;
        }

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del gato:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del gato:"));
        String colorPelaje = JOptionPane.showInputDialog("Ingrese el color del pelaje del gato:");
        String dueño = JOptionPane.showInputDialog("Ingrese el nombre del dueño:");
        String tipo="Gato";
        Gato gato = new Gato(nombre, edad, peso, colorPelaje, dueño,tipo);
        animales.add(gato);
        mascotas.add(gato);
        JOptionPane.showMessageDialog(null, "Se ha agregado el gato: " + nombre);
    }

    public void agregarLeon() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del león:");
        if (existeAnimal(nombre)) {
            JOptionPane.showMessageDialog(null, "El león ya existe.");
            return;
        }

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del león:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del león:"));
        String melena = JOptionPane.showInputDialog("¿Tiene melena (si/no)?");
        String habitat = JOptionPane.showInputDialog("¿Cual es su habitat?");
        String comportamientoInstintivo = JOptionPane.showInputDialog("¿Algun comportamiento instintivo?");
        String habilidadCazar = JOptionPane.showInputDialog("¿Alguna habilidad de caza?");

        Leon leon = new Leon(nombre, edad, peso, comportamientoInstintivo,habitat,melena.equalsIgnoreCase("si"),habilidadCazar);
        animales.add(leon);
        animalesSalvajes.add(leon);
        JOptionPane.showMessageDialog(null, "Se ha agregado el león: " + nombre);
    }

    public void agregarAve() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del ave:");
        if (existeAnimal(nombre)) {
            JOptionPane.showMessageDialog(null, "El ave ya existe.");
            return;
        }

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del ave:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del ave:"));
        double envergaduraAlas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la envergadura de alas del ave:"));
        String habitat = JOptionPane.showInputDialog("¿Cual es su habitat?");
        String comportamientoInstintivo = JOptionPane.showInputDialog("¿Algun comportamiento instintivo?");
        String tipoAve = JOptionPane.showInputDialog("¿Alguna habilidad de caza?");

        Ave ave = new Ave(nombre, edad, peso, tipoAve,habitat,comportamientoInstintivo,envergaduraAlas);
        animales.add(ave);
        animalesSalvajes.add(ave);
        JOptionPane.showMessageDialog(null, "Se ha agregado el ave: " + nombre);
    }
    public void listarPerros() {
        List<Perro> perros = new ArrayList<>();
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                perros.add((Perro) animal);
            }
        }
        if (perros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay perros registrados.");
        } else {
            StringBuilder lista = new StringBuilder("Perros registrados:\n");
            for (Perro perro : perros) {
                lista.append(perro.getNombre())
                    .append(" - Edad: ").append(perro.getEdad())
                    .append(" años, Peso: ").append(perro.getPeso()).append(" kg, Raza: ")
                    .append(perro.getTipo()).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    // Listar Gatos
    public void listarGatos() {
        List<Gato> gatos = new ArrayList<>();
        for (Animal animal : animales) {
            if (animal instanceof Gato) {
                gatos.add((Gato) animal);
            }
        }
        if (gatos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay gatos registrados.");
        } else {
            StringBuilder lista = new StringBuilder("Gatos registrados:\n");
            for (Gato gato : gatos) {
                lista.append(gato.getNombre())
                    .append(" - Edad: ").append(gato.getEdad())
                    .append(" años, Peso: ").append(gato.getPeso()).append(" kg, Color de pelaje: ")
                    .append(gato.getColorPelaje()).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    public void listarLeones() {
        List<Leon> leones = new ArrayList<>();
        for (Animal animal : animales) {
            if (animal instanceof Leon) {
                leones.add((Leon) animal);
            }
        }
        if (leones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay leones registrados.");
        } else {
            StringBuilder lista = new StringBuilder("Leones registrados:\n");
            for (Leon leon : leones) {
                lista.append(leon.getNombre())
                    .append(" - Edad: ").append(leon.getEdad())
                    .append(" años, Peso: ").append(leon.getPeso()).append(" kg, Melena: ")
                    .append(leon.getMelena() ? "Sí" : "No").append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    public void listarAves() {
        List<Ave> aves = new ArrayList<>();
        for (Animal animal : animales) {
            if (animal instanceof Ave) {
                aves.add((Ave) animal);
            }
        }
        if (aves.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay aves registradas.");
        } else {
            StringBuilder lista = new StringBuilder("Aves registradas:\n");
            for (Ave ave : aves) {
                lista.append(ave.getNombre())
                    .append(" - Edad: ").append(ave.getEdad())
                    .append(" años, Peso: ").append(ave.getPeso()).append(" kg, Envergadura de alas: ")
                    .append(ave.getEnvergaduraAlas()).append(" metros\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }}
