
public class Vetor {
    private int[] A;        // Vetor para armazenar elementos
    private int capacity;   // Capacidade máxima
    private int size;       // Número de elementos inseridos

    public Vetor(int capacity) {
        A = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int get(int i) throws Exception {
        if (i < 0 || i >= size) throw new Exception("Índice inválido");
        return A[i];
    }

    public int set(int i, int n) throws Exception {
        if (i < 0 || i >= size) throw new Exception("Índice inválido");
        int antigo = A[i];
        A[i] = n;
        return antigo;
    }

    public void add(int i, int n) throws Exception {
        if (size == capacity) throw new Exception("Vetor cheio");
        if (i < 0 || i > size) throw new Exception("Índice inválido");
        for (int j = size - 1; j >= i; j--) {
            A[j + 1] = A[j];
        }
        A[i] = n;
        size++;
    }

    public void remove(int i) throws Exception {
        if (i < 0 || i >= size) throw new Exception("Índice inválido");
        for (int j = i; j < size - 1; j++) {
            A[j] = A[j + 1];
        }
        size--;
    }

    public int search(int n) {
        for (int i = 0; i < size; i++) {
            if (A[i] == n) return i;
        }
        return -1;
    }
}