package vectores_matrices;

public class vectores {
    public static void main(String[] args) {
        int[] vector = new int [4];
        vector[0] = 2;
        vector[1] = 4;
        vector[2] = 6;
        vector[3] = 8;

        for (int j : vector) {
            System.out.println(j);
        }
    }
}