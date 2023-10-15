package paquete;

class Primero extends Thread {
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Primero " + i);
            try {
                Thread.sleep(100); // Detiene la ejecución durante 100 milisegundos (0.1 segundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}