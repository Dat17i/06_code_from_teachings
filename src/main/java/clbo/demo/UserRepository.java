package clbo.demo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepository {

    ArrayList<Person> persons;

    private Connection conn;
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public UserRepository() {
        this.conn = DbConnection.getConnection();
    }

    public ArrayList<Person> readAll() {

        try {

            preparedStatement = conn.prepareStatement("select * from users");
            result = preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {

            while (result.next()) {
                persons.add(new Person(result.getInt("id"),
                        result.getString("user_name"),
                        result.getString("email"),
                        result.getString("password")));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persons;
    }


}
