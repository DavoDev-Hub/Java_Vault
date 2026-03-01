import Metodos_Atributos.CuentaBancaria;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria Cuenta0001 = new CuentaBancaria("Cuenta0001",
                "Juan Pablo Jiménez", 500.0);
        CuentaBancaria Cuenta0002 = new CuentaBancaria("Cuenta0002",
                "Amigo", 800.0);

        // Mostrar informacion primera vez
        Cuenta0001.mostrarInformacion();
        System.out.println();
        Cuenta0002.mostrarInformacion();

        System.out.println();

        // Cambiar el titular a la cuenta
        Cuenta0002.setTitular("Braulio Lucio Cuellar");
        Cuenta0002.mostrarInformacion();

        System.out.println();
        // Depositar a la cuenta
        Cuenta0002.depositar(500);
        Cuenta0002.mostrarInformacion();

        System.out.println();
        // Retirar a la cuenta
        Cuenta0002.retirar(300);
        Cuenta0002.mostrarInformacion();

        System.out.println();
        // Retirar a la cuenta
        Cuenta0002.transferir(Cuenta0001, 200);
        Cuenta0002.mostrarInformacion();
        Cuenta0001.mostrarInformacion();
    }
}
