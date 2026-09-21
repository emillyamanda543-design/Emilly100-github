public class Celular {

    String marca;
    String modelo;
    String cor;
    int armazenamento;
    int bateria;

    void ligar() {
        System.out.println("O celular foi ligado.");
    }

    void carregar() {
        bateria = 100;
        System.out.println("O celular foi carregado.");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Bateria: " + bateria + "%");
    }
}