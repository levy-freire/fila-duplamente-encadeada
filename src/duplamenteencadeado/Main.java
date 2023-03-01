package duplamenteencadeado;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhhalistaencadeada = new ListaDuplamenteEncadeada<>();

        minhhalistaencadeada.add("c1");
        minhhalistaencadeada.add("c2");
        minhhalistaencadeada.add("c3");
        minhhalistaencadeada.add("c4");
        minhhalistaencadeada.add("c5");
        minhhalistaencadeada.add("c6");
        minhhalistaencadeada.add("c7");

        System.out.println(minhhalistaencadeada);

        minhhalistaencadeada.remove(3);
        minhhalistaencadeada.add(3, "99");
        //testando o metodo add e remove

        System.out.println(minhhalistaencadeada);
        System.out.println(minhhalistaencadeada.get(3));

    }
}
