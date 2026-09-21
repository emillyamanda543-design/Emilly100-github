public class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    double velocidade;

    void acelerar() {
        velocidade = velocidade + 10;
        System.out.println("O carro acelerou.");
    }

    void frear() {
        velocidade = velocidade - 10;
        System.out.println("O carro freou.");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }
}