public class Dinossauro {

    private int energia;
    private int velocidade;
    private int temperatura;
    private String humor;

    public Dinossauro(int energia, int velocidade,
                      int temperatura, String humor) {

        this.energia = energia;
        this.velocidade = velocidade;
        this.temperatura = temperatura;
        this.humor = humor;
    }

    public void pular() {
        energia--;
        velocidade--;
        humor = "Feliz";

        System.out.println("Skeep pulou!");
    }

    public void correr() {
        energia--;
        velocidade--;
        humor = "Feliz";

        System.out.println("Skeep correu!");
    }

    public void comer() {
        energia++;
        velocidade--;
        humor = "Feliz";

        System.out.println("Skeep comeu!");
    }

    public void cantar() {
        energia--;
        humor = "Feliz";

        System.out.println("Skeep cantou!");
    }

    public void tomarSol() {
        velocidade++;
        temperatura++;
        humor = "Feliz";

        System.out.println("Skeep tomou sol!");
    }

    public void ficarNaSombra() {
        energia++;
        temperatura--;
        humor = "Triste";

        System.out.println("Skeep ficou na sombra!");
    }

    public void exibirCaracteristicas() {

        System.out.println("\n=== SKEEP ===");
        System.out.println("Energia: " + energia);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humor: " + humor);
    }
}