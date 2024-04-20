package co.edu.uniquindio.poo;

public class ListaTareas {

   // Estado actual de la lista de tareas
   private EstadoListaTareas estadoActual;

   // Constructor que inicializa la lista de tareas con el estado "Sin Tareas"
   public ListaTareas() {
       estadoActual = new EstadoSinTareas();
   }

   // Método para cambiar el estado de la lista de tareas
   public void cambiarEstado(EstadoListaTareas estado) {
       estadoActual = estado;
   }

   // Método para agregar una tarea a la lista
   public void agregarTarea(String tarea) {
       estadoActual.agregarTarea(tarea);
   }

   // Método para marcar una tarea como completada
   public void completarTarea(int indice) {
       estadoActual.completarTarea(indice);
   }

   // Método para mostrar las tareas pendientes
   public void mostrarTareas() {
       estadoActual.mostrarTareas();
   }
    
}
