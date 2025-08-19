import java.util.LinkedHashSet;
import java.util.Set;

public class DiasSemana{
    public static void main(String[] args){
        Set<String> dias = new LinkedHashSet<>();
        dias.add("Quarta");
        dias.add("Segunda");
        dias.add("Sexta");
        dias.add("Quinta");
        dias.add("Terca");

        for (String dia : dias) {
            System.out.println(dia);
        }
    }
}
