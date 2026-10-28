public class Revista extends itemBiblioteca {

    public Revista(int codigo, String titulo) {
        super(codigo, titulo);
    };

    @Override
    public int prazoEmprestimo() {
        return 7;
    };

    @Override
    public double multaPorDia() {
        return 1.00;
    };

    @Override
    public String getTipo() {
        return "Revista";
    };

};
