public class Livro extends itemBiblioteca {

    public Livro(int codigo, String titulo) {
        super(codigo, titulo);
    }

    @Override
    public int prazoEmprestimo() {
        return 14;
    }

    @Override
    public double multaPorDia() {
        return 0.50;
    }

    @Override
    public String getTipo() {
        return "Livro";
    };
};
