import java.util.LinkedList;

public class HistNavegacao {
    private LinkedList<String> historico = new LinkedList<>();
    private int atual = -1;


    public void visitar(String url) {
        while (historico.size() > atual + 1) {
            historico.removeLast();
        }
        historico.add(url);
        atual++;
        System.out.println("Visitando: " + url);
    }

    public void voltar() {
        if (atual > 0) {
            atual--;
            System.out.println("Voltando para: " + historico.get(atual));
        } else {
            System.out.println("Nao ha pagina anterior.");
        }
    }

    public void avancar() {
        if (atual < historico.size() - 1) {
            atual++;
            System.out.println("Avancando para: " + historico.get(atual));
        } else {
            System.out.println("Nao ha proxima pagina.");
        }
    }

    public void paginaAtual() {
        if (atual >= 0) {
            System.out.println("Pagina atual: " + historico.get(atual));
        } else {
            System.out.println("Nenhuma pagina aberta.");
        }
    }

    public static void main(String[] args) {
        HistNavegacao navegador = new HistNavegacao();

        navegador.visitar("google.com");
        navegador.visitar("youtube.com");
        navegador.visitar("github.com");

        navegador.voltar();
        navegador.voltar();
        navegador.avancar();
        navegador.visitar("stackoverflow.com");

        navegador.voltar();
        navegador.paginaAtual();
    }
}
