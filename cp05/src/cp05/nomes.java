package cp05;

import java.util.ArrayList;
import java.util.List;

public class nomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Nome1");
        nomes.add("Nome2");
        nomes.add("Nome3");
        nomes.add("Nome4");
        nomes.add("Nome5");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
