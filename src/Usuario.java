public abstract class Usuario {

    String nome;
    String email;
    String senha;
    int quantidadeEmprestada;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.quantidadeEmprestada = 0;
    }

    public abstract int limiteEmprestimo();

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }

    public boolean podeEmprestar() {
        return quantidadeEmprestada < limiteEmprestimo();
    }

    void registrarEmprestimo() {
        quantidadeEmprestada++;
    }

    void registrarDevolucao() {
        quantidadeEmprestada--;
    }
};
