public class TesteVetor {
    public static void main(String[] args) {
        Vetor lista = new Vetor(5);
        try {
            lista.add(0, 10); // [10]
            lista.add(1, 20); // [10, 20]
            lista.add(2, 30); // [10, 20, 30]
            lista.add(1, 15); // [10, 15, 20, 30]
            System.out.println("Lista após inserções:");
            for (int i = 0; i < lista.size(); i++)
                System.out.print(lista.get(i) + " ");
            System.out.println();

            lista.remove(2); // Remove o elemento na posição 2: [10, 15, 30]
            System.out.println("Lista após remoção:");
            for (int i = 0; i < lista.size(); i++)
                System.out.print(lista.get(i) + " ");
            System.out.println();

            int idx = lista.search(30);
            System.out.println("Índice do elemento 30: " + idx);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}