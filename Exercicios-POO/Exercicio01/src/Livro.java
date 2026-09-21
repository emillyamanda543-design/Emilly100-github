public class Livro {

    String titulo;
    String autor;
    String editora;
    int paginas;
    double preco;

    void abrir() {
        System.out.println("O livro foi aberto.");
    }

    void fechar() {
        System.out.println("O livro foi fechado.");
    }

    void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Páginas: " + paginas);
        System.out.println("Preço: R$ " + preco);
    }
}