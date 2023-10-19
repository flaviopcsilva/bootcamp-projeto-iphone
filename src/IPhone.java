// Interface para um Reprodutor Musical
interface ReprodutorMusical {
    void reproduzirMusica(String musica);

    void pausarMusica();

    void pararMusica();
}

// Interface para um Aparelho Telefônico
interface AparelhoTelefonico {
    void fazerLigacao(String numero);

    void receberLigacao(String numero);

    void encerrarLigacao();
}

// Interface para um Navegador na Internet
interface NavegadorInternet {
    void abrirPagina(String url);

    void fecharPagina();

    void navegarHistorico();
}

// Classe que representa um iPhone, que implementa as interfaces acima
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação das operações de ReprodutorMusical
    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Pausando música.");
    }

    public void pararMusica() {
        System.out.println("Parando música.");
    }

    // Implementação das operações de AparelhoTelefonico
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
    }

    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligação de: " + numero);
    }

    public void encerrarLigacao() {
        System.out.println("Encerrando ligação.");
    }

    // Implementação das operações de NavegadorInternet
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void fecharPagina() {
        System.out.println("Fechando página.");
    }

    public void navegarHistorico() {
        System.out.println("Navegando pelo histórico.");
    }

    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Exemplos de uso das funcionalidades
        iphone.reproduzirMusica("Música 1");
        iphone.fazerLigacao("123-456-789");
        iphone.abrirPagina("https://www.example.com");
    }
}
