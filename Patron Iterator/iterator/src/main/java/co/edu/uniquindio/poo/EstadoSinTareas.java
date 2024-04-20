package co.edu.uniquindio.poo;

public class EstadoSinTareas implements EstadoListaTareas {

    // Implementación del método agregarTarea() para agregar una nueva tarea a la lista
    @Override
    public void agregarTarea(String tarea) {
        System.out.println("Agregando tarea: " + tarea);
    }

    // Implementación del método completarTarea() cuando no hay tareas para completar
    @Override
    public void completarTarea(int indice) {
        System.out.println("No hay tareas para completar.");
    }

    // Implementación del método mostrarTareas() cuando no hay tareas pendientes
    @Override
    public void mostrarTareas() {
        System.out.println("No hay tareas pendientes.");
    }
    
}
