import java.util.LinkedList;

public class FilaImpressao {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<String>();
        fila.add("Documento1.pdf");
        fila.add("Foto.png");
        fila.add("Pagina33.jpeg");
        fila.add("logo.jpg");
        fila.add("Documento6.pdf");

        int tam = fila.size();
        for(int i=0; i<tam; i++){
            String removido = fila.getFirst();
            fila.removeFirst();
            System.out.println("O documento " + removido + " foi impresso com sucesso!\n");
        }
    }
}
