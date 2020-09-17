public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Patrick É O Rei");

        Livro livro = new Livro(autor);
        livro.setValor(59.90);

        System.out.println("Valor atual do livro: " + livro.getValor());

        if (!livro.aplicandoDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior que 30%");

        } else {
            System.out.println("Valor do livro com Desconto: " + livro.getValor());

        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if (!ebook.aplicandoDescontoDe(0.15)) {
            System.out.println("Desconto no ebook não pode ser maior do que 15%");

        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }
    }
}
