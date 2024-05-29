package Ejercicios;

public class Tarea {
    public int tarea () {
        // Generate random number from 100 to 500
        int random = (int) (Math.random() * 401) + 100;
        try {
            Thread.sleep(random);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return random;
    }
}
