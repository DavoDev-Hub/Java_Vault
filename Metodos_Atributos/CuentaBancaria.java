package Metodos_Atributos;

public class CuentaBancaria {
    // ------ Atributos ------
    private String numeroCuenta;
    private String titular;
    private double saldo = 0.0;

    // ------ Constructores ------
    public CuentaBancaria(String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // ------ Getters ------
    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    // ------ Setters ------
    public void setTitular( String nuevoTitular){
        System.out.println("Cambiando titular de " + this.titular + " a " + nuevoTitular );
        this.titular = nuevoTitular;
    }

    // ------ Metodos de comportamiento ------
    public void depositar(double cantidad){
        if(cantidad > 0){
            System.out.println("Depositando...");
            this.saldo += cantidad;
        }else{
            System.out.println("Error");
        }
    }

    public void retirar(double cantidad){
        if(cantidad > 0 && cantidad <= this.saldo){
            this.saldo -= cantidad;
            System.out.println("Retirando " + cantidad + " ...");
        }else{
            System.out.println("Fondos insuficientes");
        }
    }

    public void mostrarInformacion(){
        System.out.println("--- Cuenta " + numeroCuenta + " ---");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
    public void transferir(CuentaBancaria destino, double cantidad){
        this.saldo -= cantidad;
        System.out.println("Transfiriendo "+ cantidad + "...");
        destino.depositar(cantidad);
    }
}
