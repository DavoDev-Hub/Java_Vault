package foodapp.config;

import java.io.InputStream;
import java.util.Properties;

public final class AppConfig {

    private static final Properties properties = new Properties();

    static {

        try {

            InputStream input =
                    AppConfig.class.getClassLoader()
                            .getResourceAsStream("app.properties");

            if (input == null) {
                throw new RuntimeException("app.properties not found");
            }

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Could not load properties file", e);
        }

    }

    public static String getAppName() {
        return properties.getProperty("app.name");
    }

    public static int getMaxProductsPerOrder() {
        return Integer.parseInt(properties.getProperty("app.maxProductsPerOrder"));
    }

    public static String getCurrency() {
        return properties.getProperty("currency");
    }

}