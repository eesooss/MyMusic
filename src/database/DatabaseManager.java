package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
    private DatabaseConfiguration config;

    public DatabaseManager(DatabaseConfiguration config) {
        this.config = config;
    }

    public void addToDatabase(Song song) throws SQLException {
        Connection connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
        PreparedStatement statement = connection.prepareStatement("INSERT INTO song (name) VALUES (?)");

        statement.setString(1, song.getAuthorName());
        statement.setString(2, song.getAlbumName());
        statement.setString(3, song.getSongName());
        statement.executeUpdate();

        statement.close();
        connection.close();
    }

}
