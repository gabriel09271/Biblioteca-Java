public class Professor extends Usuario{

    public Professor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public int limiteEmprestimo() {
        return 5;
    };
};
