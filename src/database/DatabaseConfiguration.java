package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseConfiguration {
    private String url;
    private String username;
    private String password;

    public DatabaseConfiguration(String configFile) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(configFile));

        this.url = props.getProperty("url");
        this.username = props.getProperty("username");
        this.password = props.getProperty("password");
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
