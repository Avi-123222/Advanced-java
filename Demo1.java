import java.sql.*;

public class Demo1 {
    public static void main(String args[]) {
        Connection cn = null;
        Statement st = null;

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to Oracle Database
            cn = DriverManager.getConnection(
                "jdbc:oracle:thin:@127.0.0.1:1521:XE", "system", "root");

            // Create statement
            st = cn.createStatement();

            // Create table
            st.execute("CREATE TABLE j_stud (roll NUMBER(3), name VARCHAR2(20))");
            System.out.println("Table is created.");

            // Insert rows
            st.executeUpdate("INSERT INTO j_stud VALUES(101, 'Amit Kumar')");
            st.executeUpdate("INSERT INTO j_stud VALUES(102, 'Vinod Kumar')");
            st.executeUpdate("INSERT INTO j_stud VALUES(103, 'Chetan Kumar')");
            st.executeUpdate("INSERT INTO j_stud VALUES(104, 'Deepak Kumar')");
            st.executeUpdate("INSERT INTO j_stud VALUES(105, 'Ajaj Ahmad')");
            System.out.println("Rows are inserted.");

            // Retrieve data
            System.out.println("Retrieving data from the table:\n");
            ResultSet rs = st.executeQuery("SELECT * FROM j_stud");
            while (rs.next()) {
                int n = rs.getInt("roll");
                String s = rs.getString("name");
                System.out.println("Roll Number: " + n + ", Name: " + s);
            }

            // Update a row
            st.executeUpdate("UPDATE j_stud SET name='Sagar Anand' WHERE roll=105");
            System.out.println("A row is updated.");

            // Delete a row
            st.executeUpdate("DELETE FROM j_stud WHERE roll=104");
            System.out.println("A row is deleted.");

        } catch (ClassNotFoundException cf) {
            System.out.println("Oracle JDBC Driver not found.");
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
