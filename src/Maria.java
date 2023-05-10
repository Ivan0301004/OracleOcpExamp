import java.sql.*;

public class Maria {
    public static void main(String[] args) {

        try (Connection conDB = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/Nuevo",
                "root", "Fatima18@77"); Statement statement = conDB.createStatement(); ResultSet query =
                     statement.executeQuery("Select * from test")) {

            // Retrieving some values from table test
            while (query.next()) {
                System.out.println(
                        query.getString("Name") + "\t\t" +
                                query.getDouble("Price"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}