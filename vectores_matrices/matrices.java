package vectores_matrices;

public class matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = j;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}