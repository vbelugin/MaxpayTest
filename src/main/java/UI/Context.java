package UI;

import java.util.ResourceBundle;

public class Context {
    public static final String baseUrl = getProperty("sandbox.url");
    public static final String login = getProperty("sandbox.login");
    public static final String password = getProperty("sandbox.password");

    private static String getProperty(String key) {
        ResourceBundle rb = ResourceBundle.getBundle("maxpay");
        return rb.getString(key);
    }
}
