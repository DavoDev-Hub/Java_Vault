package vectores_matrices;

import java.util.Scanner;

public class m {
    private static final double EPS = 1e-10;

    // Método para mostrar una matriz
    public static void mostrarMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double elemento : fila) {
                System.out.printf("%10.4f ", elemento);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para multiplicar matrices
    public static double[][] multiplicar(double[][] A, double[][] B) {
        if (A.length == 0 || B.length == 0 || A[0].length != B.length) {
            throw new IllegalArgumentException("Dimensiones incompatibles para multiplicacion.");
        }

        int filas = A.length;
        int columnas = B[0].length;
        int comun = A[0].length;
        double[][] resultado = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < comun; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return resultado;
    }

    // Método para calcular la inversa usando Gauss-Jordan
    public static double[][] inversa(double[][] matriz) {
        if (matriz.length == 0 || matriz.length != matriz[0].length) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada y no vacia.");
        }

        int n = matriz.length;
        double[][] aumentada = new double[n][2*n];

        // Crear matriz aumentada [A | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aumentada[i][j] = matriz[i][j];
            }
            aumentada[i][i + n] = 1;
        }

        // Aplicar Gauss-Jordan
        for (int i = 0; i < n; i++) {
            int filaPivote = i;
            double maxAbs = Math.abs(aumentada[i][i]);
            for (int fila = i + 1; fila < n; fila++) {
                double valorAbs = Math.abs(aumentada[fila][i]);
                if (valorAbs > maxAbs) {
                    maxAbs = valorAbs;
                    filaPivote = fila;
                }
            }

            if (maxAbs < EPS) {
                throw new ArithmeticException("La matriz no es invertible.");
            }

            if (filaPivote != i) {
                double[] tmp = aumentada[i];
                aumentada[i] = aumentada[filaPivote];
                aumentada[filaPivote] = tmp;
            }

            double pivote = aumentada[i][i];

            // Normalizar fila
            for (int j = 0; j < 2*n; j++) {
                aumentada[i][j] /= pivote;
            }

            // Hacer ceros en columna
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aumentada[k][i];
                    if (Math.abs(factor) < EPS) {
                        continue;
                    }
                    for (int j = 0; j < 2*n; j++) {
                        aumentada[k][j] -= factor * aumentada[i][j];
                    }
                }
            }
        }

        // Extraer inversa
        double[][] inversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(aumentada[i], n, inversa[i], 0, n);
        }

        return inversa;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese tamaño de la matriz (N): ");
            int n = sc.nextInt();

            double[][] matriz = new double[n][n];

            System.out.println("Ingrese los elementos de la matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = sc.nextDouble();
                }
            }

            System.out.println("\nMatriz original:");
            mostrarMatriz(matriz);

            try {
                double[][] inv = inversa(matriz);

                System.out.println("Matriz inversa:");
                mostrarMatriz(inv);

                System.out.println("Verificacion (A * A^-1):");
                double[][] identidad = multiplicar(matriz, inv);
                mostrarMatriz(identidad);

            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
