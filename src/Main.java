import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("caderno", 18.90, 40));
        produtos.add(new Produto("caneta", 3.50, 120));
        produtos.add(new Produto("mochila", 149.00, 15));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        String nomeBuscado = "mochila";
        boolean existe = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeBuscado)) {
                existe = true;
                break;
            }
        }
        System.out.println(nomeBuscado + " esta no catalogo? " + existe);

        nomeBuscado = "lapis";
        existe = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeBuscado)) {
                existe = true;
                break;
            }
        }
        System.out.println(nomeBuscado + " esta no catalogo? " + existe);
    }
}
