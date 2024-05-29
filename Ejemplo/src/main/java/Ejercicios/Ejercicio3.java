package Ejercicios;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Ejercicio3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Tarea tarea = new Tarea();
        CompletableFuture<Integer> tarea_async_1 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_2 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_3 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_4 = CompletableFuture.supplyAsync(tarea::tarea);

        int sum = tarea_async_1.get() + tarea_async_2.get() + tarea_async_3.get() + tarea_async_4.get();

        System.out.println("Tareas completadas!");
        System.out.println("Sumatoria de números aleatorios: " + sum);
    }


}
