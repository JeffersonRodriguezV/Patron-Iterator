package co.edu.uniquindio.poo;

public interface EstadoListaTareas {

     // Método para agregar una tarea a la lista
     void agregarTarea(String tarea);
     
     // Método para marcar una tarea como completada
     void completarTarea(int indice);
     
     // Método para mostrar las tareas pendientes
     void mostrarTareas();
    
}
