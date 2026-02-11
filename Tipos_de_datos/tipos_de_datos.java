package Tipos_de_datos;

public class tipos_de_datos {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        // Fundamentales y almacenan valores simples directamente en la memoria

        byte diasMes = 31;
            // Talla: 8-bit
            // Intervalo: de -128 a 127
            // Utilización: Almacenamiento eficiente en memoria en grandes matrices.\

        short diasLustro = (12 * 31) *5;
            // Talla: 16-bit
            // Intervalo: de -32.768 a 32.767
            // Utilización: Adecuado para ahorrar memoria en grandes matrices.

        int velocidadLuz = 299792458;
            // Talla: 32 bits
            // Intervalo: -231 a231-1
            // Utilización: Opción por defecto para valores enteros.

        long añoLuz = velocidadLuz * 365;
            // Talla: 64 bits
            // Intervalo: -263 a263-1
            // Utilización: Para valores enteros grandes.

        float f = 234.5f;
            // Talla: 32 bits
            // Utilización: Para números fraccionarios, con precisión única.

        double d = 123.4;
            // Talla: 64 bits
            // Utilización: Para números fraccionarios, con doble precisión.

        boolean flag = true;
            // Valores: true o false

        char c = 'A';
            // Talla: 16-bit
            // Alcance: 0 a 65.535 (caracteres Unicode)
            // Utilización: Para almacenar caracteres.

    }
}