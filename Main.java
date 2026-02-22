public class Main {
    private static final String DEFAULT_NAME = "Mundo";

    public static void main(String[] args) {
        String name = (args.length > 0 && !args[0].isBlank()) ? args[0].trim() : DEFAULT_NAME;
        System.out.printf("Hola, %s!%n", name);
    }
}
