package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();

        String[] opciones = {"Agregar Perro", "Agregar Gato", "Agregar León", "Agregar Ave", "Listar Animales", "Salir"};
        String opcion;

        do {
            opcion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción",
                    "Menú de Veterinaria", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcion != null) {
                switch (opcion) {
                    case "Agregar Perro":
                        veterinaria.agregarPerro();
                        veterinaria.listarPerros();
                        break;
                    case "Agregar Gato":
                        veterinaria.agregarGato();
                        veterinaria.listarGatos();
                        break;
                    case "Agregar León":
                        veterinaria.agregarLeon();
                        veterinaria.listarLeones();
                        break;
                    case "Agregar Ave":
                        veterinaria.agregarAve();
                        veterinaria.listarAves();
                        break;
                    case "Listar Animales":
                        veterinaria.listarAves();
                        veterinaria.listarGatos();
                        veterinaria.listarPerros();
                        veterinaria.listarLeones();
                        break;
                    case "Salir":
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            }
        } while (!"Salir".equals(opcion));
    }
}
