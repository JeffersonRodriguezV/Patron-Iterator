package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class EstadoTareasPendientes implements EstadoListaTareas {

    // Lista de tareas pendientes
    private List<String> tareas = new ArrayList<>();

    // Implementación del método agregarTarea() para agregar una nueva tarea a la lista
    @Override
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    // Implementación del método completarTarea() para marcar una tarea como completada
    @Override
    public void completarTarea(int indice) {
        // Verificar si el índice está dentro del rango válido
        if (indice >= 0 && indice < tareas.size()) {
            System.out.println("Completando tarea: " + tareas.get(indice));
            // Eliminar la tarea completada de la lista
            tareas.remove(indice);
        }
    }

    // Implementación del método mostrarTareas() para mostrar todas las tareas pendientes
    @Override
    public void mostrarTareas() {
        System.out.println("Tareas pendientes:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }


    
}
