package structural.facade;

/**
 * Created by nitish.s on 07/07/19.
 */
import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("MySQL PDF Report Generated");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("MySQL HTML Report Generated");
    }
}
