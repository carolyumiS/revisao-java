import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " (" + nota + ")";
    }
}

public class AgruparAlunos {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Carolina", 7.0));
        alunos.add(new Aluno("Celine", 6.5));
        alunos.add(new Aluno("Gabriel", 9.2));
        alunos.add(new Aluno("Diogo", 5.0));
        alunos.add(new Aluno("Fulano", 4.2));
        alunos.add(new Aluno("Betina", 3.8));

        Map<String, List<Aluno>> grupos = new HashMap<>();
        grupos.put("Aprovados", new ArrayList<>());
        grupos.put("Recuperacao", new ArrayList<>());
        grupos.put("Reprovados", new ArrayList<>());

        for (Aluno a : alunos) {
            if (a.nota >= 7) {
                grupos.get("Aprovados").add(a);
            } else if (a.nota >= 5) {
                grupos.get("Recuperacao").add(a);
            } else {
                grupos.get("Reprovados").add(a);
            }
        }

        for (String categoria : grupos.keySet()) {
            System.out.println(categoria + ": " + grupos.get(categoria));
        }
    }
}
