public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10, 10);
        Livro livro = new Livro(1, "O Hobbit,");
        Livro livro1 = new Livro(2, "O Senhor dos Anéis: A Sociedade do Anel");
        Livro livro2 = new Livro(3, "1984");
        Revista revista = new Revista(4, "Ciência Hoje");
        Revista revista1 = new Revista(5, "O Clarim Diário");
        Dvd dvd = new Dvd(6, "Michael Jackson");

        biblioteca.cadastrarItem(livro);
        biblioteca.cadastrarItem(livro1);
        biblioteca.cadastrarItem(livro2);
        biblioteca.cadastrarItem(revista);
        biblioteca.cadastrarItem(revista1);
        biblioteca.cadastrarItem(dvd);

        Aluno aluno = new Aluno("Gabriel", "gabriel123@gmail.com", "124");
        Professor professor = new Professor("Jefferson", "jefferson@gmail.com", "146");

        biblioteca.cadastrarUsuario(aluno);
        biblioteca.cadastrarUsuario(professor);

        biblioteca.emprestar(1, "Gabriel");
        biblioteca.emprestar(2, "Gabriel");
        biblioteca.emprestar(3, "Gabriel");
        biblioteca.emprestar(4, "Gabriel");

        biblioteca.listarAcervo();

        biblioteca.devolver(3, "Gabriel");

        biblioteca.emprestar(4, "Gabriel");

        biblioteca.emprestar(3, "Jefferson");
        biblioteca.emprestar(5, "Jefferson");

//         testando o marcarEmprestado
        biblioteca.emprestar(4, "Jefferson");

//        inserindo a categoria DVD

        biblioteca.emprestar(6, "Jefferson");
        biblioteca.listarAcervo();

    };
};
