package pessoas;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];
        Livro[] livros = new Livro[3];

        pessoas[1] = new Pessoa("Matheus de Amorim", 25, 1);
        pessoas[2] = new Pessoa("Vinicius de Morais", 45, 1);

        livros[0] = new Livro("Dom casmurro", pessoas[2], 220, pessoas[1]);

        livros[0].detalhes();


    }
}
