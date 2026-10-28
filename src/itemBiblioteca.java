public abstract class itemBiblioteca {
    private int codigo;
    private String titulo;
    private boolean disponivel;

    public itemBiblioteca(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public abstract int prazoEmprestimo();
    public abstract double multaPorDia();
    public abstract String getTipo();

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    void marcarEmprestado() {
        this.disponivel = false;
    }

    void  marcarDevolvido() {
        this.disponivel = true;
    }

    public void exibirDados() {
        System.out.println(
                "Código: " + codigo
                        + "| Tipo: "  + getTipo()
                        + " | Título: " + titulo
                        + " | Disponível: " + disponivel
                        + " | Prazo: " + prazoEmprestimo() + " dias"
                        + " | Multa: R$ " + String.format("%.2f", multaPorDia())
        );
    };
};
