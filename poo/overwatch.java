package poo;

public class overwatch {
    public static class Heroe {

        private String nombre;
        private int vida;
        private int daño;

        public Heroe(String nombre, int vida, int daño) {
            this.nombre = nombre;
            this.vida = vida;
            this.daño = daño;
        }

        public String getNombre() {
            return nombre;
        }

        public int getVida() {
            return vida;
        }

        public int getDaño() {
            return daño;
        }

        public void atacar() {
            System.out.println(nombre + " ataca causando " + daño + " de daño.");
        }

        public void habilidadEspecial() {
            System.out.println(nombre + " usa una habilidad especial.");
        }

        public void mostrarInfo() {
            System.out.println("Heroe: " + nombre);
            System.out.println("Vida: " + vida);
            System.out.println("Daño: " + daño);
        }
    }

    public static class Tanque extends Heroe {

        private int armadura;

        public Tanque(String nombre, int vida, int daño, int armadura) {
            super(nombre, vida, daño);
            this.armadura = armadura;
        }

        @Override
        public void habilidadEspecial() {
            System.out.println(getNombre() + " activa escudo con " + armadura + " puntos de armadura.");
        }
    }

    public static class DPS extends Heroe {

        public DPS(String nombre, int vida, int daño) {
            super(nombre, vida, daño);
        }

        @Override
        public void habilidadEspecial() {
            System.out.println(getNombre() + " lanza un ataque devastador!");
        }
    }

    public static class Soporte extends Heroe {

        private int curacion;

        public Soporte(String nombre, int vida, int daño, int curacion) {
            super(nombre, vida, daño);
            this.curacion = curacion;
        }

        @Override
        public void habilidadEspecial() {
            System.out.println(getNombre() + " cura a su equipo con " + curacion + " puntos de vida.");
        }
    }

}
