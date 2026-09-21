public class Teste {

    public static void main(String[] args) {

        // Dois carros
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.cor = "Prata";
        carro1.ano = 2024;
        carro1.velocidade = 0;

        Carro carro2 = new Carro();
        carro2.marca = "Chevrolet";
        carro2.modelo = "Onix";
        carro2.cor = "Branco";
        carro2.ano = 2023;
        carro2.velocidade = 0;

        carro1.mostrarDados();
        carro1.acelerar();

        carro2.mostrarDados();
        carro2.acelerar();


        // Dois celulares
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S25";
        celular1.cor = "Preto";
        celular1.armazenamento = 256;
        celular1.bateria = 80;

        Celular celular2 = new Celular();
        celular2.marca = "Motorola";
        celular2.modelo = "Edge";
        celular2.cor = "Azul";
        celular2.armazenamento = 128;
        celular2.bateria = 60;

        celular1.mostrarDados();
        celular1.ligar();

        celular2.mostrarDados();
        celular2.carregar();


        // Dois livros
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.editora = "Editora A";
        livro1.paginas = 256;
        livro1.preco = 39.90;

        Livro livro2 = new Livro();
        livro2.titulo = "Iracema";
        livro2.autor = "José de Alencar";
        livro2.editora = "Editora B";
        livro2.paginas = 192;
        livro2.preco = 29.90;

        livro1.mostrarDados();
        livro1.abrir();

        livro2.mostrarDados();
        livro2.fechar();
    }
}