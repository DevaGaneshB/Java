package dbsample;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.engine.ServiceLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBSampleServiceLifeCycle implements ServiceLifeCycle {
    public static final String DB_CONNECTION = "dbconnection";

    public void startUp(ConfigurationContext configctx, AxisService service) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Creating the DB connection for the sample DB
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsample",
                    "root",
                    "");
            //Storing the DB in the ConfigurationContext
            configctx.setProperty(DB_CONNECTION, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void shutDown(ConfigurationContext configctx, AxisService service) {
        Connection conn = (Connection) configctx.getProperty(DB_CONNECTION);
        if (conn != null) {
            try {
                // closing the DB
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error while closing the DB connection");
            }
        }
    }
}
