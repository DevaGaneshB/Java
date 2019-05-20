package dbsample;

import org.apache.axis2.context.MessageContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDBService {

    public Person[] listAllPeople() {
        Connection conn = (Connection) MessageContext.getCurrentMessageContext().getProperty(
                DBSampleServiceLifeCycle.DB_CONNECTION);
        if(conn !=null) {
            String SQL = "SELECT * FROM PERSON";
            try {
                PreparedStatement statement = conn.prepareStatement(SQL);
                ResultSet result = statement.executeQuery();
                ArrayList list = new ArrayList();
                while (result.next()) {
                    Person person = new Person();
                    person.setId(result.getInt("ID"));
                    person.setName(result.getString("NAME"));
                    person.setAddress(result.getString("ADDRESS"));
                    person.setAge(result.getInt("AGE"));
                    list.add(person);
                }
                return (Person[])list.toArray(new Person[list.size()]);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public String[] listPeopleNames() {
        Connection conn = (Connection) MessageContext.getCurrentMessageContext().getProperty(
                DBSampleServiceLifeCycle.DB_CONNECTION);
        if(conn !=null) {
            String SQL = "SELECT NAME FROM PERSON";
            try {
                PreparedStatement statement = conn.prepareStatement(SQL);
                ResultSet result = statement.executeQuery();
                ArrayList list = new ArrayList();
                while (result.next()) {
                    list.add(result.getString("NAME"));
                }
                return (String[])list.toArray(new String[list.size()]);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public NameAge getNameAge(int id) {
        Connection conn = (Connection) MessageContext.getCurrentMessageContext().getProperty(
                DBSampleServiceLifeCycle.DB_CONNECTION);
        if(conn !=null) {
            String SQL = "SELECT NAME , AGE FROM PERSON WHERE ID=?";
            try {
                PreparedStatement statement = conn.prepareStatement(SQL);
                statement.setInt(1, id);
                ResultSet result = statement.executeQuery();
                if (result.next()) {
                    NameAge nameAge = new NameAge();
                    nameAge.setName(result.getString("NAME"));
                    nameAge.setAge(result.getInt("AGE"));
                    return nameAge;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void insertPerson(int id,
                             String name,
                             String address,
                             int age) {
         Connection conn = (Connection) MessageContext.getCurrentMessageContext().getProperty(
                DBSampleServiceLifeCycle.DB_CONNECTION);
        if(conn !=null) {
            String SQL = "INSERT INTO PERSON (ID , NAME , ADDRESS , AGE) VALUES (?,?,?,?)";
            try {
                PreparedStatement statement = conn.prepareStatement(SQL);
                statement.setInt(1,id);
                statement.setString(2,name);
                statement.setString(3,address);
                statement.setInt(4,age);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
