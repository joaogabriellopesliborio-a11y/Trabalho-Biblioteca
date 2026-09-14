package CadastrodeLivro;

import java.util.Scanner;
import java.util.ArrayList;

public class Dados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Livro> catalogo = new ArrayList<>();

        Livro livro = new Livro();

        System.out.println("=== CADASTRO DE LIVRO ===");

        System.out.print("Digite o título: ");
        livro.titulo = entrada.nextLine();

        System.out.print("Digite o autor: ");
        livro.autor = entrada.nextLine();

        System.out.print("Digite o preço: ");
        livro.preco = entrada.nextDouble();

        catalogo.add(livro);

        System.out.println("\nLivro cadastrado com sucesso!");

        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Preço: R$ " + livro.preco);

        entrada.close();
    }
}
