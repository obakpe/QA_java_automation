package JDBC;

public class calls {
    public static void main(String[] args) {
        JDBC.Operations operations = new Operations();

        //  String selectQuery = "SELECT * FROM qaauto";
        //  operations.readData(selectQuery);

       // String insertQuery = "INSERT INTO QAAUTO(name,email,class)" +
          //      "VALUES('Johnson Dele','d.jhson@gmail.com','QA OCT 2023')";
        //operations.writeData(insertQuery);

        //   String deleteQuery ="DELETE FROM qaauto WHERE id = name;");
        // operations.deleteData(deleteQuery);

       String updateQuery = "UPDATE qaauto set name = 'Willow'  WHERE  id= 2";
        operations.updateData(updateQuery);

        connection.closeConnection();
    }
}
