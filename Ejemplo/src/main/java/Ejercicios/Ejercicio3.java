package Ejercicios;

import java.util.concurrent.CompletableFuture;

public class Ejercicio3 {
    public static void main(String[] args) {
        Tarea tarea = new Tarea();
        CompletableFuture<Integer> tarea_async_1 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_2 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_3 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_4 = CompletableFuture.supplyAsync(tarea::tarea);

        CompletableFuture<Void> tareas = CompletableFuture.allOf(tarea_async_1, tarea_async_2, tarea_async_3, tarea_async_4);
        tareas.thenRun(() -> {
            System.out.println("Todas las tareas han terminado");
            int sumatoria = tarea_async_1.join() + tarea_async_2.join() + tarea_async_3.join() + tarea_async_4.join();
            System.out.println("La sumatoria de las tareas es: " + sumatoria);
        });
    }
}
