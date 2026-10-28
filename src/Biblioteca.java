public class Biblioteca {

    private itemBiblioteca[] acervo;
    private Usuario[] usuarios;
    private Usuario[] responsaveis;
    private int totalItens;
    private int totalUsuarios;

    public Biblioteca(int capacidadeItens, int capacidadeUsuarios) {
        acervo = new itemBiblioteca[capacidadeItens];
        usuarios = new Usuario[capacidadeUsuarios];
        responsaveis = new Usuario[capacidadeItens];

        totalItens = 0;
        totalUsuarios = 0;
    }

    public void cadastrarItem(itemBiblioteca item){
        if(totalItens < acervo.length){
            acervo[totalItens] = item;
            totalItens++;
        } else {
            System.out.println("Acervo cheio!");
        }
    }

    public void cadastrarUsuario(Usuario usuario){
        if(totalUsuarios < usuarios.length){
            usuarios[totalUsuarios] = usuario;
            totalUsuarios++;
        } else{
            System.out.println("Limite de usuários atingido!");
        }
    }

    private Usuario buscarUsuario(String nome) {
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarios[i].getNome().equalsIgnoreCase(nome)) {
                return usuarios[i];
            }
        }
        return null;
    }

    private int buscarIndiceItem(int codigo) {
        for (int i = 0; i < totalItens; i++) {
            if (acervo[i].getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }

    public void emprestar(int codigo, String nomeUsuario) {
        int indice = buscarIndiceItem(codigo);
        Usuario usuario = buscarUsuario(nomeUsuario);

        if (indice == -1 || usuario == null) {
            System.out.println("Item ou usuário não encontrado.");
            return;
        }

        itemBiblioteca item = acervo[indice];

        if (!item.isDisponivel()) {
            System.out.println("Item indisponível.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Limite de empréstimos atingido.");
            return;
        }

        item.marcarEmprestado();
        usuario.registrarEmprestimo();
        responsaveis[indice] = usuario;

        System.out.println(
                "Empréstimo realizado: " + item.getTitulo()
                 + " para " + usuario.getNome()
        );
    }

    public void devolver(int codigo, String nomeUsuario) {
        int indice = buscarIndiceItem(codigo);
        Usuario usuario = buscarUsuario(nomeUsuario);

        if (indice == -1 || usuario == null) {
            System.out.println("Item ou usuário não encontrado.");
            return;
        }

        itemBiblioteca item = acervo[indice];

        if (item.isDisponivel() || responsaveis[indice] != usuario) {
            System.out.println(
                    "Esse usuário não possui o empréstimo informado."
            );
            return;
        }

        item.marcarDevolvido();
        usuario.registrarDevolucao();
        responsaveis[indice] = null;

        System.out.println(
                "Devolução realizada: " + item.getTitulo()
                + " por "  + usuario.getNome()
        );
    }

    public void listarAcervo() {
        System.out.println("\n=== ACERVO DA BIBLIOTECA ===");

        for (int i = 0; i < totalItens; i++) {
            acervo[i].exibirDados();
        }
    }
}
