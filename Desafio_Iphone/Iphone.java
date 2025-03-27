// Interface para Reprodutor Musical
interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);

    void atender();

    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}

// Classe que representa o iPhone e implementa todas as interfaces
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando a música: " + musica);
    }

    // Implementação dos métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos do Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
