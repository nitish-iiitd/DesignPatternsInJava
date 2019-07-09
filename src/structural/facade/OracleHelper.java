package structural.facade;

/**
 * Created by nitish.s on 07/07/19.
 */
import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("Oracle PDF Report Generated");
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("Oracle HTML Report Generated");
    }

}
