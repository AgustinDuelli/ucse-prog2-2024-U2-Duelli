package Ejercicios;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Ejercicio4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Tarea tarea = new Tarea();
        CompletableFuture<Integer> tarea_async_1 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_2 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_3 = CompletableFuture.supplyAsync(tarea::tarea);
        CompletableFuture<Integer> tarea_async_4 = CompletableFuture.supplyAsync(tarea::tarea);

        // Busca la primera tarea terminada
        CompletableFuture<Object> result = CompletableFuture.anyOf(tarea_async_1, tarea_async_2, tarea_async_3, tarea_async_4);

        System.out.println("La primera tarea en terminar fue: " + result.getClass().getName());
        System.out.println("Tarea completada: "+ result.get());
    }
}
