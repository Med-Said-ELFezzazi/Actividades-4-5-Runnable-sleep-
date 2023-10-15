package paquete;

public class Actividad4 {
    public static void main(String[] args) {
        Thread t = new Thread(new Posicion());
        t.start();
        System.out.println("Fin programa");
    }
}

class Posicion implements Runnable {
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Primero " + i);
            System.out.println("Segundo " + i);
        }
    }
}

