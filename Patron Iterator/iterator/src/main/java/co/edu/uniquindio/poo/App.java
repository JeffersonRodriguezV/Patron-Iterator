package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ListaTareas listaTareas = new ListaTareas();

        // Cambiar al estado de "Tareas Pendientes"
        listaTareas.cambiarEstado(new EstadoTareasPendientes());

        // Agregar algunas tareas
        listaTareas.agregarTarea("Hacer la compra");
        listaTareas.mostrarTareas();

        // Completar una tarea
        listaTareas.completarTarea(0);
        listaTareas.mostrarTareas();

        // Intentar completar una tarea cuando no hay tareas pendientes
        listaTareas.completarTarea(0);
    }
    
}
