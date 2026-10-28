public class Dvd extends itemBiblioteca {

    public Dvd(int codigo, String titulo) {
        super(codigo, titulo);
    }

    @Override
    public int prazoEmprestimo() {
        return 10;
    }

    @Override
    public double multaPorDia() {
        return 2.00;
    }

    @Override
    public String getTipo() {
        return "DVD";
    };
};
