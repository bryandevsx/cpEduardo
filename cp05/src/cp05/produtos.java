package cp05;

public class produtos {
    public static void main(String[] args) {
        String[][] produtos = {
            {"Macbook Air", "Macbook Pro"},
            {"Dell XPS", "Lenovo"},
            {"Samsung 360"}
        };

        int totalElementos = 0;
        for (String[] linha : produtos) {
            totalElementos += linha.length;
        }

        System.out.println("Quantidade total de elementos na matriz: " + totalElementos);
    }
}